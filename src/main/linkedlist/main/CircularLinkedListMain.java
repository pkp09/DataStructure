package com.prashant.datastructure.linkedlist.main;

import com.prashant.datastructure.linkedlist.CLLNode;
import com.prashant.datastructure.linkedlist.CircularLinkedList;

public class CircularLinkedListMain {

	public static void main(String args[]) {
		findMiddle();
	}
	
	static void test() {

		CircularLinkedList<Emp> cll = new CircularLinkedList<>();
		
		CLLNode node1 = new CLLNode();
		node1.setData(1);
		cll.insertAtBegin(node1);
		cll.traverse();

		CLLNode node2 = new CLLNode();
		node2.setData(2);
		cll.insertAtEnd1(node2);

		CLLNode node3 = new CLLNode();
		node3.setData(3);
		cll.insertAtEnd1(node3);
		cll.traverse();

		CLLNode node4 = new CLLNode();
		node4.setData(4);
		cll.insertAtEnd(node4);
		cll.traverse();

		CLLNode getNode = cll.get(3);
		System.out.println(getNode.getData());

		System.out.println(cll.get(node2));

		// cll.removeHead();
		// cll.removeTail();
//		System.out.println("Remove Head");

		System.out.println("********************************** Remove matched Node1 : ");
		cll.removeMatched(node1);
		cll.traverse();
		
		CLLNode node5 = new CLLNode();
		node5.setData(5);
		System.out.println("********************************** Inseert At 1 : ");
		cll.insert1(node5, 1);
		cll.traverse();

		System.out.println("********************************** Remove matched Node5 : ");
		cll.removeMatched(node5);
		cll.traverse();
		
		CLLNode node6 = new CLLNode();
		node6.setData(6);
		System.out.println("********************************** Insert at -1 : ");
		cll.insert1(node6, -1);
		cll.traverse();

		System.out.println("********************************** remove from 2 : ");
		cll.remove(2);
		cll.traverse();

		CLLNode node7 = new CLLNode();
		node7.setData(7);
		System.out.println("********************************** insert at 7 : ");
		cll.insert1(node7, 7);
		cll.traverse();

		System.out.println("********************************** remove from 1");
		cll.remove(1);
		cll.traverse();

		CLLNode node8 = new CLLNode();
		node8.setData(8);
		System.out.println("********************************** insert at 3");
		cll.insert1(node8, 3);
		cll.traverse();

		System.out.println("********************************** remove from 3");
		cll.remove(3);
		cll.traverse();

		System.out.println("********************************** remove from length : " + cll.getLength());
		cll.remove(cll.getLength());
		cll.traverse();
		
		cll.removeMatched(node1);
	}

	static void removeMatch() {
		CircularLinkedList<Emp> cll = new CircularLinkedList<>();
		
		CLLNode node1 = new CLLNode();
		node1.setData(1);
		cll.insertAtBegin(node1);
		cll.traverse();

		CLLNode node2 = new CLLNode();
		node2.setData(2);
		cll.insertAtEnd1(node2);

		CLLNode node3 = new CLLNode();
		node3.setData(3);
		cll.insertAtEnd1(node3);
		cll.traverse();

		CLLNode node4 = new CLLNode();
		node4.setData(4);
		cll.insertAtEnd(node4);
		cll.traverse();
		
		System.out.println("********************************** Remove matched Node1 : ");
		CLLNode node11 = new CLLNode();
		node11.setData(1);
		cll.removeMatched(node11);
		cll.traverse();
		
		CLLNode node5 = new CLLNode();
		node5.setData(5);
		System.out.println("********************************** Inseert At 1 : ");
		cll.insert1(node5, 1);
		cll.traverse();

		System.out.println("********************************** Remove matched Node5 : ");
		CLLNode node55 = new CLLNode();
		node55.setData(5);
		cll.removeMatched(node55);
		cll.traverse();
		
		CLLNode node6 = new CLLNode();
		node6.setData(6);
		System.out.println("********************************** Insert at -1 : ");
		cll.insert1(node6, -1);
		cll.traverse();

		CLLNode node7 = new CLLNode();
		node7.setData(7);
		System.out.println("********************************** insert at 7 : ");
		cll.insert1(node7, 7);
		cll.traverse();

		System.out.println("********************************** remove from 9");
		CLLNode node9 = new CLLNode();
		node9.setData(9);
		cll.removeMatched(node9);
		cll.traverse();

		CLLNode node8 = new CLLNode();
		node8.setData(8);
		System.out.println("********************************** insert at 3");
		cll.insert1(node8, 3);
		cll.traverse();

		System.out.println("********************************** remove from 3");
		cll.remove(3);
		cll.traverse();

		System.out.println("********************************** remove from length : " + cll.getLength());
		cll.remove(cll.getLength());
		cll.traverse();
		
		cll.removeMatched(node1);
		System.out.println("********************************** remove from length : " + cll.getLength());
		cll.traverse();
	}
	
