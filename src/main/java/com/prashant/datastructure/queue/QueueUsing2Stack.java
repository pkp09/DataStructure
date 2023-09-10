package com.prashant.datastructure.queue;

import java.util.Stack;

// Still needs to work
// https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
public class QueueUsing2Stack {
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	/* The method insert to push element into the queue */
	void insert(int B) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s2.push(B);

		while (!s2.isEmpty())
			s1.push(s2.pop());
	}

	/* The method remove which return the element popped out of the queue */
	int remove() {
		if (s1.isEmpty())
			return -1;
		return s1.pop();
	}

	public Integer peek() {
        if (s1.isEmpty())
           return null;
       return s1.peek();
   }
	
	public static void main(String argd[]) {
		QueueUsing2Stack q = new QueueUsing2Stack();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		System.out.println(q.peek());
		System.out.println(q.remove());
	}
}
