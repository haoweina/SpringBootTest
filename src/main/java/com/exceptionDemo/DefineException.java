package com.exceptionDemo;

/**
 * 自定义异常
 * */
public class DefineException extends Exception{

	// 用来存储当前出现异常所缺乏的钱
	private double amount;

	public DefineException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
