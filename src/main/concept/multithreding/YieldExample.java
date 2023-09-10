package com.prashant.java.concept.multithreding;

public class YieldExample {

	public static void main(String[] args) {
		Thread producer = new Thread(new Producer1(), "Producer");
		
		Consumer1 consumer = new Consumer1();
		consumer.setName("Consumer");
		
		producer.setPriority(Thread.MIN_PRIORITY);
		consumer.setPriority(Thread.MAX_PRIORITY);
		
		consumer.start();
		producer.start();
	}

}

class Consumer1 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("This is Consumer : "+ i);
			 Thread.yield();
			}	
	}
}

class Producer1 implements Runnable{
	@Override
	public void run() {
	for(int i = 0; i < 10; i++) {
		System.out.println("This is Producer : "+ i);
		Thread.yield();
		}	
	}
}