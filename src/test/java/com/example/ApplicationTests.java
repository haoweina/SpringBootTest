package com.example;

import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.util.Factory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
* 测试入口
* */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Before
	public void init() {

	}
	@Test
	public void contextLoads() {
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");

	}

	public void after() {

	}
}
