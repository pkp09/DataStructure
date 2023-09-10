package com.prashant.datastructure.queue;

import com.prashant.datastructure.linkedlist.Node;

public class LinkedListQueue {
	private int length;
	private Node front, rear;

	public LinkedListQueue() {
		length = 0;
		front = null;
		rear = null;
	}

	public boolean isEmpty() {
		return (length == 0);
	}

	public int size() {
		return length;
	}

	public void enqueue(Node node) {
		if (isEmpty())
			front = node;
		else
			rear.setNext(node);
		rear = node;
		length++;
	}

	public Node dequeue() throws Exception {
		if (isEmpty())
			throw new Exception("Queue is empty :  Underflown");
		Node result = front;
		front = front.getNext();
		length--;
		if (isEmpty())
			rear = null;
		return result;
	}

	public int first() throws Exception {
		if (isEmpty())
			throw new Exception();
		return front.getData();
	}

	public String toString() {
		String result = "";
		Node current = front;
		while (current != null) {
			result = result + current.toString() + " : ";
			current = current.getNext();
		}
		return result;
	}
}