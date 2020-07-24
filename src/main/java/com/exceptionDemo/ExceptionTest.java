package com.exceptionDemo;

public class ExceptionTest {

	public static void main(String[] args) {
		try{
			int a[] = new int[2];
			System.out.println("Array element three:" + a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception throw" + e);
		}
		System.out.println("Out of the block");
	}
}
