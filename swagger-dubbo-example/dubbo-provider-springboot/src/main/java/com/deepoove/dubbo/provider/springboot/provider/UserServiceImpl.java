package com.deepoove.dubbo.provider.springboot.provider;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepoove.swagger.dubbo.example.api.pojo.User;
import com.deepoove.swagger.dubbo.example.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	static User user = new User();
	static List<User> list = new ArrayList<User>();

	static {
		user.setId("Sayi");
		user.setName("卅一");
		user.setSite("http://www.deepoove.com");
		list.add(user);
	}

	@Override
	public List<User> query(String phone) {
		return list;
	}

	@Override
	public List<User> query(int areaCode) {
		return list;
	}

	@Override
	public User get(String id) {
		return user;
	}

	@Override
	public void save(User user) {}

	@Override
	public User update(User user) {
		return null;
	}

	@Override
	public void delete(String id) {}

	@Override
	public int compare(User src, User dest) {
		return 0;
	}

}
