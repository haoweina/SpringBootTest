package com.stone.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.stone.mapper.UserMapper;
import com.stone.bean.UserBean;
import com.stone.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public int addUser(UserBean user, boolean isSave) {
		int retFlag = 0;
		int flag = 0;
		JSONObject retObj = new JSONObject();
		UserBean user1 = getUserByName(user.getPhoneNumber());
		// 用户已注册
		if (user1 != null) {
			retFlag = 0;
		} else {
			// 用户注册/修改信息
			if (isSave) {
				flag = userMapper.insertUseGeneratedKeys(user);
			} else {
				flag = userMapper.updateByPrimaryKey(user);
			}
			if (flag > 0 ) {
				retFlag = 1;
			} else {
				retFlag = 2;
			}
		}
		return retFlag;
	}

	@Override
	public UserBean getUserByName(String name) {
		UserBean user = userMapper.getUserByName(name);
		if (user != null) {
			return user;
		}
		return null;
	}
}
