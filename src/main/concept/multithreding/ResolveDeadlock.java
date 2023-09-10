package com.prashant.java.concept.multithreding;

public class ResolveDeadlock {
	public static void main(String ...arg) {
		final A1 a = new A1(10);
		final B1 b = new B1(20);
		
		Runnable thread1 = new Runnable() {
			@Override
			public void run() {
				synchronized(a) {
					try {
						System.out.println("Synchronized Block A1 : " + a.getI() + " Thread :" + Thread.currentThread().getName());
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Now trying to enter get the lock of B");
					synchronized (b) {
						System.out.println("Synchronized Block B1 : " + b.getJ() + " Thread :" + Thread.currentThread().getName());
						
					}
				}
			}
		};
		
		Runnable thread2 = new Runnable() {
			public void run() {
				synchronized(a) {
					try {
						System.out.println("Synchronized Block B2 : " + b.getJ() + " Thread :" + Thread.currentThread().getName());
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Now trying to enter get the lock of A");
					synchronized(b) {
						System.out.println("Synchronized Block A2 : " + a.getI() + " Thread :" + Thread.currentThread().getName());
					}
				}
			}
		}; 
		
		new Thread(thread1, "Thread1").start();
		new Thread(thread2, "Thread2").start();
	}

}


class A1{
	int i;
	public A1(int i) {
		this.i = i;
	}
	public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

class B1{
	int j;

	public B1(int j) {
		this.j = j;
	}
	public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}