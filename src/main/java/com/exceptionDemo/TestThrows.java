package com.exceptionDemo;

public class TestThrows {
	static void throw1() throws IllegalAccessException {
		System.out.println("inseide throw1......");
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) throws IllegalAccessException {
		throw1();
	}
}
