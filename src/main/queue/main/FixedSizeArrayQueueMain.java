package com.prashant.datastructure.queue.main;

import com.prashant.datastructure.queue.FixedSizeArrayQueue;

public class FixedSizeArrayQueueMain {

	public static void main(String[] args) {
		FixedSizeArrayQueue queue = new FixedSizeArrayQueue(12);
		queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40); 
        queue.enqueue(50); 
        queue.enqueue(60); 
        queue.enqueue(70); 
        queue.enqueue(80); 
        queue.enqueue(90); 
        queue.enqueue(100); 
        queue.enqueue(110); 
        queue.enqueue(120); 
        queue.enqueue(130); 
        System.out.println(queue.toString());
        
        queue.reverseQueue();

        System.out.println("Reversed Queue : " + queue.toString());
        
		System.out.println("Front item is " + queue.front());
		System.out.println("Rear item is " + queue.rear());
        
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");

        System.out.println(queue.toString());
		
		System.out.println("Front item is " + queue.front());
		System.out.println("Rear item is " + queue.rear());
	}

}
