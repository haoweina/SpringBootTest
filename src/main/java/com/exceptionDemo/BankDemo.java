package com.exceptionDemo;

public class BankDemo {
	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("Depositing $500...");
		c.deposit(500.00);
		try{
			System.out.println("withdraw $100");
			c.withdraw(100.00);
			System.out.println("widthdraw $600");
			c.withdraw(600.00);
		} catch (DefineException e) {
			System.out.println("Sorry, but you are short $" + e.getAmount());
			e.printStackTrace();
		}
	}
}
