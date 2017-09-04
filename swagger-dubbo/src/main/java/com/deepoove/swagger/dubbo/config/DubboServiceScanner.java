package com.deepoove.swagger.dubbo.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.spring.ServiceBean;

import io.swagger.config.Scanner;

@Component
public class DubboServiceScanner implements Scanner {

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Set<Class<?>> classes() {
		Map<?, ServiceBean> serviceBeans = ServiceBean.getSpringContext()
				.getBeansOfType(ServiceBean.class);
		Set<Class<?>> classes = new HashSet<Class<?>>();
		for (ServiceBean<?> bean : serviceBeans.values()) {
			classes.add(bean.getRef().getClass());
		}
		return classes;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map<Class<?>, Object> interfaceMapRef() {
		Map<?, ServiceBean> serviceBeans = ServiceBean.getSpringContext()
				.getBeansOfType(ServiceBean.class);
		Map<Class<?>, Object> interfaceMapRef = new HashMap<Class<?>, Object>();
		for (ServiceBean<?> bean : serviceBeans.values()) {
			Class<?> interfaceClass = bean.getInterfaceClass();
			interfaceMapRef.put(interfaceClass, bean.getRef());
		}
		return interfaceMapRef;
	}

	@Override
	public boolean getPrettyPrint() {
		return false;
	}

	@Override
	public void setPrettyPrint(boolean shouldPrettyPrint) {
	}

}
