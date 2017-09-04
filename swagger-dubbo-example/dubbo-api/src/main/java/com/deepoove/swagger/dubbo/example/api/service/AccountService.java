package com.deepoove.swagger.dubbo.example.api.service;

public interface AccountService {

	void logout(String account);

	boolean login(String account, String password);

	boolean login(String account, int code);

	void updateInfo(boolean isBoy, Integer number);

}
