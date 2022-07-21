package org.labs.learn;

import java.util.concurrent.atomic.AtomicInteger;

public class CountNotifyThread extends Thread implements Runnable {
	
	AtomicInteger count = new AtomicInteger();
	
	public CountNotifyThread(AtomicInteger count) {
		super();
		this.count = count;
	}
	
	@Override
	public void run() {
		synchronized(count) {
			while (count.get() < 1000000) {
				count.incrementAndGet();
			}
			
			count.notify();
		}
	}
	
}