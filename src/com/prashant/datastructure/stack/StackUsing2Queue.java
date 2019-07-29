package com.prashant.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

// https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1/?ref=self
public class StackUsing2Queue {

	Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
   // needs to work
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	// Your code here
    	if(q1.isEmpty())
    		return -1;
    	while(!q1.isEmpty())
    		q2.add(q1.poll());
    	
    	if(q2.isEmpty())
    		return -1;
    	int result = q2.poll();
    	return result;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
    	q1.add(a);
    }
    
    public static void main(String args[]) {
    	StackUsing2Queue queue = new StackUsing2Queue();
    	queue.push(1);
    	queue.push(2);
    	queue.push(3);
    	queue.push(4);
    	System.out.println(queue.toString());
    	
    	System.out.println(queue.pop());
    	System.out.println(queue.toString());
    }
}
