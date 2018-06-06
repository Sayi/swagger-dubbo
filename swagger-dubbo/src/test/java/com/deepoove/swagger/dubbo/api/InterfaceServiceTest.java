package com.deepoove.swagger.dubbo.api;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

public interface InterfaceServiceTest {
	
    @ApiOperation(value = "查询用户", notes = "通过城市地区code取用户信息", response = String.class, responseContainer = "List")
	List<String> test(@ApiParam(value="参数", required=true) String para, String code);
	
	String login(String name);
	
	@ApiOperation(nickname="bypwd", value = "")
	String login(String name, String password);
	
	String get(String id);
	String get(String name, String phone);

}
