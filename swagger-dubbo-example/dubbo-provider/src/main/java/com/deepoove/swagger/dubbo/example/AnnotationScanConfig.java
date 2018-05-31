package com.deepoove.swagger.dubbo.example;

import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@Configuration
@DubboComponentScan(basePackages = { 
"com.deepoove.swagger.dubbo.example" })
public class AnnotationScanConfig {

}
