package com.deepoove.swagger.dubbo.annotations;

import com.deepoove.swagger.dubbo.config.DubboSwaggerConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = {java.lang.annotation.ElementType.TYPE})
@Documented
@Import(DubboSwaggerConfig.class)
public @interface EnableDubboSwagger {

}
