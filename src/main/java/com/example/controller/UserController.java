package com.example.controller;

import com.example.bean.User;
import com.example.service.UserService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping("/query")
	public User testQuery() {
		return userService.selectUserByName("11");
	}
}
