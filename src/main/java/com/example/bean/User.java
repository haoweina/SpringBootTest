package com.example.bean;

import lombok.Data;
import lombok.NonNull;
/*
* 用户表
* */
@Data
public class User {

	private String id;
	private String userName;
	@NonNull
	private String password;
}
