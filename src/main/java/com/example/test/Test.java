package com.example.test;

public class Test {
	public static void main(String[]args) {
		BaseClass a = new BaseClass();
		BaseClass b = new SubClass();
		a.baseMethod();
		b.baseMethod();
	}
}
