package com.deepoove.swagger.dubbo.config;

import com.deepoove.swagger.dubbo.http.ReferenceManager;
import io.swagger.config.Scanner;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

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
