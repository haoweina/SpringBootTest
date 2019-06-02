package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 用于做一些框架的配置
// Spring启动应用程序的入口点
/*
* Spring Boot Auto Configuration 会根据在项目中添加的JAR依赖项自动配置Spring应用程序。
* 需要将@EnableAutoConfiguration 或 @SpringBootApplication 添加到主类文件中，然后将自动配置Spring Boot应用程序
* 如果将@SpringBootApplication批注添加到类中，则无需添加@EnableAutoConfiguration，@ComponentScan和@SpringBootConfiguration批注。
* @SpringBootApplication注释包括所有其他注释。
* Spring Boot应用程序在初始化时扫描所有bean和包声明，需要为类文件添加@ComponentScan批注，以扫描项目中添加的组件。*/
@SpringBootApplication
public class Application {
	/*
	 * @RequestMapping 注释提供“路由”信息，他告诉spring，任何带有/ path的http请求都应该映射到home方法
	 * @RequestController 注解告诉spring将结果字符串直接渲染回调用者
	 * @RequestMapping 可以作用在控制器的某个方法上，也可以作用在控制器类上
	 * 当控制器在类级别上添加@RequsetMapping注解时，这个注解会应用到控制器的所有处理器方法上。
	 * 处理器方法上的@RequestMapping注解会对类级别上的@RequestMapping的声明进行补充。
	 * */
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
