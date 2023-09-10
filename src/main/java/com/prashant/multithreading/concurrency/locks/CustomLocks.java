package com.prashant.multithreading.concurrency.locks;

public class CustomLocks {
	private boolean isLocked = false;
	private int lockedCounter = 0;
	Thread lockedBy = null;
	
	public synchronized void lock() throws InterruptedException {
		Thread callingThread = Thread.currentThread();
		while(callingThread != lockedBy && isLocked) {
			wait();
		}
		lockedCounter++;
		isLocked = true;
		lockedBy = callingThread;
	}
	

	public synchronized void unlock() {
		Thread callingThread = Thread.currentThread();
		if(callingThread == lockedBy) {
			lockedCounter--;
		}
		if(lockedCounter == 0) {
			isLocked = false;
			notify();
		}
	}
}
