package com.example.dao;

import com.example.bean.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

	@Select("select * from user where user_name = #{name}")
	User findUserByName(String name);
}
