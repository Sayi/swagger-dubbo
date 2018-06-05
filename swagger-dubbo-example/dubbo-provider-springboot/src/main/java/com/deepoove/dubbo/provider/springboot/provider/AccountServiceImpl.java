package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepoove.swagger.dubbo.example.api.service.AccountService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "帐号服务")
@Service
public class AccountServiceImpl implements AccountService {

	@Override
	@ApiOperation(value = "登出", notes = "退出用户信息")
	public void logout(String account) {}

	@Override
	@ApiOperation(value = "登录")
	public boolean login(@ApiParam(value = "用户帐号") String account,
			@ApiParam(value = "用户密码") String password) {
		return false;
	}

	@Override
	@ApiOperation(nickname="byCode", value = "登录", notes="邀请码登录")
	public boolean login(@ApiParam(value = "用户帐号") String account, @ApiParam(value = "邀请码") int code) {
		return false;
	}

	@Override
	public void updateInfo(boolean isBoy, Integer number) {
	}

}
