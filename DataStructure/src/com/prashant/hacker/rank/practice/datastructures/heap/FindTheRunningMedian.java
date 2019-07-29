package com.prashant.hacker.rank.practice.datastructures.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindTheRunningMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, 4, 5, 3, 8, 7};
		runningMedian(a);
	}

	 /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        /*
         * Write your code here.
         */
    	List<Double> al = new ArrayList<>();
    	double[] d = new double[a.length];
    	int div = 0;
    	int meadian = 0;
    	double position = 0;
    	int size = 0;
    	for(int i = 0; i < a.length; i++ ) {
    		al.add((double) a[i]);
			Collections.sort(al);
			size = al.size();
			div = size / 2;
			meadian = size % 2;
			if(meadian == 0) {
				position = (double)(al.get(div-1)+ al.get(div))/2;
			}else {
				position = al.get(div+meadian-1);
			}
			d[i] = position;
    	}
    	
    	return d;
    }
    
    
    //==========================================
    // needs to work
    
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // keeps track of the SMALL numbers
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();                           // keeps track of the LARGE numbers
    
    public static void medianTracker(int [] array) {
        for (int i = 0; i < array.length; i++) {
            addNumber(array[i]);
            System.out.println(getMedian());
        }
    }
    
    private static void addNumber(int n) {
        if (maxHeap.isEmpty()) {
            maxHeap.add(n);
        } else if (maxHeap.size() == minHeap.size()) {
            if (n < minHeap.peek()) {
                maxHeap.add(n);
            } else {
                minHeap.add(n);
                maxHeap.add(minHeap.remove());
            }
        } else if (maxHeap.size() > minHeap.size()) {
            if (n > maxHeap.peek()) {
                minHeap.add(n);
            } else {
                maxHeap.add(n);
                minHeap.add(maxHeap.remove());
            }
        }
        // maxHeap will never have fewer elements than minHeap
    }
    
    private static double getMedian() {
        if (maxHeap.isEmpty()) {
            return 0;
        } else if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else { // maxHeap must have more elements than minHeap
            return maxHeap.peek();
        }
    }
    
    
}
