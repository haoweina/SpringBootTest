package com.exceptionDemo;

public class TestException {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		try{
			System.out.println("a/b的值是：" + a / b);
			System.out.println("this will not be printed!");
		}catch (ArithmeticException e){
			System.out.println("程序出现异常，变量b不能为0！" + e);
		}
		System.out.println("程序正常结束。");
	}
}
