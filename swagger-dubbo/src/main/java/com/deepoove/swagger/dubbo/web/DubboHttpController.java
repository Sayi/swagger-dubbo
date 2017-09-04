package com.deepoove.swagger.dubbo.web;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deepoove.swagger.dubbo.config.DubboServiceScanner;
import com.deepoove.swagger.dubbo.http.HttpMatch;
import com.deepoove.swagger.dubbo.reader.DubboReaderExtension;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.swagger.annotations.Api;
import io.swagger.util.Json;
import io.swagger.util.PrimitiveType;

@Controller
@RequestMapping("${swagger.dubbo.http:h}")
@Api(hidden = true)
public class DubboHttpController {

	private static Logger logger = LoggerFactory.getLogger(DubboHttpController.class);

	@Autowired
	private DubboServiceScanner dubboServiceScanner;

	@Value("${swagger.dubbo.annotation.class:true}")
	private boolean classAnotation = true;

	@Value("${swagger.dubbo.enable:true}")
	private boolean enable = true;

	@RequestMapping(value = "/{interfaceClass}/{methodName}", produces = "application/json; charset=utf-8")
	@ResponseBody
	public ResponseEntity<String> invokeDubbo(@PathVariable("interfaceClass") String interfaceClass,
			@PathVariable("methodName") String methodName, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return invokeDubbo(interfaceClass, methodName, null, request, response);
	}

	@RequestMapping(value = "/{interfaceClass}/{methodName}/{operationId}", produces = "application/json; charset=utf-8")
	@ResponseBody
	public ResponseEntity<String> invokeDubbo(@PathVariable("interfaceClass") String interfaceClass,
			@PathVariable("methodName") String methodName,
			@PathVariable("operationId") String operationId, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		if (!enable) { return new ResponseEntity<String>(HttpStatus.NOT_FOUND); }

		Method method = null;
		Object invoke = null;
		// find ref class
		Map<Class<?>, Object> interfaceMapRef = dubboServiceScanner.interfaceMapRef();
		Set<Entry<Class<?>, Object>> entrySet = interfaceMapRef.entrySet();
		for (Entry<Class<?>, Object> entry : entrySet) {
			Class<?> key = entry.getKey();
			if (key.getName().equals(interfaceClass)) {
				HttpMatch httpMatch = new HttpMatch(entry.getKey(), entry.getValue().getClass());
				Method[] interfaceMethods = httpMatch.findInterfaceMethods(methodName);

				if (null != interfaceMethods && interfaceMethods.length > 0) {
					Method[] refMethods = httpMatch.findRefMethods(interfaceMethods, operationId,
							request.getMethod());
					method = httpMatch.matchRefMethod(refMethods, methodName, request.getParameterMap().keySet());
				}
				if (null == method) {
					return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
				}
				// invoke method
				logger.debug("[Swagger-dubbo] Invoke dubbo service method:{},parameter:{}", method,
						Json.pretty(request.getParameterMap()));
				String[] parameterNames = DubboReaderExtension.parameterNameDiscover
						.getParameterNames(method);
				if (null == parameterNames || parameterNames.length == 0) {
					invoke = method.invoke(entry.getValue());
				} else {
					List<Object> args = new ArrayList<Object>();
					Type[] parameterTypes = method.getGenericParameterTypes();
					Class<?>[] parameterClazz = method.getParameterTypes();

					for (int i = 0; i < parameterNames.length; i++) {
						Object suggestPrameterValue = suggestPrameterValue(parameterTypes[i],
								parameterClazz[i], request.getParameter(parameterNames[i]));
						args.add(suggestPrameterValue);
					}
					invoke = method.invoke(entry.getValue(), args.toArray());
				}
				break;
			}
		}

		return ResponseEntity.ok(Json.mapper().writeValueAsString(invoke));
	}

	private Object suggestPrameterValue(Type type, Class<?> cls, String parameter)
			throws JsonParseException, JsonMappingException, IOException {
		PrimitiveType fromType = PrimitiveType.fromType(type);
		if (null != fromType) {
			DefaultConversionService service = new DefaultConversionService();
			boolean actual = service.canConvert(String.class, cls);
			if (actual) { return service.convert(parameter, cls); }
		} else {
			if (null == parameter) return null;
			Object obj = Json.mapper().readValue(parameter, cls);
			return obj;
		}
		try {
			return Class.forName(cls.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
