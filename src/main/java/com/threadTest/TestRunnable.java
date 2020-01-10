package com.threadTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestRunnable implements Runnable{

	@Override public void run() {
		try {
			Thread.sleep(1000); // 守护线程阻塞1秒后运行
			File f = new File("D:/daemon.txt");
			FileOutputStream os = new FileOutputStream(f,true);
			os.write("deamon".getBytes());
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}
}
