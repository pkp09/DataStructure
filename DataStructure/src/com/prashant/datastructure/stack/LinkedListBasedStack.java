package com.prashant.datastructure.stack;

import com.prashant.datastructure.linkedlist.Node;

public class LinkedListBasedStack {
	Node top;
	private int length;

	public LinkedListBasedStack(){
		length = 0;
	}
	public int length() {
		return length;
	}

	public void push(Node node) {
		node.setNext(top);
		top = node;
		length++;
	}
	
	public Node pop() {
		if(top == null)
			return null;
		Node current = top;
		top = top.getNext();
		length--;
		return current;
	}
	
	public Node peek() {
		return top;
	}
	
	public boolean isEmpty() {
		return(length < 1);
	}
	
	@Override
	public String toString() {
		String s = "[";
		Node current = top;
		while(current != null) {
			s = s + top.getData() + ", ";
			current.getNext();
		}
		s = s + "]";
		return s;
	}
}
