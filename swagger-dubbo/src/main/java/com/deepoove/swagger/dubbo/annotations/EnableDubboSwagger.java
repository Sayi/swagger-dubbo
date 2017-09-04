package com.deepoove.swagger.dubbo.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;

@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = { java.lang.annotation.ElementType.TYPE })
@Documented
@ComponentScan(basePackages = { "com.deepoove.swagger.dubbo.config",
		"com.deepoove.swagger.dubbo.web" })
public @interface EnableDubboSwagger {

}
