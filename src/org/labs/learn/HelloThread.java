package org.labs.learn;

public class HelloThread extends Thread implements Runnable {
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " hello world!");
		}
	}
	
}