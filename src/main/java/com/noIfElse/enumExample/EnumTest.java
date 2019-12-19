package com.noIfElse.enumExample;

public class EnumTest {
	public String judge (String roleName) {
		//
		return RoleEnum.valueOf(roleName).op();
	}
}
