package com.prashant.java.concept.multithreding;

public class PrintEvenOddNumber {
static Object lock = new Object();
	public static void main(String[] args) {

		Thread even = new Thread(new Even(lock), "Even");
		Thread odd = new Thread(new Odd(lock), "Odd");
		
		even.start();
		odd.start();
	}

}

class Even implements Runnable{
	Object lock = new Object();
	Even(Object lock){
		this.lock = lock;
	}
	public void run() {
		System.out.println("Print Event Number");
		synchronized(lock) {
			for(int i = 2; i < 51; i = i +2) {
				System.out.println("Thread Name : " + Thread.currentThread().getName() + " : i = " + i);
				try {
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Odd implements Runnable{
	Object lock = new Object();
	Odd(Object lock){
		this.lock = lock;
	}
	public void run() {
		System.out.println("Print Odd Number");
		synchronized(lock) {
			for(int i = 1; i < 50; i = i + 2) {
				System.out.println("Thread Name : " + Thread.currentThread().getName() + " : i = " + i);
				try {
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
		}
	}
}