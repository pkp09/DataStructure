package com.prashant.datastructure.queue;

public class DynamicArrayQueue {
	int front, rear, size, capacity;
	Object[] array;

	public DynamicArrayQueue(int cap) {
		capacity = cap;
		array = new Object[cap];
		front = 0;
		size = 0;
		rear = capacity - 1;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean isFull() {
		return (size == capacity);
	}

	private void expand() {
		int length = size();
		Object[] newQueue = new Object[length << 1];
		for (int i = front; i < rear; i++) {
			newQueue[i - front] = array[i % capacity];
		}
		array = newQueue;
		front = 0;
		rear = size - 1;
		capacity *= 2;
	}

	public void enqueue(Object item) {
		if (size == capacity)
			expand();
		else {
			rear = (rear + 1) % capacity;
			array[rear] = item;
			size++;
		}
	}

	public Object dequeue() {
		if (size() == 0)
			return null;
		Object result = array[front];
		front = (front + 1) % capacity;
		size--;
		return result;
	}

	@Override
	public String toString() {
		String s = "";
		if (size == 0)
			return s;
		for (int i = 0; i < size(); i++) {
			s = s + array[i] + ", ";
		}
		s = s + "]";
		return s;
	}                  
}
