package com.noIfElse.policyExample;

import com.noIfElse.enumExample.RoleOperation;
import com.noIfElse.factoryExample.NormalRole;
import com.noIfElse.factoryExample.OrderAdminRole;
import com.noIfElse.factoryExample.RootAdminRole;

public class PolicyTest {
	public String judge(RoleOperation roleOperation) {
		RoleContext roleContext = new RoleContext(roleOperation);
		return  roleContext.execute();
	}

	public static void main(String[] args) {
		PolicyTest policyTest = new PolicyTest();
		String result1 = policyTest.judge(new RootAdminRole("ROLE_ROOT_ADMIN"));
		System.out.println(result1);

		String result2 = policyTest.judge(new OrderAdminRole("ROLE_ORDER_ADMIN"));
		System.out.println(result2);

		String result3 = policyTest.judge(new NormalRole("ROLE_NORMAL"));
		System.out.println(result3);


	}
}
