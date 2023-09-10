package com.prashant.java.concept.multithreding;

import java.util.List;

public class Producer  implements Runnable {
	List<Integer> workQueue;
	int MAX_CAPACITY;
	public Producer(List<Integer> workQueue, int maxCapacity) {
		this.workQueue = workQueue;
		this.MAX_CAPACITY = maxCapacity;
	}

	@Override
	public void run() {
		int count = 0;
		while(true) {
			try {
				produce(count++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void produce(int count) throws InterruptedException {
		synchronized(workQueue){
			while(workQueue.size() == MAX_CAPACITY) {
				System.out.println("Size is full for Thread : " + Thread.currentThread().getName());
				workQueue.wait();
			}
			Thread.sleep(100);
			workQueue.add(count);
			System.out.println("Count : " + count + "\tThread Name : " + Thread.currentThread().getName());
			workQueue.notify();
		}
	}
}
