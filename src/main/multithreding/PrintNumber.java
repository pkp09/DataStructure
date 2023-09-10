package com.prashant.java.concept.multithreding;

public class PrintNumber {
	static int count = 1;

	public static void main(String[] args) {
		Object lock = new Object();
		Thread t1 = new Thread("Thread1") {
			public void run() {
				synchronized (lock) {
					while (count < 100) {
						System.out.println(Thread.currentThread().getName() + " : " + count++);
						try {
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		t1.start();

		Thread t2 = new Thread("Thread2") {
			public void run() {
				synchronized (lock) {
					while (count <= 100) {
						System.out.println(Thread.currentThread().getName() + " : " + count++);
						try {
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		t2.start();
	}
}