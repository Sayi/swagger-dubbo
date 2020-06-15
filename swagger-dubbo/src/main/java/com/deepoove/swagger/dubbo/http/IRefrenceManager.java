package com.deepoove.swagger.dubbo.http;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public interface IRefrenceManager {

    Object getProxy(String interfaceClass);

    Entry<Class<?>, Object> getRef(String interfaceClass);

    Collection<?> getServices();

    Object getApplication();
    
    Map<Class<?>, Object> getInterfaceMapRef();

}