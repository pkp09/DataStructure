package com.prashant.datastructure.linkedlist;

public class DCLLNode {
	private DCLLNode next;
	private DCLLNode prev;
	private int data;
	
	public DCLLNode getNext() {
		return next;
	}
	public void setNext(DCLLNode next) {
		this.next = next;
	}
	public DCLLNode getPrev() {
		return prev;
	}
	public void setPrev(DCLLNode prev) {
		this.prev = prev;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}