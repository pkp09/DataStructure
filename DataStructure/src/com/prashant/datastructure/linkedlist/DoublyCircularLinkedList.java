package com.prashant.datastructure.linkedlist;

public class DoublyCircularLinkedList {
	DCLLNode head;
	private int length;

	public DoublyCircularLinkedList() {
		length = 0;
	}

	public DCLLNode getHead() {
		return head;
	}

	public int getLength() {
		return length;
	}

	public void traverse() {
		if (head == null)
			return;
		DCLLNode node = head;
		do {
			System.out.print(node.getData() + ", ");
			node = node.getNext();
		} while (node != head);
		System.out.println();
	}

	public void insertAtBegin(DCLLNode node) {
		if (head == null) {
			head = node;
			node.setNext(head);
			node.setPrev(head);
			length++;
		} else {
			DCLLNode current = head;
			while (current.getNext() != head) {
				current = current.getNext();
			}
			current.setNext(node);
			node.setPrev(current);
			head.setPrev(node);
			node.setNext(head);
			head = node;
			length++;
		}
	}

	public void insertAtEnd(DCLLNode node) {
		if (head == null) {
			head = node;
			node.setNext(head);
			node.setPrev(head);
			length++;
		} else {
			DCLLNode current = head;
			while (current.getNext() != head) {
				current = current.getNext();
			}
			current.setNext(node);
			node.setPrev(current);
			head.setPrev(node);
			node.setNext(head);
			length++;
		}
	}

	public void insert(int position, DCLLNode node) {
		if (head == null) {
			head = node;
			node.setNext(head);
			node.setPrev(head);
			length++;
		} else {
			DCLLNode temp = head;
			if (position > length)
				position = length;
			else if (position < 1)
				position = 1;

			if (position == 1) {
				while (temp.getNext() != head) {
					temp = temp.getNext();
				}
				temp.setNext(node);
				node.setPrev(temp);
				node.setNext(head);
				head.setPrev(node);
				length++;
			} else {
				int count = 1;
				DCLLNode prev = null;
				while (temp.getNext() != head && count != position) {
					count++;
					prev = temp;
					temp = temp.getNext();
				}
				prev.setNext(node);
				node.setPrev(prev);
				temp.setPrev(node);
				node.setNext(temp);
				length++;
			}
		}

	}

	public DCLLNode removeAtEnd() {
		if (head == null)
			return null;
		DCLLNode current = head, prev = null;
		while (current.getNext() != head) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(head);
		head.setPrev(prev);
		length--;
		return current;

	}

	public DCLLNode removeAtBegin() {
		if (head == null)
			return null;
		else {
			DCLLNode current = head, prev = null;
			while (current.getNext() != head) {
				current = current.getNext();
			}
			prev = head;
			head = head.getNext();
			current.setNext(head);
			head.setPrev(current);
			length--;
			return prev;
		}
	}

	public DCLLNode remove(int position) {
		if (head == null)
			return null;
		else {
			if (position < 1)
				position = 1;
			else if (position > length)
				position = length;
			DCLLNode current = head, prev = null;
			if (position == 1) {
				while (current.getNext() != head) {
					current = current.getNext();
				}
				prev = head;
				head = head.getNext();
				head.setPrev(current);
				current.setNext(head);
				length--;
				return prev;
			} else {
				int count = 1;
				while (current.getNext() != head && count != position) {
					prev = current;
					current = current.getNext();
					count++;
				}
				prev.setNext(current.getNext());
				current.getNext().setPrev(prev);
				length--;
				return current;
			}
		}
	}

	public boolean remove(DCLLNode node) {
		if (head == null)
			return false;
		else {
			DCLLNode current = head, prev = head;
			if (node == head) {
				while (current.getNext() != head) {
					prev = current;
					current = current.getNext();
				}
				head = head.getNext();
				head.setPrev(current);
				current.setNext(head);
			} else {
				while (current.getNext() != head && current != node) {
					prev = current;
					current = current.getNext();
				}
				prev.setNext(current.getNext());
				current.getNext().setPrev(prev);
			}
			length--;
			return true;
		}
	}

	public DCLLNode get(int index) {
		if (head == null)
			return null;
		if (index < 1)
			index = 1;
		else if (index > length)
			index = length;
		DCLLNode node = head;
		int count = 1;
		while (node.getNext() != head && count != index) {
			node = node.getNext();
			count++;
		}
		return node;
	}

	public void printRecursiveReverse(DCLLNode node) {
		if (head == null)
			return;
		DCLLNode current = node;
		while (current.getNext() != node) {
			printRecursiveReverse(current.getNext());
		}
		System.out.println(current.getData());
	}

	public void printReverse() {
		if (head == null)
			return;
		DCLLNode current = head;
		while (current.getPrev() != head) {
			System.out.println(current.getData());
			current = current.getPrev();
		}
	}

	public int frequency(DCLLNode node) {
		if (head == null || node == null)
			return 0;
		int count = 0;
		DCLLNode current = head;
		while (current.getNext() != head) {
			if (current == node)
				count++;
			current = current.getNext();
		}
		return count;
	}

	public DCLLNode findNElementFromLast(int n) {
		if (head == null)
			return null;
		if (n > length) {
			n = length;
		} else if (n < 1)
			n = 1;
		int index = (length + 1) - n;
		int count = 1;
		DCLLNode current = head;
		while (current.getNext() != head) {
			if (count == index) {
				return current;
			}
			count++;
			current = current.getNext();
		}
		return current;
	}

	public DCLLNode findMiddle() {
		if (head == null)
			return null;
		DCLLNode singleStep = head, doubleStep = head.getNext();
		while (singleStep.getNext() != head && doubleStep != null && doubleStep.getNext() != null
				&& doubleStep.getNext() != head) {
			singleStep = singleStep.getNext();
			doubleStep = doubleStep.getNext().getNext();
		}
		return singleStep;
	}

	// needs to work
	// https://www.geeksforgeeks.org/reverse-a-doubly-circular-linked-list/
	public void reverse() {
		if (head == null)
			return;
		DCLLNode current = head, prev = head.getPrev(), next = null;
		while(current.getNext() != head){
			next = current.getNext();
			current.setNext(prev);
			current.setPrev(next);
			prev = current;
			current = next;
		}
		//head.setNext(prev);
		// head = current;
	}

	public void recursiveReverse(DCLLNode node) {

	}

	/**
	 * Reverse the doubly circular linked list using SWAP technique
	 */
	public void reverseWithoutExtraSpace() {

		for (int i = 0; i < length; i++) {

		}
	}
}