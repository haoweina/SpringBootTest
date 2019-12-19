package com.noIfElse.factoryExample;

import com.noIfElse.enumExample.RoleOperation;

/**
 * 针对不同的角色，单独定义其业务类
 *
 * */
public class NormalRole implements RoleOperation {

	private String roleName;

	public NormalRole(String roleName) {
		this.roleName = roleName;
	}

	@Override public String op() {
		return roleName + " has CCC permission";
	}
}
