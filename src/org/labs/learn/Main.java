package org.labs.learn;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

        public static void main(String[] args) throws InterruptedException {

                System.out.println("---------- Part 1 ----------");

                HelloThread helloThread1 = new HelloThread();
                HelloThread helloThread2 = new HelloThread();
                helloThread1.start();
                helloThread1.join();
                helloThread2.start();
                helloThread2.join();

                System.out.println("---------- Part 2 ----------");

                CountToMillionThread countThread1 = new CountToMillionThread();
                CountToMillionThread countThread2 = new CountToMillionThread();
                countThread1.start();
                countThread2.start();
                countThread1.join();
                countThread2.join();

                System.out.println("---------- Part 3 ----------");

                AtomicInteger count = new AtomicInteger(0);
                CountWaitThread countWaitThread = new CountWaitThread(count);
                CountNotifyThread countNotifyThread = new CountNotifyThread(count);
                countWaitThread.start();
                countNotifyThread.start();
                countWaitThread.join();
                countNotifyThread.join();

        }

}
