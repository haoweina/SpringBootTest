package com.example.service.Impl;

import com.example.bean.UserBean;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public int addUser(UserBean user, boolean isSave) {
		return 0;
	}
}
