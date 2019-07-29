package com.prashant.datastructure.queue;

import java.util.Stack;

// https://www.geeksforgeeks.org/queue-data-structure/
public class FixedSizeArrayQueue {

	int front, rear, size, capacity;
	Object[] array;

	public FixedSizeArrayQueue(int capacity) {
		this.capacity = capacity;
		front = 0;
		size = 0;
		rear = capacity - 1;
		array = new Object[this.capacity];
	}

	public boolean isFull(FixedSizeArrayQueue queue) {
		return (queue.size == queue.capacity);
	}

	public boolean isEmpty(FixedSizeArrayQueue queue) {
		return (queue.size == 0);
	}

	public int size() {
		return size;
	}

	public void enqueue(Object item) {
		if (isFull(this))
			return;
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
	}

	public Object dequeue() {
		if (isEmpty(this))
			return null;
		Object result = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return result;
	}

	public Object front() {
		if (isFull(this))
			return null;
		return this.array[this.front];
	}

	public Object rear() {
		if (isEmpty(this))
			return null;
		return this.array[this.rear];
	}

	@Override
	public String toString() {
		if (size() < 0)
			return "";
		String s = "[";
		for (int i = 0; i < size(); i++)
			s = s + array[i] + ", ";
		s = s + "]";
		return s;
	}
	
	/**
	 * Reverse a stack using queue.
	 */
	public void reverseQueue() {
		Stack<Object> stack = new Stack<Object>();
		while(!isEmpty(this))
			stack.push(dequeue());
		while(!stack.isEmpty())
			enqueue(stack.pop());
	}
}