	static void findMiddle() {
		CircularLinkedList<Emp> cll = new CircularLinkedList<>();
		
		CLLNode node1 = new CLLNode();
		node1.setData(1);
		cll.insertAtBegin(node1);
		cll.traverse();

		System.out.println("Middle Data 1 : " + cll.findMiddle().getData());
		CLLNode node2 = new CLLNode();
		node2.setData(2);
		cll.insertAtEnd1(node2);

		System.out.println("Middle Data 2 : " + cll.findMiddle().getData());
		
		CLLNode node3 = new CLLNode();
		node3.setData(3);
		cll.insertAtEnd1(node3);
		cll.traverse();

		System.out.println("Middle Data 3: " + cll.findMiddle().getData());
		
		CLLNode node4 = new CLLNode();
		node4.setData(4);
		cll.insertAtEnd(node4);
		cll.traverse();
		
		System.out.println("Middle Data 4 : " + cll.findMiddle().getData());
		
		CLLNode node6 = new CLLNode();
		node6.setData(6);
		System.out.println("********************************** Insert at -1 : ");
		cll.insert1(node6, -1);
		cll.traverse();

		System.out.println("Middle Data 5 : " + cll.findMiddle().getData());
		
		CLLNode node7 = new CLLNode();
		node7.setData(7);
		System.out.println("********************************** insert at 7 : ");
		cll.insert1(node7, 7);
		cll.traverse();
		System.out.println("Middle Data 6 : " + cll.findMiddle().getData());
		
		CLLNode node8 = new CLLNode();
		node8.setData(8);
		System.out.println("********************************** insert at 8 : ");
		cll.insert1(node8, 7);
		cll.traverse();
		System.out.println("Middle Data 7 : " + cll.findMiddle().getData());
		
		CLLNode node9 = new CLLNode();
		node9.setData(9);
		System.out.println("********************************** insert at 7 : ");
		cll.insert1(node9, 9);
		cll.traverse();
		System.out.println("Middle Data 8 : " + cll.findMiddle().getData());
		
		System.out.println("10 : "+cll.findNElementFromLast(10).getData());
		
		System.out.println("1 : "+cll.findNElementFromLast(1).getData());
		
		System.out.println("0 : "+cll.findNElementFromLast(0).getData());
		
		System.out.println("5 : "+cll.findNElementFromLast(5).getData());
		
		CLLNode node10 = new CLLNode();
		node10.setData(9);
		cll.insert1(node10, 9);
		cll.traverse();
		
		System.out.println("Frequency 1 : " + cll.frequency(node10));
		
		CLLNode node11 = new CLLNode();
		node11.setData(9);
		cll.insert1(node11, 9);
		cll.traverse();
		
		System.out.println("Frequency 2 : " + cll.frequency(node10));
		
		System.out.println("Frequency 3 : " + cll.frequency(new CLLNode()));
		
		cll.printReverse(cll.getHead());
		System.out.println(" PrintReverse : ");
		cll.reverse1();
		
		cll.traverse();
	}
}