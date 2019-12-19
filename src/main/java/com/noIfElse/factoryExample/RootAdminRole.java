package com.noIfElse.factoryExample;

import com.noIfElse.enumExample.RoleOperation;

/**
 * 针对不同的角色，单独定义其业务类
 *
 * */
public class RootAdminRole implements RoleOperation {
	private String roleName;

	public RootAdminRole(String roleName) {
		this.roleName = roleName;
	}

	@Override public String op() {
		return roleName + " has AAA permission.";
	}
}
