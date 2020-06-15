package com.deepoove.swagger.dubbo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.deepoove.swagger.dubbo.config.model.SwaggerDubboApplication;

@Configuration
@ConfigurationProperties(prefix = "swagger.dubbo")
public class SwaggerDubboProperties {
    
    public static final String CLUSTER_RPC = "rpc";
    
    /**
     * 是否启用swagger-dubbo，默认为true
     */
    private boolean enable = true;
    
    /**
     * http请求地址，默认为http://ip:port/h/com.XXX.XxService/method
     */
    private String http = "h";
    
    
    /**
     * rpc zk调用 or 本地调用
     */
    private String cluster = CLUSTER_RPC;
    
    private SwaggerDubboApplication application;


    /**
     * @return the enable
     */
    public boolean isEnable() {
        return enable;
    }


    /**
     * @param enable the enable to set
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }


    /**
     * @return the cluster
     */
    public String getCluster() {
        return cluster;
    }


    /**
     * @param cluster the cluster to set
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }


    /**
     * @return the application
     */
    public SwaggerDubboApplication getApplication() {
        return application;
    }


    /**
     * @param application the application to set
     */
    public void setApplication(SwaggerDubboApplication application) {
        this.application = application;
    }


    /**
     * @return the http
     */
    public String getHttp() {
        return http;
    }


    /**
     * @param http the http to set
     */
    public void setHttp(String http) {
        this.http = http;
    }
}
