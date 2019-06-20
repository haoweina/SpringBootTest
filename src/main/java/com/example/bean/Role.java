package com.example.bean;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;

/*
* 角色表
* */
@Data
public class Role {

	private String id;
	private String name;
	private String description;

	// 记住所有的权限
	private Set<Privilege> privileges = new HashSet<Privilege>();
}
