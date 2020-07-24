package com.exceptionDemo;

public class TestFinally {
	public static int test() {
		int a[] = new int[2];
		try {
			a[0] = 0;
			a[1] = 2;
			return a[1];
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			a[1] = 1;
		}
		return a[1];
	}

	public static void main(String[] args) {
		int ret = test();
		System.out.println("返回值：" + ret);
	}
}
