package com.deepoove.swagger.dubbo.config;

import io.swagger.config.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@Component
public class DubboServiceScanner implements Scanner {

    @Autowired
    private ReferenceManager referenceManager;

    @Override
    public Set<Class<?>> classes() {
        return interfaceMapRef().keySet();
    }

    public Map<Class<?>, Object> interfaceMapRef() {
        return referenceManager.getInterfaceMapRef();
    }

    @Override
    public boolean getPrettyPrint() {
        return false;
    }

    @Override
    public void setPrettyPrint(boolean shouldPrettyPrint) {
    }

}
