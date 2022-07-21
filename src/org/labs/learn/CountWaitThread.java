package org.labs.learn;

import java.util.concurrent.atomic.AtomicInteger;

public class CountWaitThread extends Thread implements Runnable {
	
	AtomicInteger count = new AtomicInteger();
	
	public CountWaitThread(AtomicInteger count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {
		synchronized(count) {
			try {
				count.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " reached " + count.get());
		}
	}
	
}