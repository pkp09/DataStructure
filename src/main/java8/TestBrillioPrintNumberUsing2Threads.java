package com.prashant.java.concept.java8;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBrillioPrintNumberUsing2Threads {
/*
 * Even thread and Odd Thread
 * 1-50
 * Print the number using 2 threads 
*/	
	int count = 1;
	public static void main(String[] args) {
		TestBrillioPrintNumberUsing2Threads obj = new TestBrillioPrintNumberUsing2Threads();
		obj.main();
		/*TestBrillioPrintNumberUsing2Threads tb = new TestBrillioPrintNumberUsing2Threads();
		Thread even = new Thread(new Runnable() {
			@Override
			public void run() {
				tb.printEven();
			}
		});
		even.setName("Even");

		Thread odd = new Thread(new Runnable() {
			@Override
			public void run() {
				tb.printOdd();
			}
		});
		odd.setName("Odd");
		odd.start();
		even.start();*/
	}
	
	public void printEven() {
		synchronized(this) {
			while(count < 50) {
				while(count % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " : " + count);
				count++;
				this.notify();
			}
		}
	}
	
	public void printOdd() {
		synchronized(this) {
			while(count < 50) {
				while(count % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + count);
				count++;
				this.notify();
			}
		}
	}
	
	Integer calculateHashCode;
	@Override
	public int hashCode() {
		return this.count;
		
	}

	public void sort(int[]a) {
		for(int i = 1; i < a.length; ++i) {
			int k = a[i];
			int j = i-1;
			while(j >= 0  && a[j] > k) {
				a[j + 1] = a[j];
				j = j -1;
			}
			a[j + 1] = k;
		}
		
	
	}
	
	public void printarr(int[]a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public TreeSet<Integer> merge(int[]a, int[]b) {
		TreeSet<Integer> sortSet = new TreeSet<>();
		for(int i = 0; i<a.length; i++) {
			sortSet.add(a[i]);
		}
		
		for(int i = 0; i<b.length; i++) {
			sortSet.add(b[i]);
		}
		return sortSet;
	}
	
	public void main() {
		int[] a= {10, 12, 1, 3};
		sort(a);
		int[]b = {4, 6,8};
		sort(b);
		
		TreeSet<Integer> mergedArray = merge(a, b);
		Iterator<Integer> it = mergedArray.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
