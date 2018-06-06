package com.deepoove.swagger.dubbo.http;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.deepoove.swagger.dubbo.reader.NameDiscover;

import io.swagger.annotations.ApiOperation;
import io.swagger.models.HttpMethod;
import io.swagger.util.ReflectionUtils;

public class HttpMatch {

	private static Logger logger = LoggerFactory.getLogger(HttpMatch.class);

	private Class<?> interfaceClass;
	private Class<?> refClass;

	public HttpMatch(Class<?> interfaceClass, Class<?> refClass) {
		this.interfaceClass = interfaceClass;
		this.refClass = refClass;
	}

	public Method[] findInterfaceMethods(String methodName) {
		Method[] methods = interfaceClass.getMethods();
		List<Method> ret = new ArrayList<Method>();
		for (Method method : methods) {
			if (method.getName().equals(methodName)) ret.add(method);
		}
		return ret.toArray(new Method[] {});
	}

	public Method[] findRefMethods(Method[] interfaceMethods, String operationId,
			String requestMethod) {
		List<Method> ret = new ArrayList<Method>();
		for (Method method : interfaceMethods) {
			Method m;
			try {
				m = refClass.getMethod(method.getName(), method.getParameterTypes());
				final ApiOperation apiOperation = ReflectionUtils.getAnnotation(m,
						ApiOperation.class);
				String nickname = null == apiOperation ? null : apiOperation.nickname();
				if (operationId != null) {
					if (!operationId.equals(nickname)) continue;
				} else {
					if (StringUtils.isNotBlank(nickname)) continue;
				}
				if (requestMethod != null) {
					String httpMethod = null == apiOperation ? null : apiOperation.httpMethod();
					if (StringUtils.isNotBlank(httpMethod) && !requestMethod.equals(httpMethod))
						continue;
					if (StringUtils.isBlank(httpMethod)
							&& !requestMethod.equalsIgnoreCase(HttpMethod.POST.name()))
						continue;
				}
				ret.add(m);
			} catch (NoSuchMethodException e) {
				logger.error("NoSuchMethodException", e);
			} catch (SecurityException e) {
				logger.error("SecurityException", e);
			}
		}
		return ret.toArray(new Method[] {});
	}

	public Method matchRefMethod(Method[] refMethods, String methodName, Set<String> keySet) {
		if (refMethods.length == 0) { return null; }
		if (refMethods.length == 1) { return refMethods[0]; }

		List<RateMethod> rateMethods = new ArrayList<RateMethod>();
		for (Method method : refMethods) {
			String[] parameterNames = NameDiscover.parameterNameDiscover
					.getParameterNames(method);
			if (parameterNames == null) return method;
			float correctRate = 0.0f;
			int hit = 0;
			int error = 0;
			for (String paramName : parameterNames) {
				if (keySet.contains(paramName)) hit++;
				else error++;
			}
			correctRate = error / (float) hit;

			rateMethods.add(new RateMethod(method, (int) correctRate * 100));

		}

		if (rateMethods.isEmpty()) return null;
		Collections.sort(rateMethods, new Comparator<RateMethod>() {
			@Override
			public int compare(RateMethod o1, RateMethod o2) {
				return o2.getRate() - o1.getRate();
			}
		});

		return rateMethods.get(0).getMethod();
	}

	class RateMethod {
		private Method method;
		private int rate;

		public RateMethod(Method method, int rate) {
			this.method = method;
			this.rate = rate;
		}

		public Method getMethod() {
			return method;
		}

		public void setMethod(Method method) {
			this.method = method;
		}

		public int getRate() {
			return rate;
		}

		public void setRate(int rate) {
			this.rate = rate;
		}

	}

}
