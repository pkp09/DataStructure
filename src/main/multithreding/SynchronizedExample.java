package com.prashant.java.concept.multithreding;

public class SynchronizedExample {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread t1 = new CounterThread(counter);
		Thread t2 = new CounterThread(counter);
		t1.start();
		t2.start();
	}

}

class Counter{
	long count = 0;
	
	public synchronized long add(long value) {
		count +=  value;
		System.out.println(Thread.currentThread().getName() + " : Count : " + count);
		return count;
	}
}


class CounterThread extends Thread{
	protected Counter counter = null;
	
	public CounterThread(Counter counter){
		this.counter = counter;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			counter.add(i);
		}
	}
}