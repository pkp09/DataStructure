package com.prashant.datastructure.linkedlist.main;

import com.prashant.datastructure.linkedlist.DCLLNode;
import com.prashant.datastructure.linkedlist.DoublyCircularLinkedList;

public class DoublyCircularLinkedListMain {

	public static void main(String[] args) {

		DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
		DCLLNode node1 = new DCLLNode();
		node1.setData(1);
		dcll.insert(4, node1);
		
		DCLLNode node2 = new DCLLNode();
		node2.setData(2);
		dcll.insert(5, node2);
		
		DCLLNode node3 = new DCLLNode();
		node3.setData(3);
		dcll.insert(2, node3);
		
		DCLLNode node4 = new DCLLNode();
		node4.setData(4);
		dcll.insert(4, node4);
		dcll.traverse();
		
		//dcll.remove(node1);
		
		dcll.traverse();
		
		/*DCLLNode prev = dcll.removeAtBegin();
		System.out.println(prev.getData());*/
		dcll.traverse();
		
		dcll.reverse();
		
		dcll.traverse();
	}

}
