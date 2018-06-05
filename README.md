## swagger-dubbo

[![Build Status](https://travis-ci.org/Sayi/swagger-dubbo.svg?branch=master)](https://travis-ci.org/Sayi/swagger-dubbo)

Dubbo |ˈdʌbəʊ| 是阿里巴巴提供的分布式框架，提供高性能和透明化的RPC远程服务调用方案，以及SOA服务治理方案。  
Swagger围绕着OpenAPI规范，提供了一套设计、构建、文档化rest api的开源工具。

> swagger-dubbo的核心价值是swagger式的文档化+rest风格的HTTP模拟测试。

* 通过swagger阅读接口文档
* 开发人员可以用它来自测服务接口，也可以用它来模拟别人的服务接口返回值
* 测试可以用它来验证接口的正确性，基于HTTP进行接口测试

**注意：rest服务不适合对外(前端)提供，务必在服务端或者测试内部使用**


## 版本
| swagger-dubbo版本 | 支持dubbo版本号 | 支持dubbo注解 | 支持dubboX | SpringMVC demo | SpringBoot demo
| --- | --- | --- | --- | --- | --- |
| 1.1.0 [**移步老版本文档分支**](https://github.com/Sayi/swagger-dubbo/tree/1.1.0-release) | dubbo2.5.3 | 否 | 否 | :white_check_mark: 有 | 无
| 2.0.0-SNAPSHOT(开发中，尚未发布) | dubbo2.6.0+ | :white_check_mark: 是 | :white_check_mark: 是 | :white_check_mark: 有 | :white_check_mark: 有


## Maven
```xml
<dependency>
  <groupId>com.deepoove</groupId>
  <artifactId>swagger-dubbo</artifactId>
  <version>2.0.0-SNAPSHOT(开发中，尚未发布)</version>
</dependency>
```

## 两步集成

1. 使用注解 `@EnableDubboSwagger`开启dubbo的swagger文档。
```java
package com.deepoove.swagger.dubbo.example;

import org.springframework.context.annotation.Configuration;
import com.deepoove.swagger.dubbo.annotations.EnableDubboSwagger;

@Configuration
@EnableDubboSwagger
public class SwaggerDubboConfig {

}
```

2. 在spring的*-servlet.xml配置中，开启属性占位符的配置, 开启Configuration注解，声明SwaggerDubboConfig。

```xml
<context:annotation-config />
<bean class="com.deepoove.swagger.dubbo.example.SwaggerDubboConfig" />
<context:property-placeholder />
```

OK，集成完毕。启动web容器，浏览器访问 `http://ip:port/context/swagger-dubbo/api-docs`查看swagger文档。


## swagger-ui查看文档
swagger-ui的原理是解析swagger的json数据,然后渲染成页面。我们可以在任何能托管页面的容器内集成swagger-ui，然后配置swagger-dubbo提供的`http://ip:port/context/swagger-dubbo/api-docs`地址即可。

详情参见官方文档 [GitHub Swagger UI](https://github.com/swagger-api/swagger-ui)

## 配置
swagger-dubbo默认无需任何配置，但是也提供了一些可选项。
新增文件swagger-dubbo.properties，在spring xml配置中，加载配置文件。

```xml
<context:property-placeholder location="classpath*:swagger-dubbo.properties" />
```

配置项说明：
```properties
#http请求地址，默认为http://ip:port/h/com.XXX.XxService/method
swagger.dubbo.http=h

#dubbo 服务版本号
#swagger.dubbo.application.version = 1.0
#dubbo服务groupId
#swagger.dubbo.application.groupId = com.deepoove
#dubbo服务artifactId
#swagger.dubbo.application.artifactId = dubbo.api

#rpc zk调用 or 本地调用
swagger.dubbo.cluster = rpc

#是否启用swagger-dubbo，默认为true
swagger.dubbo.enable = true
```


4. 启动web容器，浏览器访问 `http://ip:port/context/swagger-dubbo/api-docs`
```


5. 修改编译参数。增加-parameters。如果使用maven参数，请增加如下插件或补充

```
<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					<compilerArgument>-parameters</compilerArgument>
				</configuration>
			</plugin>
```

6. 返回对象如果使用了泛型。则目前版本需要在接口实现处增加注解

```  @ApiOperation(value="xxx",response=YourClass.class) ```


## 示例与集成swagger-ui
示例参见swagger-dubbo-example(启动前需要修改/dubbo-provider/src/main/resources/application/remote-provider.xml文件中Zookeeper的配置)。  

## 跨域支持
```xml
  <!-- 跨域支持，Spring4.3.10+ -->
  <mvc:cors>
    <mvc:mapping path="/swagger-dubbo/**" allowed-origins="*" />
  </mvc:cors>
```


## 示例
示例参见swagger-dubbo-example(启动前需要修改/dubbo-provider/src/main/resources/application/remote-provider.xml文件中Zookeeper的配置)。
* dubbo-provider启动后，swagger-dubbo暴露的json数据通过地址`http://127.0.0.1:8077/dubbo-provider/swagger-dubbo/api-docs`查看。
* SwaggerUI 2.x页面：浏览器访问`http://127.0.0.1:8077/dubbo-provider/distv2`
![Swagger-UI](swagger-dubbo-example/swagger_ui.png)
* SwaggerUI 3.x页面：浏览器访问`http://127.0.0.1:8077/dubbo-provider/dist` 
![Swagger-UI](swagger-dubbo-example/swagger_ui_3.png)

## swagger-dubbo集成注意事项
* 对于服务接口方法重载，为了在http请求中唯一确认一个方法，需要使用注解`@ApiOperation(nickname = "byArea")`,通过nickname标记唯一路径(如果不填写，将只显示一个方法)。此时，rest的请求地址为：`http://ip:port/h/com.XXX.XxService/method/byArea`
[Stackoverflow:重载的方法能够映射到同一URL地址吗](http://stackoverflow.com/questions/17196766/can-resteasy-choose-method-based-on-query-params)

* Object对象作为http请求参数为json string格式。格式不正确会导致解析错误。下一版本考虑参数json格式可视化。
[Stackoverflow:POST的方法能够接收多个参数吗？](http://stackoverflow.com/questions/5553218/jax-rs-post-multiple-objects)

* swagger注解既可以写在接口上，也可以写在实现类上。 
* 原生类型作为http请求参数为必填。

### [文章：探讨Dubbo与Swagger的集成](https://github.com/Sayi/sayi.github.com/issues/15)

 
