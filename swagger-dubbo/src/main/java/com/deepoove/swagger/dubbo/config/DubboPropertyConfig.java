package com.deepoove.swagger.dubbo.config;

import java.text.MessageFormat;

import javax.servlet.ServletContext;

import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import com.alibaba.dubbo.config.ApplicationConfig;
import com.deepoove.swagger.dubbo.http.ReferenceManager;

import io.swagger.config.SwaggerConfig;
import io.swagger.models.Contact;
import io.swagger.models.Info;
import io.swagger.models.Swagger;

@Component
public class DubboPropertyConfig implements SwaggerConfig {

    @Value("${swagger.dubbo.application.version:}")
    private String version;
    @Value("${swagger.dubbo.application.groupId:}")
    private String groupId;
    @Value("${swagger.dubbo.application.artifactId:}")
    private String artifactId;

    @Autowired
    private ServletContext servletContext;

    private static String mavenDependency = "&lt;dependency&gt;<br/>"
            + "&nbsp;&nbsp;&nbsp;&nbsp;&lt;groupId&gt;{0}&lt;/groupId&gt;<br/>"
            + "&nbsp;&nbsp;&nbsp;&nbsp;&lt;artifactId&gt;{1}&lt;/artifactId&gt;<br/>"
            + "&nbsp;&nbsp;&nbsp;&nbsp;&lt;version&gt;{2}&lt;/version&gt;<br/>"
            + "&lt;/dependency&gt;<br/>";

    @Override
    public Swagger configure(Swagger swagger) {
        ApplicationConfig application = ReferenceManager.getInstance().getApplication();
        if (null != application) {
            Info info = swagger.getInfo();
            if (info == null) {
                info = new Info();
                swagger.setInfo(info);
            }
            info.setTitle(application.getName());

            version = StringUtils.isNotBlank(version) ? version : application.getVersion();
            if (StringUtils.isNotBlank(groupId)
                    && StringUtils.isNotBlank(artifactId)
                    && StringUtils.isNotBlank(version)) {
                info.setDescription(MessageFormat.format(mavenDependency, groupId, artifactId, version));
            }
            info.setVersion(StringUtils.isNotBlank(version) ? version : "");

            Contact contact = new Contact();
            info.setContact(contact);
            contact.setName(application.getOwner());
        }
        setBashPath(swagger);
        return swagger;
    }

    private void setBashPath(Swagger swagger) {
        if (StringUtils.isEmpty(swagger.getBasePath())) {
            swagger.setBasePath(StringUtils.isEmpty(servletContext.getContextPath()) ? "/" : servletContext.getContextPath());
        }
    }

    @Override
    public String getFilterClass() {
        return null;
    }

}
