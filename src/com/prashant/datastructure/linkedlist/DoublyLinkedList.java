package com.prashant.datastructure.linkedlist;

public class DoublyLinkedList {
	private DLLNode head;
	private int length;

	public DoublyLinkedList() {
		length = 0;
	}

	public DLLNode getHead() {
		return head;
	}

	public int length() {
		return length;
	}

	public void traverse() {
		DLLNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + ", ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void insertAtBegin(DLLNode node) {
		if (head == null) {
			head = node;
			head.setPrev(null);
		} else {
			DLLNode temp = head;
			head.setPrev(node);
			head = node;
			head.setNext(temp);
			head.setPrev(null);
		}
		length++;
	}

	public void insertAtEnd(DLLNode node) {
		DLLNode temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
		node.setPrev(temp);
		length++;
	}

	public void insert(int position, DLLNode node) {
		DLLNode next = head, prev = null;
		int count = 0;
		if (position <= 0) {
			head = node;
			head.setPrev(null);
			length++;
			return;
		} else if (position > length) {
			position = length;
		}
		while (next != null && count != position) {
			next = next.getNext();
			prev = next.getPrev();
			count++;
		}
		prev.setNext(node);
		node.setPrev(prev);
		node.setNext(next);
		next.setPrev(node);
		length++;
	}

	public void removeAtEnd() {
		DLLNode next = head;
		while (next != null && next.getNext() != null && next.getNext().getNext() != null)
			next = next.getNext();
		next.setNext(null);
		length--;
	}

	public void removeAtBegin() {
		DLLNode next = head;
		if (next != null) {
			next = next.getNext();
			head = next;
			head.setPrev(null);
		}
		length--;
	}

	public DLLNode remove(int position) {
		if (position < 0)
			position = 1;
		else if (position > length)
			position = length;

		DLLNode next = head, prev = null, temp = null;
		int count = 0;
		while (next != null && count != position) {
			temp = next;
			prev = next.getPrev();
			next = next.getNext();
			count++;
		}
		prev.setNext(next);
		next.setPrev(prev);
		length--;
		return temp;
	}

	public void remove(DLLNode node) {
		DLLNode temp = head, next = null, prev = null;
		while (temp != null) {
			if (temp.getData() == node.getData()) {
				prev = temp.getPrev();
				next = temp.getNext();
				break;
			}
			temp = temp.getNext();
		}
		prev.setNext(next);
		next.setPrev(prev);
		length--;
	}

	public DLLNode get(int index) {
		DLLNode next = head, temp = null;
		if (index < 0)
			index = 1;
		else if (index > length)
			index = length;
		int count = 0;
		while (next != null && count != index) {
			temp = next;
			next = next.getNext();
			count++;
		}
		return temp;
	}

	public void printRecursiveReverse(DLLNode node) {
		if (node.getNext() != null)
			printRecursiveReverse(node.getNext());

		System.out.println(node.getData());
	}

	public void printReverse() {
		DLLNode temp = head;
		while (temp.getNext() != null)
			temp = temp.getNext();

		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getPrev();
		}
	}

	// count number of occurrences of given key in linked list.
	public int frequency(Node node) {
		DLLNode temp = head;
		int count = 0;
		while (temp != null) {
			if (temp.getData() == node.getData())
				count++;
			temp = temp.getNext();
		}
		return count;
	}

	public DLLNode findNElementFromLast(int n) {
		DLLNode temp = head;
		int index = (length + 1) - n;
		int count = 1;
		while (temp != null && count != index) {
			temp = temp.getNext();
			count++;
		}
		return temp;
	}

	public DLLNode findMiddle() {
		DLLNode slow = head, fast = head.getNext().getNext();
		while (slow != null && fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext();
		}
		return slow;
	}

	public void reverse2() {
		DLLNode temp = null, current = head;

		while (current != null) {
			temp = current.getPrev();
			current.setPrev(current.getNext());
			current.setNext(temp);
			current = current.getNext();
		}
		if (temp != null)
			head = temp.getPrev();
	}

	// reverse with 3 variable
	public void reverse() {
		DLLNode prev = null, next = null, current = head;
		while (current != null) {
			prev = current.getPrev();
			next = current.getNext();
			current.setPrev(next);
			current.setNext(prev);

			current = current.getPrev();
		}

		/*
		 * Before changing head, check for the cases like empty list and list with only
		 * one node
		 */
		if (prev != null) {
			head = prev.getPrev();
		}
	}

	// reverse with 2 variable
	public void reverse1() {
		DLLNode temp = null, current = head;
		/*
		 * swap next and prev for all nodes of doubly linked list
		 */
		while (current != null) {
			temp = current.getPrev();
			current.setPrev(current.getNext());
			current.setNext(temp);
			current = current.getPrev();
		}

		/*
		 * Before changing head, check for the cases like empty list and list with only
		 * one node
		 */
		if (temp != null) {
			head = temp.getPrev();
		}
	}

	public void recursiveReverse(DLLNode node) {
		DLLNode prev = null;
		if (node == null)
			return;
		else {
			prev = node.getPrev();
			node.setPrev(node.getNext());
			node.setNext(prev);
			if (prev != null)
				head = prev.getPrev();

			recursiveReverse(node.getPrev());
		}
	}

	/**
	 * Reverse the doubly linked list using SWAP technique
	 */
	public void reverseWithoutExtraSpace() {

		for (int i = 0; i < length; i++) {

		}
	}

	// needs to work
	// https://www.geeksforgeeks.org/reverse-a-doubly-linked-list/
	public void reverse3() {
		if (head == null)
			return;
		DLLNode prev = null, next = null, current = head;

		while (current != null) {
			next = current.getNext();
			current.setPrev(next);
			prev = current;
			current.setNext(prev);
			current = next;
		}
		head = prev;
	}
	
	// needs to work
	// https://www.geeksforgeeks.org/bubble-sort-on-doubly-linked-list/
	public void bubbleSort() {
		DLLNode current = head, temp = null;
		for(int i = 0; i < length(); i++) {
			while(current != null && current.getNext() != null) {
				if(current.getData() > current.getNext().getData()) {
					// swap logic
					temp = current.getPrev();
					current.setPrev(current.getNext());
					current.setNext(temp);
					current = current.getPrev();
				}else
					current = current.getNext();
			}
		}
		
	}
}