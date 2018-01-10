package com.deepoove.swagger.dubbo.config;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.deepoove.swagger.dubbo.http.ReferenceManager;

import io.swagger.config.Scanner;

@Component
public class DubboServiceScanner implements Scanner {

	@Override
	public Set<Class<?>> classes() {
		return interfaceMapRef().keySet();
	}
	
	public Map<Class<?>, Object> interfaceMapRef() {
		return ReferenceManager.getInstance().getInterfaceMapRef();
	}

	@Override
	public boolean getPrettyPrint() {
		return false;
	}

	@Override
	public void setPrettyPrint(boolean shouldPrettyPrint) {
	}

}
