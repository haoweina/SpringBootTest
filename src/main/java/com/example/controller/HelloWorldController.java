package com.example.controller;

import java.io.IOException;
import java.util.Scanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

	public static void main(String[] args) throws IOException {
		/*
		* StringBuffer和StringBuilder的区别，StringBuilder的方法不是线程安全的（不能同步访问）
		* */
		//StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
		//sBuffer.append("www.");
		//sBuffer.append("runoob");
		//sBuffer.append(".com");
		//sBuffer.reverse();
		//System.out.println(sBuffer);

		// 日期
		//Calendar c = Calendar.getInstance();
		//c.set(2009, 6 - 1, 12);
		//System.out.println(c);


		// 输入流
		//String c;
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("输入字符，安下‘q’键退出。");
		//do {
		//	c = br.readLine();
		//	System.out.println(c);
		//} while (!c.equals("end"));

		//File f = new File("a.txt");
		//FileOutputStream fop = new FileOutputStream(f);
		//OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
		//writer.append("中文输入");
		//writer.append("\r\n");
		//writer.append("English");
		//writer.close();
		//fop.close();
		//
		//FileInputStream fip = new FileInputStream(f);
		//InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
		//StringBuffer sb = new StringBuffer();
		//while (reader.ready()) {
		//	sb.append((char)reader.read());
		//}
		//System.out.println(sb.toString());
		//reader.close();
		//fip.close();

		Scanner scan = new Scanner(System.in);
		System.out.println("next方式接收");
		if (scan.hasNext()) {
			String str1 = scan.next();
			System.out.println("输入的数据为：" + str1);
		}
		scan.close();
	}
}
