package org.labs.learn;

import java.util.concurrent.atomic.AtomicInteger;

public class CountToMillionThread extends Thread implements Runnable {
	
	AtomicInteger count  = new AtomicInteger();
	
	@Override
	public void run() {
		synchronized(count) {
			while (count.get() < 1000000) {
				count.incrementAndGet();
			}
			
			System.out.println(Thread.currentThread().getName() + " reached " + count.get());
		}
	}
	
}