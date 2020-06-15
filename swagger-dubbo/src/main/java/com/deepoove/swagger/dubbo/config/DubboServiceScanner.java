package com.deepoove.swagger.dubbo.config;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.deepoove.swagger.dubbo.http.IRefrenceManager;

import io.swagger.config.Scanner;

public class DubboServiceScanner implements Scanner {
    
    @Autowired
    IRefrenceManager refrenceManager;
    
	@Override
	public Set<Class<?>> classes() {
		return interfaceMapRef().keySet();
	}
	
	public Map<Class<?>, Object> interfaceMapRef() {
		return refrenceManager.getInterfaceMapRef();
	}

	@Override
	public boolean getPrettyPrint() {
		return false;
	}

	@Override
	public void setPrettyPrint(boolean shouldPrettyPrint) {
	}

}
