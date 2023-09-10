package com.prashant.java.concept.multithreding;

public class PrintNumberInSequence {
	static int counter = 0;
	static int lastThread = 0;
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			Object lock = new Object();
			new ThreadCounter(i, lock).start();
			// counter = i;
			/*Thread t1 = new Thread() {
				public void run() {
					synchronized (lock) {
						try {
							while(lastThread != counter) {
								lock.wait(1000);
							}
							lastThread++;
							System.out.println(Thread.currentThread().getName() + " : " + counter++);
							lock.notifyAll();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			t1.start();*/
		}
	}

}

class ThreadCounter extends Thread {
	int count = 0;
	Object lock = null;
	ThreadCounter(int count, Object lock) {
		this.count = count;
		this.lock = lock;
	}

	public void run() {
		synchronized (this) {
			try {
				while(count > 100) {
					this.wait();
				}
				System.out.println(Thread.currentThread().getName() + " : " + count);
				this.notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
