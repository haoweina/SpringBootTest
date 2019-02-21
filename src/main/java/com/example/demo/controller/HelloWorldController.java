package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @RestController 相当于 @ResponseBody + @Controller
* 如果只是使用@RestController 注解controller，则Controller中的方法无法返回jsp页面，
* 配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
*
* 如果需要返回到指定页面，则需要用@Controller配合视图解析器InternalResourceViewResolver
*
* 如果需要返回JSON、XML或自定义的media Type内容到页面，则需要在对应的方法上加 @RequestBody*/
@RestController
public class HelloWorldController {
/*
 * @RequestMapping 可以作用在控制器的某个方法上，也可以作用在控制器类上
 * 当控制器在类级别上添加@RequsetMapping注解时，这个注解会应用到控制器的所有处理器方法上。
 * 处理器方法上的@RequestMapping注解会对类界别上的@RequestMapping的声明进行补充。
* */
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
}
