package com.threadTest;

/**
 * 不共享变量的线程
 *
 * */
public class MyThreadNotShared extends Thread {

	private int count = 5;

	public MyThreadNotShared(String name) {
		super();
		this.setName(name);
	}

	public void run() {
		super.run();
		while(count > 0) {
			count--;
			System.out.println("由" + MyThreadNotShared.currentThread().getName() + "计算，count=" + count);
			System.out.println("线程标识符" + MyThreadNotShared.currentThread().getId());
			System.out.println("线程优先级" + MyThreadNotShared.currentThread().getPriority());
			System.out.println("线程是否活跃" + (MyThreadNotShared.currentThread().isAlive() ? "是" : "否"));
		}
	}
}
