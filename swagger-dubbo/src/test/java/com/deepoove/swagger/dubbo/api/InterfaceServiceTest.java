package com.deepoove.swagger.dubbo.api;

import io.swagger.annotations.ApiOperation;

public interface InterfaceServiceTest {
	
	void test(String para, String code);
	
	String login(String name);
	@ApiOperation(nickname="bypwd", value = "")
	String login(String name, String password);

}
