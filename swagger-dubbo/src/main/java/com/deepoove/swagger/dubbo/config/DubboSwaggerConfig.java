package com.deepoove.swagger.dubbo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.deepoove.swagger.dubbo.config", "com.deepoove.swagger.dubbo.web"})
@Configuration
public class DubboSwaggerConfig {
}
