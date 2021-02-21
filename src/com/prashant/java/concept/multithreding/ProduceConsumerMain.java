package com.prashant.java.concept.multithreding;

import java.util.ArrayList;
import java.util.List;

public class ProduceConsumerMain {

	public static void main(String[] args) {
		List<Integer> workQueue = new ArrayList<>();
		Thread producer = new Thread(new Producer(workQueue, 10), "Producer1");
		Thread producer2 = new Thread(new Producer(workQueue, 10), "Producer2");
		Thread consumer = new Thread(new Consumer(workQueue), "Consumer1");
		Thread consumer2 = new Thread(new Consumer(workQueue), "Consumer2");
		producer.start();
		
		consumer.start();
		
		producer2.start();
		
		consumer2.start();
	}

}
