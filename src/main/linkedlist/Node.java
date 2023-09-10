package com.prashant.datastructure.linkedlist;

import com.prashant.datastructure.linkedlist.main.Emp;

public class Node {
	private Node next;
	private int data;
	private Emp emp;

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}
