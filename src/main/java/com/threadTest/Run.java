package com.threadTest;

public class Run {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("运行结束");
		System.out.println();
		/*Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("运行结束！");*/

		/*
		MyThreadNotShared a = new MyThreadNotShared("A");
		MyThreadNotShared b = new MyThreadNotShared("B");
		MyThreadNotShared c = new MyThreadNotShared("C");
		a.start();
		b.start();
		c.start();
		*/

		/*
		MyThreadShareVar myThreadShareVar = new MyThreadShareVar();
		// 下列线程都是通过myThreadShareVar对象创建
		Thread a = new Thread(myThreadShareVar, "A");
		Thread b = new Thread(myThreadShareVar, "B");
		Thread c = new Thread(myThreadShareVar, "C");
		a.start();
		b.start();
		c.start();*/

		/*try {
			MyThread thread = new MyThread();
			thread.start();
			thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");*/
	}

	/**
	 * 运行结果：
		运行结束
	    My Thread
	 线程是一个子任务，CPU以不确定的方式，或者说是以随机的时间来调用线程中的run方法。
	 */
}
