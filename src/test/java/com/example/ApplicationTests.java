package com.example;

/*
* 测试入口
* */
/*@RunWith(SpringRunner.class)
@SpringBootTest*/
/*public class ApplicationTests {

	@Test
	public void contextLoads() {
	}*/

	/*
	* JUnit中的注解
	* @BeforeClass:针对所有测试，先执行一次，且必须为static void
	* @Before:初始化方法，执行当前测试类的每个测试方法前执行
	* @Test：测试方法，在这里可以测试期望异常和超时时间
	* @After：释放资源，执行当前测试类的测试方法后执行
	* @AfterClass：针对所有测试，只执行一次，且必须为static void
	* @Ignore：忽略的测试方法（只在测试类的时候生效，单独执行该测试方法无效）
	* @RunWith:可以更改测试运行器 ，缺省值 org.junit.runner.Runner*/

	/*
	* 超时测试
	* */
	/*@Test(timeout = 5000)
	public void timeOutTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		System.out.println("****************Complate*****************");
	}*/

	/*
	* 异常测试
	* expected 参数和 @Test 注释一起使用
	* */
	/*@Test(expected = NullPointerException.class)
	public void nullExceptionTest() {
		throw new NullPointerException();
	}*/
//}/**/
