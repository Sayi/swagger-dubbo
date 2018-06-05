package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepoove.swagger.dubbo.example.api.service.PushService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Service
public class PushServiceImpl implements PushService{

	@ApiOperation(value = "推送", notes = "推送消息至指定帐号")
	@Override
	public String push(@ApiParam(value="帐号") String account) {
		return "中文字符串";
	}

}
