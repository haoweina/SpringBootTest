package com.noIfElse.factoryExample;

import com.noIfElse.enumExample.RoleOperation;
import java.util.HashMap;
import java.util.Map;

/**
 * 工厂类
 * 对角色进行聚合
 * */
public class RoleFactory {
	static Map<String, RoleOperation> roleOperationMap = new HashMap<>();

	// 在静态块中先把初始化工作全部完成
	static {
		roleOperationMap.put("ROLE_ROOT_ADMIN", new RootAdminRole("ROLE_ROOT_ADMIN"));
		roleOperationMap.put("ROLE_ORDER_ADMIN", new OrderAdminRole("ROLE_ORDER_ADMIN"));
		roleOperationMap.put("ROLE_NORMAL", new NormalRole("ROLE_NORMAL"));
	}

	public static RoleOperation getOp(String roleName) {
		return roleOperationMap.get(roleName);
	}
}
