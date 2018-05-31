package com.deepoove.swagger.dubbo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.deepoove.swagger.dubbo.example.api.service.PushService;
import com.deepoove.swagger.dubbo.example.api.service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {
    
    @Reference(check=false)
    PushService pushService;
    
    @Autowired
    @Qualifier("userServiceC")
    UserService userService;
    
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String test() {
	    System.out.println(userService.get(""));
	    System.out.println(pushService.push(""));
		return "test success";
	}

}
