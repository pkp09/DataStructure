package com.prashant.datastructure.linkedlist.main;

import com.prashant.datastructure.linkedlist.LinkedList;
import com.prashant.datastructure.linkedlist.Node;

public class LinkedListMain {
	
	static void reverseList() {
		LinkedList list = new LinkedList();
		Node node1 = new Node();
		node1.setData(1);
		list.insert(1, node1);
		
		Node node2 = new Node();
		node2.setData(2);
		list.insert(2, node2);
		
		Node node3 = new Node();
		node3.setData(3);
		list.insert(3, node3);
		
		Node node4 = new Node();
		node4.setData(4);
		list.insert(4, node4);
		
		list.traverse();
		
		list.reverseUsingRecursion();
		
		list.traverse();
	}

	static void compareList() {
		LinkedList list1 = new LinkedList();
		Node node1 = new Node();
		node1.setData(1);
		list1.insert(1, node1);
		
		Node node2 = new Node();
		node2.setData(2);
		list1.insertAtEnd(node2);

		Node node3 = new Node();
		node3.setData(3);
		list1.insert(3, node3);
		
		LinkedList list2 = new LinkedList();
		Node node4 = new Node();
		node4.setData(1);
		list2.insert(1, node4);
		
		Node node5 = new Node();
		node5.setData(1);
		list2.insert(2, node5);

		list1.compareList(list1.getHead(), list2.getHead());
	}
	static LinkedList addNodeToList() {
		LinkedList list = new LinkedList();
		Node node = new Node();
		node.setData(1);
		node.setEmp(new Emp("1"));
		list.insert(1, node);

		Node node2 = new Node();
		node2.setData(2);
		node2.setEmp(new Emp("2"));
		list.insertAtEnd(node2);

		Node node3 = new Node();
		node3.setData(3);
		node3.setEmp(new Emp("3"));
		list.insertAtEnd(node3);

		Node node4 = new Node();
		node4.setData(4);
		node4.setEmp(new Emp("4"));
		list.insertAtEnd(node4);

		Node node5 = new Node();
		node5.setData(5);
		node5.setEmp(new Emp("5"));
		list.insertAtEnd(node5);

		return list;
	}

	static void remove(LinkedList list) {
		System.out.print("Before Remove : ");
		list.traverse();
		list.remove(6);
		System.out.println("After Remove : ");
		list.traverse();

		list.remove(2);
		System.out.println("After Remove");
		list.traverse();

		list.remove(4);
		System.out.println("After Remove");
		list.traverse();
	}

	static void add() {
		LinkedList list = new LinkedList();

		System.out.println("Insert at Position : 0 data = 0");
		Node node0 = new Node();
		node0.setData(0);
		node0.setEmp(new Emp("0"));
		list.insert(2, node0);

		list.traverse();

		list.removeFromBegin();
		list.traverse();

		System.out.println("Insert at Position : 1 data = 1");
		Node node = new Node();
		node.setData(1);
		node.setEmp(new Emp("1"));
		list.insert(1, node);

		list.traverse();

		Node node2 = new Node();
		node2.setData(2);
		node2.setEmp(new Emp("2"));
		list.insertAtEnd(node2);

		list.traverse();

		Node node3 = new Node();
		node3.setData(3);
		node3.setEmp(new Emp("3"));
		list.insertAtEnd(node3);

		list.traverse();

		Node node4 = new Node();
		node4.setData(4);
		node4.setEmp(new Emp("4"));
		list.insertAtEnd(node4);

		list.traverse();

		Node node5 = new Node();
		node5.setData(5);
		node5.setEmp(new Emp("5"));
		list.insertAtEnd(node5);

		list.traverse();

		Node node6 = new Node();
		node6.setData(6);
		node6.setEmp(new Emp("6"));
		list.insertAtEnd(node6);
		list.traverse();

		Node node7 = new Node();
		node7.setData(7);
		node7.setEmp(new Emp("7"));
		list.insertAtEnd(node7);

		list.traverse();

		System.out.println("Insert at Position : 3 data = 8");
		Node node8 = new Node();
		node8.setData(8);
		node8.setEmp(new Emp("8"));
		list.insert(3, node8);

		list.traverse();

		System.out.println("Insert at Position : 0 data = 9");
		Node node9 = new Node();
		node9.setData(9);
		node9.setEmp(new Emp("9"));
		list.insert(0, node9);

		list.traverse();

		System.out.println("Insert at Position : 13, data = 10");
		Node node10 = new Node();
		node10.setData(10);
		node10.setEmp(new Emp("10"));
		list.insert(13, node10);

		list.traverse();

		System.out.println("****************************** Now reverse...");

		list.reverse1();

		list.traverse();

		System.out.println("****************************** removeFromBegin...");
		list.removeFromBegin();
		list.traverse();

		list.removeFromBegin();
		list.traverse();

		list.removeFromBegin();
		list.traverse();

		System.out.println("****************************** removeFromEnd...");

		list.removeFromEndUsingWhile();
		list.traverse();

		// list.removeMatched(node8);
		list.traverse();

		System.out.println("****************************** removeFromEnd...");
		System.out.println(list.findMiddle().getData());

	}

	public static void main(String[] args) {
		reverseList();
		
		compareList();
		
//		LinkedList list = addNodeToList();
//		list.traverse();
		
//		list.reverse3();
//		list.traverse();
		
//		Node node = new Node();
//		node.setData(6);
//		node.setEmp(new Emp("6"));
//		list.insertAtEndUsingFor(node);
//		list.traverse();
		
//		System.out.println(list.getNode(1).getData());

//		System.out.println(list.getNode(-1).getData());

//		System.out.println(list.getNode(10).getData());
		
//		list.rotateList(3);
		
		
//		list.removeFromEndUsingForLoop();
		
//		list.traverse();
		// remove(list);
		// add(list);

		// findNFromLast(list);
		// printReverse(list);
		// palindrome(list);

//		detectLoop(list);

	}

	static void detectLoop(LinkedList list) {
		list.traverse();

		Node node3 = new Node();
		node3.setData(3);
		node3.setEmp(new Emp("3"));

		list.insertAtEnd(node3);
		if (list.detectLoop()) {
			list.removeLoop();
		}

		list.traverse();
		// list.rotateList(3);
		// list.traverse();
	}

	static void palindrome(LinkedList list) {
		System.out.println(list.isPalindrome());
	}

	static void frequency(LinkedList list) {
		list.traverse();

		Node node = new Node();
		node.setData(1);
		node.setEmp(new Emp("1"));

		int n = list.frequency(node);
		System.out.println(n);

		Node node5 = new Node();
		node5.setData(5);
		node5.setEmp(new Emp("5"));

		System.out.println(list.frequency(node5));

		Node node6 = new Node();
		node6.setData(6);
		node6.setEmp(new Emp("5"));

		System.out.println(list.frequency(node6));
	}

	static void findNFromLast(LinkedList list) {
		list.traverse();

		int n = list.findNElementFromLast(2);
		System.out.println(n);

		System.out.println(list.findNElementFromLast(-1));

		System.out.println(list.findNElementFromLast(6));
	}

	static void printReverse(LinkedList list) {
		list.traverse();
		Node node = new Node();
		node.setData(1);
		node.setEmp(new Emp("1"));
		list.printReverse(node);

		Node node6 = new Node();
		node6.setData(6);
		node6.setEmp(new Emp("5"));
		list.insertAtEnd(node6);

		list.traverse();
		list.printReverse(node);
	}
}
