package com.deepoove.swagger.dubbo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.deepoove.swagger.dubbo.http.IRefrenceManager;
import com.deepoove.swagger.dubbo.http.ReferenceManager;
import com.deepoove.swagger.dubbo.http.ReferenceManagerApache;

import io.swagger.config.SwaggerConfig;

@Configuration
@ComponentScan({"com.deepoove.swagger.dubbo.web"})
public class SwaggerDubboAutoConfiguration {
    
    @Bean
    @ConditionalOnClass(name = "com.alibaba.dubbo.config.spring.ServiceBean")
    public SwaggerConfig dubboPropertyConfig() {
        return new DubboPropertyConfig();
    }
    
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnClass(name = "com.alibaba.dubbo.config.spring.ServiceBean")
    public IRefrenceManager refrenceManager() {
        return new ReferenceManager();
    }
    
    @Bean
    @ConditionalOnClass(name = "org.apache.dubbo.config.spring.ServiceBean")
    public SwaggerConfig dubboPropertyConfigApache() {
        return new DubboPropertyConfigApache();
    }
    
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnClass(name = "org.apache.dubbo.config.spring.ServiceBean")
    public IRefrenceManager refrenceManagerApache() {
        return new ReferenceManagerApache();
    }
    
    @Bean
    public DubboServiceScanner dubboServiceScanner() {
        return new DubboServiceScanner();
    }
    
    @Bean
    public SwaggerDocCache swaggerDocCache() {
        return new SwaggerDocCache();
    }

}
