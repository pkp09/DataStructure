package com.prashant.java.concept.multithreding;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> workQueue;
	public Consumer(List<Integer> queue) {
		this.workQueue = queue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}

	public void consume() throws InterruptedException{
		synchronized(workQueue) {
			while(workQueue.isEmpty()) {
				System.out.println("Work Queue is Empty on Thread : " + Thread.currentThread().getName());
				workQueue.wait();
			}
			Thread.sleep(100);
			Integer i = workQueue.remove(0);
			System.out.println("Removed Queue data : " + i + "\tThread Name : " + Thread.currentThread().getName());
			workQueue.notifyAll();
		}
	}
}
