package com.deepoove.swagger.dubbo.config.model;

public class SwaggerDubboApplication {
    
    /**
     * dubbo 服务版本号
     */
    private String version;
    /**
     * dubbo服务groupId
     */
    private String groupId;
    /**
     * dubbo服务artifactId
     */
    private String artifactId;
    
    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }
    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }
    /**
     * @return the groupId
     */
    public String getGroupId() {
        return groupId;
    }
    /**
     * @param groupId the groupId to set
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    /**
     * @return the artifactId
     */
    public String getArtifactId() {
        return artifactId;
    }
    /**
     * @param artifactId the artifactId to set
     */
    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

}
