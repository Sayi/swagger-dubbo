package com.deepoove.swagger.dubbo.example.api.service;

import java.util.List;

import com.deepoove.swagger.dubbo.example.api.pojo.User;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

public interface UserService {

	@ApiOperation(nickname = "byPhone", value = "查询用户", notes = "通过phone取用户信息", response = User.class, responseContainer = "List")
	List<User> query(@ApiParam(value = "用户phone") String phone);

	@ApiOperation(nickname = "byArea", value = "查询用户", notes = "通过城市地区code取用户信息", response = User.class, responseContainer = "List")
	List<User> query(@ApiParam(value = "城市地区code") int areaCode);

	@ApiOperation(value = "获取用户", notes = "通过id取用户信息", response = User.class, httpMethod="GET")
	User get(@ApiParam(value = "用户id") String id);

	@ApiOperation(value = "保存用户", notes = "保存用户信息")
	void save(@ApiParam(value = "用户信息") User user);

	@ApiOperation(value = "更新用户", notes = "更新用户信息")
	User update(@ApiParam(value = "用户信息") User user);

	@ApiOperation(value = "删除用户", notes = "保存用户信息")
	void delete(@ApiParam(value = "用户id") String id);
	
	@ApiOperation(value = "比较用户")
	int compare(@ApiParam(value = "用户id", required=true) User src, User dest);

}
