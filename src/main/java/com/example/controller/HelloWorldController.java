package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*Rest端点*/
/*
* @RestController 相当于 @ResponseBody + @Controller
* 如果只是使用@RestController 注解controller，则Controller中的方法无法返回jsp页面，
* 配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
*
* 如果需要返回到指定页面，则需要用@Controller配合视图解析器InternalResourceViewResolver
*
* 如果需要返回JSON、XML或自定义的media Type内容到页面，则需要在对应的方法上加 @RequestBody
*
* @EnableAutoConfiguration 告诉Spring Boot根据你添加的jar以来关系猜测你想如何让配置Spring.
* spring-boot-starter-web添加了tomcat和Spring MVC，auto-configuration假定你正在开发web应用并自动设置spring
* */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {
/*
 * @RequestMapping 注释提供“路由”信息，他告诉spring，任何带有/ path的http请求都应该映射到home方法
 * @RequestController 注解告诉spring将结果字符串直接渲染回调用者
 * @RequestMapping 可以作用在控制器的某个方法上，也可以作用在控制器类上
 * 当控制器在类级别上添加@RequsetMapping注解时，这个注解会应用到控制器的所有处理器方法上。
 * 处理器方法上的@RequestMapping注解会对类级别上的@RequestMapping的声明进行补充。
* */
	@GetMapping("/sayHello")
	public String home() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}
}
