package com.example.bean;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
/*
* 用户表
* */
@Data
@Table(name = "sys_user")
public class UserBean {

	/**
	 * 主键
	 */
	@Id
	private int id;

	/**
	 * 密码
	 */
	private String pwd;

	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 手机号/登录名
	 */
	private String phoneNumber;
	/**
	 * 车牌号
	 */
	private String carNumber;
	/**
	 * 住址
	 */
	private String address;
}
