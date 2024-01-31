package com.deepoove.dubbo.provider.springboot;

import com.deepoove.swagger.dubbo.annotations.EnableDubboSwagger;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@EnableDubboSwagger
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
