## Dubbo的Swagger服务文档

## swagger-dubbo

[![Build Status](https://travis-ci.org/Sayi/swagger-dubbo.svg?branch=master)](https://travis-ci.org/Sayi/swagger-dubbo) ![jdk11+](https://img.shields.io/badge/jdk-1.6%2B-orange.svg) ![dubbo3.2.0+](https://img.shields.io/badge/dubbo-2.6.0%2B-blue.svg)

Dubbo |ˈdʌbəʊ| 是阿里巴巴提供的分布式框架，Swagger围绕着OpenAPI规范，提供了一套设计、构建、文档化rest api的开源工具。

* 通过swagger阅读接口文档
* 开发人员可以用它来自测服务接口，也可以用它来模拟别人的服务接口返回值
* 测试可以用它来验证接口的正确性，基于HTTP进行接口测试

## 前提
- Apache Dubbo 3.2+
- JDK 11+

## Maven
```xml
<dependency>
  <groupId>com.deepoove</groupId>
  <artifactId>swagger-dubbo</artifactId>
  <version>3.0.0-SNAPSHOT</version>
</dependency>
```

## SpringBoot
`@EnableDubboSwagger`开启dubbo的swagger文档。

参见[spring-boot示例](swagger-dubbo-example/dubbo-provider-springboot)

## swagger-ui查看文档

可以在任何能托管页面的容器内集成swagger-ui，配置swagger-dubbo提供的`http://ip:port/context/swagger-dubbo/api-docs`，可能需要跨域支持，详情参见官方文档 [swagger-ui](https://github.com/swagger-api/swagger-ui)

@JKTerrific 在swagger-ui基础上开发了[**swagger-dubbo-ui**](https://github.com/JKTerrific/swagger-dubbo-ui), 解决了页面上的一些展示问题：
* 参数为model时，输入框变更为输入域，并且支持JSON可视化
* Model字段为date、byte时，支持展示具体类型，而不是string

![](swagger-dubbo-example/swagger_ui.png)

## 配置
swagger-dubbo默认无需任何配置，但是也提供了一些可选项。

配置项说明：
```properties
#http请求地址，默认为http://ip:port/h/com.XXX.XxService/method
swagger.dubbo.http=h

#dubbo 服务版本号
swagger.dubbo.application.version = 1.0
#dubbo服务groupId
swagger.dubbo.application.groupId = com.deepoove
#dubbo服务artifactId
swagger.dubbo.application.artifactId = dubbo.api

#rpc zk调用 or 本地调用
swagger.dubbo.cluster = rpc

#是否启用swagger-dubbo，默认为true
swagger.dubbo.enable = true
```

## swagger-dubbo集成注意事项
* 对于服务接口方法重载，为了在http请求中唯一确认一个方法，需要使用注解`@ApiOperation(nickname = "byArea")`,通过nickname标记唯一路径(如果不填写，将只显示一个方法)。此时，rest的请求地址为：`http://ip:port/h/com.XXX.XxService/method/byArea`
[Stackoverflow:重载的方法能够映射到同一URL地址吗](http://stackoverflow.com/questions/17196766/can-resteasy-choose-method-based-on-query-params)

* Object对象作为http请求参数为json string格式。
[Stackoverflow:POST的方法能够接收多个参数吗？](http://stackoverflow.com/questions/5553218/jax-rs-post-multiple-objects)

* swagger注解既可以写在接口上，也可以写在实现类上。 
* 原生类型作为http请求参数为必填。

 
