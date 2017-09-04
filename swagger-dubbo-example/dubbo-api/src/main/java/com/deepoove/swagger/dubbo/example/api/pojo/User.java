package com.deepoove.swagger.dubbo.example.api.pojo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class User implements Serializable {

	private static final long serialVersionUID = -1169812613737118557L;
	private String id;
	@ApiModelProperty(value = "用户姓名")
	private String name;
	private String site;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

}
