package com.prashant.java.concept.java8;

public class PrintNumberUsing3Threads {

	public static void main(String[] args) {

		PrintNumber thread1 = new PrintNumber(1, 10);
		thread1.setName("Thread-1");
		PrintNumber thread2 = new PrintNumber(2, 10);
		thread2.setName("Thread-2");
		PrintNumber thread3 = new PrintNumber(0, 10);
		thread3.setName("Thread-0");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}


class PrintNumber extends Thread{
	int remainder;
	int max_number;
	static int seq = 0;
	static Object lock = new Object();
	PrintNumber(int remainder, int max_number){
		this.remainder = remainder;
		this.max_number = max_number;
	}
	
	@Override
	public void run() {
		while(seq < max_number-1) {
			synchronized(lock) {
				while(seq % 3 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + " : " + seq);
				seq++;
				lock.notifyAll();
			}
		}
	}
}