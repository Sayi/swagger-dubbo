package com.deepoove.swagger.dubbo.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.ServiceConfigBase;
import org.apache.dubbo.config.context.ModuleConfigManager;
import org.apache.dubbo.config.spring.ServiceBean;
import org.apache.dubbo.config.spring.util.DubboBeanUtils;
import org.apache.dubbo.rpc.model.ModuleModel;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ReferenceManager implements ApplicationContextAware, SmartInitializingSingleton {

    @SuppressWarnings("rawtypes")
    private static Collection<ServiceConfigBase> services;

    private static Map<Class<?>, Object> interfaceMapProxy = new ConcurrentHashMap<>();
    private static Map<Class<?>, Object> interfaceMapRef = new ConcurrentHashMap<>();

    private static ApplicationConfig application;


    public Object getProxy(String interfaceClass) {
        Set<Entry<Class<?>, Object>> entrySet = interfaceMapProxy.entrySet();
        for (Entry<Class<?>, Object> entry : entrySet) {
            if (entry.getKey().getName().equals(interfaceClass)) {
                return entry.getValue();
            }
        }

        for (ServiceConfigBase<?> service : services) {
            if (interfaceClass.equals(service.getInterfaceClass().getName())) {
                ReferenceConfig<Object> reference = new ReferenceConfig<Object>();
                reference.setRegistry(service.getRegistry());
                reference.setRegistries(service.getRegistries());
                reference.setInterface(service.getInterfaceClass());
                reference.setVersion(service.getVersion());
                reference.setGroup(service.getGroup());
                interfaceMapProxy.put(service.getInterfaceClass(), reference.get());
                return reference.get();
            }
        }
        return null;
    }

    public Entry<Class<?>, Object> getRef(String interfaceClass) {
        Set<Entry<Class<?>, Object>> entrySet = interfaceMapRef.entrySet();
        for (Entry<Class<?>, Object> entry : entrySet) {
            if (entry.getKey().getName().equals(interfaceClass)) {
                return entry;
            }
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    public Collection<ServiceConfigBase> getServices() {
        return services;
    }

    public ApplicationConfig getApplication() {
        return application;
    }

    public Map<Class<?>, Object> getInterfaceMapRef() {
        return interfaceMapRef;
    }

    @Override
    public void afterSingletonsInstantiated() {
        services = new HashSet<>();
        ModuleModel moduleModel = DubboBeanUtils.getModuleModel(applicationContext);
        ModuleConfigManager configManager = moduleModel.getConfigManager();
        services = configManager.getServices();

        for (ServiceConfigBase<?> bean : services) {
            interfaceMapRef.putIfAbsent(bean.getInterfaceClass(), bean.getRef());
        }
        if (!services.isEmpty()) {
            ServiceBean<?> bean = services.toArray(new ServiceBean[]{})[0];
            application = bean.getApplication();
        }
    }

    private transient ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }


}
