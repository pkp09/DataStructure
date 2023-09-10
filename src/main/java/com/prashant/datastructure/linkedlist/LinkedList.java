package com.prashant.datastructure.linkedlist;

// https://www.geeksforgeeks.org/data-structures/linked-list/
public class LinkedList {
	private int length;
	Node head;

	public LinkedList() {
		length = 0;
	}

	public Node getHead() {
		return head;
	}

	public int length() {
		return length;
	}

	// insert the new node at a given index.
	// if head is null, add node at 1st position
	// if position is less than or equal to 1
	// position is greater than length, set position = length + 1
	public void insert(int position, Node node) {
		Node temp = head, prev = new Node();
		if (head == null) {
			head = node;
			length++;
			return;
		} else if (position <= 1) {
			head = node;
			head.setNext(temp);
			length++;
			return;
		} else if (position > length)
			position = length + 1;

		for (int i = 1; i < position; i++) {
			prev = temp;
			temp = temp.getNext();
		}
		prev.setNext(node);
		node.setNext(temp);
		length++;
	}

	public void insertAtBegin(Node node) {
		node.setNext(head);
		head = node;
		length++;
	}

	public void insertAtEnd(Node node) {
		if (head == null)
			head = node;
		else {
			// Node temp = head.getNext();
			// if (temp == null) {
			// temp = node;
			// head.setNext(temp);
			// }
			if (head.getNext() == null) {
				head.setNext(node);
			} else {
				Node temp = head.getNext();
				while (temp.getNext() != null) {
					temp = temp.getNext();
				}
				temp.setNext(node);
			}
			length++;
		}
	}

	public void insertAtEndUsingFor(Node node) {
		if (head == null)
			head = node;
		else {
//			if (head.getNext() == null) {
	//			head.setNext(node);
		//	} else {
				Node temp = head;
				for(int i = 1; i < length; i++) {
					temp = temp.getNext();
				}
				temp.setNext(node);
		//	}
		}	
		length++;
	}
	
	public void traverse() {
		System.out.println("Length = " + length);
		Node node = head;
		System.out.print("List is : ");
		while (node != null) {
			System.out.print(node.getData() + " : " + node.getEmp().getName() + ", ");
			node = node.getNext();
		}
		System.out.println();
	}

	// Find the Node at a given index.
	// if given index is 0 or less than that, return 1st node.
	// if index is greater than length of linked list return last node.
	public Node indexAt(int index) {
		if (index <= 0)
			index = 1;
		if (length < index)
			index = length;
		Node node = head;
		int count = 1;
		while (node != null) {
			if (count != index) {
				node = node.getNext();
				count++;
			} else
				return node;
		}
		return node;
	}

	public Node getNode(int index) {
		if(index < 1)
			return head;
		else if (index > length)
			index = length;
		Node node = head;
		for(int i = 1; i < length; i++) {
			node = node.getNext();
		}
		return node;
	}

	// Remove node at a given index.
	// if index is less than or equal to 1, remove 1st node.
	// if index is greater than length, remove last element.
	public void remove(int index) {
		if (index <= 1)
			head = head.getNext();

		if (index >= length)
			index = length;

		Node temp = head, prev = null;
		for (int i = 1; i < index; i++) {
			prev = temp;
			temp = temp.getNext();
		}
		prev.setNext(temp.getNext());
		length--;
	}

	public void removeFromEndUsingWhile() {
		Node temp = head, prev = null, next = head.getNext();
		if (head == null)
			return;
		else if (head.getNext() == null)
			head = null;
		else {
			while (next != null) {
				prev = temp;
				temp = next;
				next = temp.getNext();
			}
			prev.setNext(null);
			length--;
		}
	}

	public void removeFromEndUsingForLoop() {
		Node temp = head;
		for(int i = 1; i < length-1; i++) {
			temp = temp.getNext();
		}
		temp.setNext(null);
	}
	
	public void removeFromEnd1() {
		Node temp = head, next = head.getNext(), prev = null;
		while (next != null) {
			prev = temp;
			temp = next;
			next = next.getNext();
		}
		prev.setNext(null);
	}

	public void removeFromBegin() {
		if (head == null)
			return;

		head = head.getNext();
		length--;
	}

