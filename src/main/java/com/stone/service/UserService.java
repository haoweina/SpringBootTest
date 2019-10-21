package com.stone.service;

import com.stone.bean.UserBean;

public interface UserService {

	int addUser(UserBean user, boolean isSave);

	UserBean getUserByName(String name, String pwd);

}
