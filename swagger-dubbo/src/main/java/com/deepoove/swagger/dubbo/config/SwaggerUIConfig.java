package com.deepoove.swagger.dubbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author: code4china
 * @description:
 * @date: Created in 16:43 2018/6/28
 */
@Configuration
@EnableWebMvc
public class SwaggerUIConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-dubbo/**").addResourceLocations("classpath:META-INF/swagger-ui/");
        super.addResourceHandlers(registry);
    }
}
