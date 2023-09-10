package com.prashant.java.concept.multithreding;

public class JoinExample {

	public static void main(String[] args)throws InterruptedException {

		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("First Thread run()");
				try {
					System.out.println("Calling Thread.sleep(1000)");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("First Thread run() completed");
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Second Thread run()");
			}
		});

		t1.start();
		System.out.println("Join called on t1");
		t1.join();
		t2.start();
	}

}
