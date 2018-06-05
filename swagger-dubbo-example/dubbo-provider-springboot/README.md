## dubbo-provider-springboot 示例

spring boot demo启动前准备：

1. 工程导入swagger-dubbo-example/dubbo-api接口模块
2. 修改Zookeeper配置：dubbo-provider-springboot/src/main/java/com/deepoove/dubbo/provider/springboot/DubboConfig.java

```java
@Bean
public RegistryConfig registryConfig() {
  RegistryConfig registryConfig = new RegistryConfig();
  registryConfig.setAddress("zookeeper://127.0.0.1:2181");
  registryConfig.setClient("curator");
  registryConfig.setUsername("admin");
  registryConfig.setPassword("123");
  return registryConfig;
}
```

运行Application。

访问如下url查看swagger数据

```
http://127.0.0.1:8077/swagger-dubbo/api-docs
```

访问swagger-ui

```
http://127.0.0.1:8077/distv2/index.html
```