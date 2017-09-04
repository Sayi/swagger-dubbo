package com.deepoove.swagger.dubbo.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String test() {
		return "test success";
	}

}
