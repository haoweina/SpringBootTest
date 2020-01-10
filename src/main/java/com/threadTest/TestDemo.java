package com.threadTest;

public class TestDemo {

	public static void main(String[] args) {
		Runnable tr = new TestRunnable();
		Thread thread = new Thread(tr);
		//thread.setDaemon(true);
		thread.start();
	}
}
