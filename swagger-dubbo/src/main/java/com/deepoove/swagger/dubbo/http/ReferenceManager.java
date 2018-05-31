package com.deepoove.swagger.dubbo.http;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.alibaba.dubbo.config.spring.extension.SpringExtensionFactory;

public class ReferenceManager {
    
    private static Logger logger = LoggerFactory.getLogger(ReferenceManager.class);

    @SuppressWarnings("rawtypes")
    private static Collection<ServiceBean> services;

    private static Map<Class<?>, Object> interfaceMapProxy = new ConcurrentHashMap<Class<?>, Object>();
    private static Map<Class<?>, Object> interfaceMapRef = new ConcurrentHashMap<Class<?>, Object>();

    private static ReferenceManager instance;
    private static ApplicationConfig application;

    private ReferenceManager() {}

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public synchronized static ReferenceManager getInstance() {
        if (null != instance) return instance;
        instance = new ReferenceManager();
        services = new HashSet<ServiceBean>();
        try {
            Field field = SpringExtensionFactory.class.getDeclaredField("contexts");
            field.setAccessible(true);
            Set<ApplicationContext> contexts = (Set<ApplicationContext>)field.get(new SpringExtensionFactory());
            for (ApplicationContext context : contexts){
                services.addAll(context.getBeansOfType(ServiceBean.class).values());
            }
        } catch (Exception e) {
            logger.error("Get All Dubbo Service Error", e);
            return instance;
        }
        for (ServiceBean<?> bean : services) {
            interfaceMapRef.putIfAbsent(bean.getInterfaceClass(), bean.getRef());
        }
        
        //
        if (!services.isEmpty()) {
			ServiceBean<?> bean = services.toArray(new ServiceBean[]{})[0];
			application = bean.getApplication();
        }
        
        return instance;
    }

    public Object getProxy(String interfaceClass) {
        Set<Entry<Class<?>, Object>> entrySet = interfaceMapProxy.entrySet();
        for (Entry<Class<?>, Object> entry : entrySet) {
            if (entry.getKey().getName().equals(interfaceClass)) { return entry.getValue(); }
        }

        for (ServiceBean<?> service : services) {
            if (interfaceClass.equals(service.getInterfaceClass().getName())) {
                ReferenceConfig<Object> reference = new ReferenceConfig<Object>();
                reference.setApplication(service.getApplication());
                reference.setRegistry(service.getRegistry());
                reference.setRegistries(service.getRegistries());
                reference.setInterface(service.getInterfaceClass());
                reference.setVersion(service.getVersion());
                interfaceMapProxy.put(service.getInterfaceClass(), reference.get());
                return reference.get();
            }
        }
        return null;
    }

    public Entry<Class<?>, Object> getRef(String interfaceClass) {
        Set<Entry<Class<?>, Object>> entrySet = interfaceMapRef.entrySet();
        for (Entry<Class<?>, Object> entry : entrySet) {
            if (entry.getKey().getName().equals(interfaceClass)) { return entry; }
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    public Collection<ServiceBean> getServices() {
        return services;
    }

    public ApplicationConfig getApplication() {
        return application;
    }

    public Map<Class<?>, Object> getInterfaceMapRef() {
        return interfaceMapRef;
    }

}
