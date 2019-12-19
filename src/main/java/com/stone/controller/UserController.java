package com.stone.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.stone.bean.UserBean;
import com.stone.conf.constant.error.ErrorEnum;
import com.stone.service.UserService;
import com.stone.util.ReturnJSONUtils;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	/*
	* 用户注册/修改信息
	*
	* */
	@PostMapping("/addUser")
	public JSONObject addUser(@RequestBody JSONObject requestJson) {
		UserBean user = JSON.parseObject(requestJson.getJSONObject("userBean").toJSONString(), UserBean.class);
		boolean isSave = requestJson.getBoolean("isSave");
		int flag = userService.addUser(user, isSave);
		// flag: 0----用户已注册，1----保存成功，2----保存失败
		return flag == 0 ? ReturnJSONUtils.errorJson(ErrorEnum.E_10008): (flag == 1 ? ReturnJSONUtils.successJson() : ReturnJSONUtils.errorJson(ErrorEnum.E_400));
	}

	/*
	* 用户登录
	* */
	@GetMapping("/userLogin")
	public JSONObject userLogin(@RequestParam String userName, @RequestParam String pwd) {
		UserBean user = userService.getUserByName(userName, pwd);
		return user != null ? ReturnJSONUtils.successJson(user) : ReturnJSONUtils.errorJson(ErrorEnum.E_10009);
	}

}
