## swagger-dubbo

[![Build Status](https://travis-ci.org/Sayi/swagger-dubbo.svg?branch=master)](https://travis-ci.org/Sayi/swagger-dubbo)

Dubbo |ˈdʌbəʊ| 是阿里巴巴提供的分布式框架，提供高性能和透明化的RPC远程服务调用方案，以及SOA服务治理方案。  
Swagger围绕着OpenAPI规范，提供了一套设计、构建、文档化rest api的开源工具。


**Swagger-dubbo致力于dubbo与swagger文档的集成，并且为dubbo提供rest风格的http调用方案。适用于dubbo服务接口调试、接口http请求模拟、单机验证等场景。**

![Swagger-UI](swagger-dubbo-example/swagger_ui.png)

## 近期规划 2018-01-10
* RPC注册中心调用和本地调用配置 [issue #3](https://github.com/Sayi/swagger-dubbo/issues/3)
* 由于官方开始重点维护dubbo，swagger-dubbo将基于dubbo2.6.0+重新开发，预期版本号从1.5.0开始，dubbo2.5.3不再增加新特性
* 完善发现dubbo服务的能力(如基于注解的配置) [issue #2](https://github.com/Sayi/swagger-dubbo/issues/2)
* swagger-dubbo支持dubbox

## 快速集成
所有集成都是基于spring配置。swagger v2.0、dubbo2.5.3+。

1. Maven依赖

```xml
<dependency>
  <groupId>com.deepoove</groupId>
  <artifactId>swagger-dubbo</artifactId>
  <version>1.0.3-alpha</version>
</dependency>
```

2. 启用swagger-dubbo

使用注解 `@EnableDubboSwagger`开启dubbo的swagger文档。
```java
package com.deepoove.swagger.dubbo.example;

import org.springframework.context.annotation.Configuration;
import com.deepoove.swagger.dubbo.annotations.EnableDubboSwagger;

@Configuration
@EnableDubboSwagger
public class SwaggerDubboConfig {

}

```
在spring xml配置中，打开Configuration注解，声明SwaggerDubboConfig。
```xml
<context:annotation-config />
<bean class="com.deepoove.swagger.dubbo.example.SwaggerDubboConfig" />
```

3. 配置swagger-dubbo

新增property文件swagger-dubbo.properties

在spring xml配置中，加载配置文件。

```xml
<context:property-placeholder location="classpath*:swagger-dubbo.properties" />
```

配置项说明：
```properties
#doc地址，默认为http://ip:port/context/swagger-dubbo/swagger.json
#swagger.dubbo.doc=swagger-dubbo
#http请求地址，默认为http://ip:port/h/com.XXX.XxService/method
#swagger.dubbo.http=h

#dubbo 服务版本号
swagger.dubbo.application.version = 1.0
#dubbo服务groupId
swagger.dubbo.application.groupId = com.deepoove
#dubbo服务artifactId
swagger.dubbo.application.artifactId = dubbo.api

#是否启用swagger-dubbo，默认为true
#swagger.dubbo.enable = true
```

4. 启动web容器，浏览器访问 `http://ip:port/context/swagger-dubbo/swagger.json`


## 示例与集成swagger-ui
示例参见swagger-dubbo-example。  

如何集成swagger-ui，参见官方文档 [GitHub Swagger UI](https://github.com/swagger-api/swagger-ui)

## swagger-dubbo集成注意事项
* 对于服务接口方法重载，为了在http请求中唯一确认一个方法，需要使用注解`@ApiOperation(nickname = "byArea")`,通过nickname标记唯一路径(如果不填写，将只显示一个方法)。此时，rest的请求地址为：`http://ip:port/h/com.XXX.XxService/method/byArea`
[Stackoverflow:重载的方法能够映射到同一URL地址吗](http://stackoverflow.com/questions/17196766/can-resteasy-choose-method-based-on-query-params)

* Object对象作为http请求参数为json string格式。格式不正确会导致解析错误。下一版本考虑参数json格式可视化。
[Stackoverflow:POST的方法能够接收多个参数吗？](http://stackoverflow.com/questions/5553218/jax-rs-post-multiple-objects)

* swagger注解既可以写在接口上，也可以写在实现类上。 
* 原生类型作为http请求参数为必填。

### [文章：探讨Dubbo与Swagger的集成](https://github.com/Sayi/sayi.github.com/issues/15)

 



