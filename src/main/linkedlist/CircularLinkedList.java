package com.prashant.datastructure.linkedlist;

public class CircularLinkedList<E> {
	private int length;
	CLLNode head;

	public CircularLinkedList() {
		length = 0;
	}

	public int getLength() {
		return length;
	}

	public CLLNode getHead() {
		return head;
	}

	public void traverse() {
		CLLNode node1 = head;
		if (head == null)
			return;
		else {
			do {
				System.out.print(node1.getData() + " , ");
				node1 = node1.getNext();
			} while (node1 != head);
		}
		System.out.println();
	}

	public void insertAtBegin(CLLNode node) {
		node.setNext(node);
		if (head == null) {
			head = node;
			length++;
		} else {
			CLLNode temp = head;
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			temp.setNext(node);
			node.setNext(head);
			head = node;
			length++;
		}
	}

	public void insertAtEnd(CLLNode node) {
		CLLNode temp = head;
		while (temp != null && temp.getNext() != head) {
			temp = temp.getNext();
		}
		node.setNext(node);
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			temp.setNext(node);
			length++;
		}
	}

	public void insertAtEnd1(CLLNode node) {
		CLLNode temp = head;
		node.setNext(node);
		if (head == null) {
			head = node;
		} else {
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			node.setNext(head);
			temp.setNext(node);
			length++;
		}
	}

	public boolean insert(CLLNode node, int index) {
		CLLNode current = head;
		node.setNext(node);

		if (index <= 0)
			index = 1;
		else if (index > length)
			index = length;

		if (head == null) {
			head = node;
			length++;
			return true;
		} // index = 1 means insert at head position
		else if (index == 1) {
			while (current.getNext() != head) {
				current = current.getNext();
			}
			current.setNext(node);
			node.setNext(head);
			head = node;
			length++;
			return true;
		} else {
			int count = 1;
			CLLNode temp = head;
			while (current.getNext() != head) {
				if (count != index - 1) {
					count++;
					temp = current.getNext();
					current = current.getNext();
				} else {
					node.setNext(temp.getNext());
					current.setNext(node);
					length++;
					return true;
				}
			}
		}
		return false;
	}

	public boolean insert1(CLLNode node, int index) {
		CLLNode current = head;
		node.setNext(node);
		if (index <= 0)
			index = 1;
		else if (index > length)
			index = length;

		if (head == null) {
			head = node;
			length++;
			return true;
		} // index = 1 means insert at head position
		else if (index == 1) {
			while (current.getNext() != head) {
				current = current.getNext();
			}
			current.setNext(node);
			node.setNext(head);
			head = node;
			length++;
			return true;
		} else {
			int count = 1;
			CLLNode temp = head;
			while (current.getNext() != head && count != index - 1) {
				count++;
				temp = current.getNext();
				current = current.getNext();
			}
			node.setNext(temp.getNext());
			current.setNext(node);
			length++;
			return true;
		}
	}

	public boolean remove(int index) {
		if (index < 1)
			index = 1;
		else if (index > length)
			index = length;

		if (head == null)
			return false;
		else {
			CLLNode current = head, temp = head;
			// index = 1 means remove data from the head.
			if (index == 1) {
				while (current.getNext() != head) {
					current = current.getNext();
				}
				head = head.getNext();
				current.setNext(head);
				length--;
				return true;
			} else {
				int count = 0;
				while (current.getNext() != head && count != index - 1) {
					count++;
					temp = current;
					current = current.getNext();
				}
				temp.setNext(current.getNext());
				length--;
				return true;
			}
		}
	}

	public boolean removeHead() {
		CLLNode current = head;
		if (head == null)
			return false;
		else {
			while (current.getNext() != head) {
				current = current.getNext();
			}
			head = head.getNext();
			current.setNext(head);
			length--;
			return true;
		}
	}

	public boolean removeTail() {
		CLLNode current = head, lastPrev = null;
		if (head == null)
			return false;
		else {
			while (current.getNext() != head) {
				lastPrev = current;
				current = current.getNext();
			}
			lastPrev.setNext(head);
			length--;
			return true;
		}
	}

	public boolean removeMatched(CLLNode node) {
		if (head == null)
			return false;
		CLLNode current = head, prev = head;
		if (node.getData() == head.getData()) {
			while (current.getNext() != head)
				current = current.getNext();
			head = head.getNext();
			current.setNext(head);
			return true;
		}
		while (current.getNext() != head) {
			if (current.getData() != node.getData()) {
				prev = current;
				current = current.getNext();
			} else {
				prev.setNext(current.getNext());
				return true;
			}
		}
		return false;
	}

	public CLLNode get(int index) {
		CLLNode temp = head;
		int count = 1;
		if (head == null || index < 1 || index > length)
			return null;
		else {
			while (temp.getNext() != head) {
				if (count != index) {
					count++;
					temp = temp.getNext();
				} else {
					return temp;
				}
			}
			return temp;
		}
	}

	public boolean get(CLLNode node) {
		CLLNode current = head;
		if (head == null)
			return false;
		else {
			while (current.getNext() != head) {
				if (current == node) {
					return true;
				} else {
					current = current.getNext();
				}
			}
		}
		return false;
	}

	public CLLNode findMiddle() {
		if (head == null)
			return new CLLNode();
		CLLNode slow = head, fast = head.getNext();
		while (slow != null && slow.getNext() != head && fast != null && fast != head && fast.getNext() != head) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}

	// 1, 2, 3, 4, 5, 6
	public CLLNode findNElementFromLast(int n) {
		if (head == null)
			return new CLLNode();
		int index = length - n;
		if (index < 1)
			index = 1;
		else if (index > length)
			index = length;
		CLLNode current = head;
		int count = 1;
		while (current.getNext() != head && count != index) {
			count++;
			current = current.getNext();
		}
		return current;
	}

	public int frequency(CLLNode node) {
		int count = 0;
		CLLNode current = head;
		if (head == null)
			return 0;
		if (node.getData() == head.getData())
			count++;
		while (current.getNext() != head) {
			if (current.getData() == node.getData())
				count++;
			current = current.getNext();
		}
		return count;
	}

	public void printReverse(CLLNode node) {
		if(head == null)
			return ;
		if(node.getNext() != head)
			printReverse(node.getNext());
		System.out.print(node.getData() + " : ");
	}

	// still needs to work
	public void reverse() {
		if(head == null)
			return;
		CLLNode prev = null, current = head,  next = null;
		while(current.getNext() != head) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head.setNext(prev);
		head = prev;
		
		// temp.setNext(head);
	}

	//still needs to work
	public void reverse1() {
		if(head == null)
			return;
		CLLNode prev = null, current = head,  next = null;
		while(current.getNext() != head) {
			prev = current;
			next = current.getNext();
			next.setNext(prev);
			current.setNext(prev);
			// prev = current;
			current = next;
		}
		head.setNext(prev);
		head = prev;
		
		// temp.setNext(head);
	}

	
	public void recursiveReverse(CLLNode node) {
		
	}
}