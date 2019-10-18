package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.bean.UserBean;
import com.example.conf.constant.error.ErrorEnum;
import com.example.service.UserService;
import com.example.util.ReturnJSONUtils;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	/*
	* 用户注册
	*
	* */
	@PostMapping("/addUser")
	public JSONObject addUser(@RequestBody JSONObject requestJson) {
		UserBean user = JSON.parseObject(requestJson.getJSONObject("userBean").toJSONString(), UserBean.class);
		boolean isSave = requestJson.getBoolean("isSave");
		int flag = userService.addUser(user, isSave);
		return flag > 0 ? ReturnJSONUtils.successJson() : ReturnJSONUtils.errorJson(ErrorEnum.E_400);
	}

}
