package com.noIfElse.factoryExample;

public class FactoryTest {
	public String judge (String roleName) {
		// 一行代码搞定
		return RoleFactory.getOp(roleName).op();
	}
}
