package com.prashant.datastructure.binarytree.main;

import com.prashant.datastructure.binarytree.BinarySearchTree;
import com.prashant.datastructure.binarytree.BinarySearchTreeNode;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		BinarySearchTreeNode root = insert(bst);
		
		BinarySearchTreeNode root1 = insertUsingWhile(bst);
		System.out.println(root1.getData());
		
		boolean bNode = bst.find(root, 40);
		System.out.println(bNode);
		
		boolean bNodeX = bst.find(root, 140);
		System.out.println(bNodeX);
		
		BinarySearchTreeNode node = bst.find1(root, 40);
		System.out.println(node.getData());
		
		BinarySearchTreeNode nodeX = bst.find1(root, 140);
		System.out.println(nodeX.getData());
		
		BinarySearchTreeNode node1 = bst.find(85, root);
		System.out.println(node1.getData());
		
		BinarySearchTreeNode node2 = bst.findMaxUsingRecursion(root);
		System.out.println(node2.getData());
		
		BinarySearchTreeNode node3 = bst.findMaxUsingWhile(root);
		System.out.println(node3.getData());
		
		BinarySearchTreeNode node4 = bst.findMin(root);
		System.out.println(node4.getData());
		
		BinarySearchTreeNode node5 = bst.findMinUsingRecursion(root);
		System.out.println(node5.getData());
		
		BinarySearchTreeNode node6 = bst.inOrderSuccessor(root, 16);
		System.out.println(node6.getData());
		
		BinarySearchTreeNode node7 = bst.inOrderSuccessor(root, 90);
		System.out.println(node7.getData());
		
		bst.delete(root, 90);
	}
	
	static BinarySearchTreeNode insert(BinarySearchTree bst) {
		
		BinarySearchTreeNode root = bst.insert(null, 50);
		root = bst.insert(root, 16);
		root = bst.insert(root, 90);
		root = bst.insert(root, 14);
		 root = bst.insert(root, 40);
		 root = bst.insert(root, 80);
		 root = bst.insert(root, 100);
		 root = bst.insert(root, 10);
		 root = bst.insert(root, 15);
		 root = bst.insert(root, 35);
		 root = bst.insert(root, 45);
		 root = bst.insert(root, 75);
		 root = bst.insert(root, 82);
		 root = bst.insert(root, 105);
		 root = bst.insert(root, 5);
		 root = bst.insert(root, 32);
		 root = bst.insert(root, 36);
		 root = bst.insert(root, 81);
		 root = bst.insert(root, 85);
		 root = bst.insert(root, 30);
		 root = bst.insert(root, 37);
		 root = bst.insert(root, 87);
		 
		 // Duplicate not inserted
		 root = bst.insert(root, 80);
		 
		 return root;
	}
	
	static BinarySearchTreeNode insertUsingWhile(BinarySearchTree bst) {
		BinarySearchTreeNode root = bst.insert(50, null);
		root = bst.insert(16, root);
		root = bst.insert(90, root);
		root = bst.insert(14, root);
		root = bst.insert(40, root);
		root = bst.insert(80, root);
		root = bst.insert(100, root);
		root = bst.insert(10, root);
		root = bst.insert(15, root);
		root = bst.insert(35, root);
		root = bst.insert(45, root);
		root = bst.insert(75, root);
		root = bst.insert(82, root);
		root = bst.insert(105, root);
		root = bst.insert(5, root);
		root = bst.insert(32, root);
		root = bst.insert(36, root);
		root = bst.insert(81, root);
		root = bst.insert(85, root);
		root = bst.insert(30, root);
		root = bst.insert(37, root);
		root = bst.insert(87, root);
		
		return root;
	}
}
