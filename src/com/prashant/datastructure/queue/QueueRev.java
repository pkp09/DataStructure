package com.prashant.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueRev {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		System.out.println("Before " + q.toString());
		System.out.println("After " + reverseQueueRecursion(q).toString());
		//Queue<Integer> q1 = modifyQueue(q, 4);
		// System.out.println(q1.toString());

	}

	// Queue Reversal
	// https://practice.geeksforgeeks.org/problems/queue-reversal/1
	public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> stack = new Stack<Integer>();
        while(!q.isEmpty())
        	stack.push(q.poll());
        while(!stack.isEmpty())
        	q.add(stack.pop());
        return q;
	}
	
	// Reverse First K elements of Queue
	// https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1/?ref=self
	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		while(!q.isEmpty() && count != k) {
			stack.push(q.poll());
			count++;
		}
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		while(!stack.isEmpty()) {
			q1.add(stack.pop());
		}
		while(!q.isEmpty())
			q1.add(q.poll());
		return q1;
    }
	
	// https://practice.geeksforgeeks.org/problems/queue-reversal/1
	// Queue Reversal using recursion
	static Queue<Integer> reverseQueueRecursion(Queue<Integer> q) {
		while(q.isEmpty())
			return q;
		int data = q.poll();
		reverseQueueRecursion(q);
		q.add(data);
		
		return q;
	}
	
	// https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1/?ref=self
	
	
	// https://www.geeksforgeeks.org/sharing-queue-among-three-threads/
	
}
