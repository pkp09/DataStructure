package com.prashant.datastructure.linkedlist.main;

import com.prashant.datastructure.linkedlist.DLLNode;
import com.prashant.datastructure.linkedlist.DoublyLinkedList;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubbleSort();
	}

	static void test () {
		DoublyLinkedList dll = new DoublyLinkedList();

		dll.reverse();
		dll.traverse();

		DLLNode node1 = new DLLNode();
		node1.setData(1);
		dll.insertAtBegin(node1);

		DLLNode node2 = new DLLNode();
		node2.setData(2);
		dll.insertAtBegin(node2);

		DLLNode node3 = new DLLNode();
		node3.setData(3);
		dll.insertAtBegin(node3);

		dll.traverse();

		DLLNode node4 = new DLLNode();
		node4.setData(4);
		dll.insertAtEnd(node4);
		System.out.println("*******************************");
		dll.traverse();

		DLLNode node5 = new DLLNode();
		node5.setData(5);
		dll.insert(2, node5);

		System.out.println("**************Print Recursive Reverse : *****************");
		dll.printRecursiveReverse(dll.getHead());

		DLLNode n1 = dll.get(2);
		System.out.println("*******************************Get Data at position 2 :  " + n1.getData());

		DLLNode n2 = dll.findNElementFromLast(2);
		// dll.remove(node2);
		System.out.println("*******************************Find Data :  " + n2.getData());
		dll.traverse();

		DLLNode node6 = new DLLNode();
		node6.setData(6);
		dll.insertAtEnd(node6);
		System.out.println("*******************************");
		dll.traverse();

		DLLNode n3 = dll.findMiddle();
		System.out.println("Middle data : " + n3.getData());

		System.out.println("reverse3 : ");
		dll.traverse();
		// dll.reverse3();
		dll.traverse();

		dll.reverse();
		dll.traverse();
		System.out.println("*************Recursive***************");
		dll.recursiveReverse(dll.get(1));
		dll.traverse();

		System.out.println("*************Print Reverse***************");
		dll.printReverse();
	}
	
	static void bubbleSort() {

		DoublyLinkedList dll = new DoublyLinkedList();

		DLLNode node1 = new DLLNode();
		node1.setData(1);
		dll.insertAtBegin(node1);

		DLLNode node2 = new DLLNode();
		node2.setData(2);
		dll.insertAtBegin(node2);

		DLLNode node3 = new DLLNode();
		node3.setData(3);
		dll.insertAtBegin(node3);

		DLLNode node4 = new DLLNode();
		node4.setData(4);
		dll.insertAtEnd(node4);

		DLLNode node5 = new DLLNode();
		node5.setData(5);
		dll.insert(2, node5);

		System.out.println("*******************************");
		dll.traverse();
		
		dll.bubbleSort();
		System.out.println("************** After BubbleSort *****************");
		dll.traverse();
	}
}
