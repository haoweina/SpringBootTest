package com.example.test;

/**
 * 形参： 方法被调用时需要传递进来的参数 func(int a)中的a，只有func被调用时a才有意义，会被分配内存空间，
 *      func执行完成后，a就会被销毁
 * 实参：方法被调用时传入的实际参数。
 * */
public class ParamTest {
	public static void func(int a) {
		a = 20;
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a = 10; // 实参
		func(a);
	}
}
