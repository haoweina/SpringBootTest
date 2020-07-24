package com.exceptionDemo;

public class CheckingAccount {

	// 余额
	private double balance;
	//卡号
	private int number;

	public CheckingAccount(int number)
	{
		this.number = number;
	}

	// 存钱
	public void deposit(double amount) {
		balance += amount;
	}

	// 取钱
	public void withdraw(double amount) throws DefineException {
		if (amount <= balance){
			balance -= amount;
		}else {
			double needs = amount - balance;
			throw new DefineException(needs);
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
}