	// https://www.geeksforgeeks.org/reverse-a-linked-list/
	public void reverse3() {
		if (head == null)
			return;
		Node prev = null, next = null, current = head ;
		
		while(current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void reverse() {
		if (head == null)
			return;
		Node temp = head, next = null, current = null, prev = null;
		int count = 0;
		while (temp != null) {
			if (count == 0) {
				next = temp.getNext();
				prev = temp;
				temp = temp.getNext();
				prev.setNext(null);
				count++;
				continue;
			}
			current = next;
			next = next.getNext();
			temp = temp.getNext();
			current.setNext(prev);
			prev = current;
		}
		head = current;
	}

	public Node reverse1() {
		if (head == null || head.getNext() == null)
			return head;
		Node next = head, current = null, prev = null;
		int count = 0;
		while (next != null) {
			if (count == 0) {
				prev = next;
				next = next.getNext();
				prev.setNext(null);
				count++;
				continue;
			}
			current = next;
			next = next.getNext();
			current.setNext(prev);
			prev = current;
		}
		// head = current;
		return current;
		// return head;
	}

	public void removeMatched(Node node) {
		Node temp = head, prev = null;
		if (node == null || head == null)
			return;
		while (temp != null) {
			prev = temp;
			if (node.getData() == temp.getNext().getData()) {
				temp = temp.getNext().getNext();
				break;
			}
			temp = temp.getNext();
		}
		prev.setNext(temp);
		length--;
	}

	public Node findMiddle() {
		Node slow = head, doubleFast = head;
		while (doubleFast != null && doubleFast.getNext() != null && slow != null) {
			doubleFast = doubleFast.getNext().getNext();
			slow = slow.getNext();
		}
		System.out.println(slow.getData());
		return slow;
	}

	public int findNElementFromLast(int n) {
		if (head == null || head.getNext() == null || length < n || n < 1)
			return -1;
		Node temp = head, prev = null;
		for (int i = 0; i < length - n; i++) {
			prev = temp.getNext();
			temp = temp.getNext();
		}
		return prev.getData();
	}

	// count number of occurrences of given key in linked list.
	public int frequency(Node node) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			if (node.getData() == temp.getData()) 
				count++;
			temp = temp.getNext();
		}
		return count;
	}

	public boolean detectLoop() {
		Node fast = head, slow = head;
		while(fast != null && fast.getNext() != null && slow != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if(fast == slow)
				return true;
		}
		return false;
	}
	
	
	public void removeLoop() {
		Node slow = head, fast = head;
		while(fast != null && fast.getNext() != null && slow != null) {
			fast = fast.getNext().getNext();
			if(fast == slow) {
				fast.setNext(null); 
				return;
			}
			slow = slow.getNext();
		}
	}

	public void printReverse(Node node) {
		if(node == null)
			return;
		printReverse(node.getNext());
		System.out.println(node.getData());
	}
	
	public void reverseUsingRecursion() {
		reverseUsingRecursion(head);
	}
	private Node reverseUsingRecursion(Node node) {
		
		if(node == null) {
			return node;
		}
		if(node.getNext() == null) {
			return node;
		}
		
		Node temp = reverse(node.getNext());
		
		node.getNext().setNext(node);
		node.setNext(null);
		return temp;
	}

	// need to check
	private Node reverse(Node next) {
		// TODO Auto-generated method stub
		return null;
	}

	// needs to work
	public void rotateList(int index) {
		if (index == 0)
			return;
		
		Node next=head;
		int count = 1;
		while(next != null && count < index) {
			count++;
			next = next.getNext();
		}
		
		if (next == null)
			return;
		
		Node kthNode = next;
		while(next.getNext() != null) {
			next = next.getNext();
		}
		next.setNext(head);
		head = kthNode.getNext();
		
		
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}

		System.out.println();
	}
	
	// Still needs to work
	public boolean isPalindrome() {
		boolean isPalindrome = false;
		Node rev = reverse1();
		Node temp = head;
		for (int i = 1; i < length; i++) {
			if (temp.getData() == rev.getData()) {
				temp = temp.getNext();
				rev = rev.getNext();
				isPalindrome = true;
			} else {
				return isPalindrome;
			}
		}
		return isPalindrome;
	}
	
	// need to work
	public void recursiveReverse() {

	}
	
	public boolean compareList(Node head1, Node head2) {
		boolean compare = false;
		if(head1 == null || head2 == null)
			return false;
		while(head1 != null && head2 != null) {
			if(head1.getData() == head2.getData()) {
				compare = true;
			}else {
				compare = false;
			}
			head1 = head1.getNext();
			head2 = head2.getNext();
		}
		if((head1 == null && head2 != null) || (head1 != null && head2 == null))
			compare = false;
		return compare;
	}
}