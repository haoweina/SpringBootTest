package com.threadTest;
/**
 * 共享变量的线程
 *
 * */
public class MyThreadShareVar extends Thread {

	private int count = 5;

	public synchronized void run() {
		super.run();
		count--;
		System.out.println("由" + MyThreadShareVar.currentThread().getName() + "计算，count=" + count);
	}
}
