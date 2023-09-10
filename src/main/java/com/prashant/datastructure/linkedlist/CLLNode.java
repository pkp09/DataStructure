package com.prashant.datastructure.linkedlist;

public class CLLNode {
	
	private int data;
	private CLLNode next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public CLLNode getNext() {
		return next;
	}
	public void setNext(CLLNode next) {
		this.next = next;
	}
	
	/* toString implementation to print just the data */
	@Override
	public String toString() {
		return "Data Item = " + data;
	}
}
