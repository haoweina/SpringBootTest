package com.example.service;

import com.example.bean.User;
import com.example.dao.UserDao;
import javax.annotation.Resource;

public class UserService {
	/*@Autowired 与 @Resource
	* 都可以用来装配bean,可以写在字段上或者方法上
	* @Autowired：属于spring的，默认按类型装配，如果想用名称进行装配可以结合@Qualifier注解进行使用
	* @Resource：是JSR-250标准的注释，属于J2EE,默认按名称装配
	* 推荐使用@Resource注解在字段上，这样就不用写setter方法了，减少了spring的耦合。*/
	@Resource
	private UserDao userDao;

	public User selectUserByName(String name) {
		return userDao.findUserByName(name);
	}
}
