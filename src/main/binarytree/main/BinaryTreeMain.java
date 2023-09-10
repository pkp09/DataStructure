package com.prashant.datastructure.binarytree.main;

import java.util.ArrayList;
import java.util.List;

import com.prashant.datastructure.binarytree.BinaryTree;
import com.prashant.datastructure.binarytree.BinaryTreeNode;

public class BinaryTreeMain {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		System.out.println("Size : "+tree.sizeWithIteration(tree.root));
		treeLevelOrder(tree);
		
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		System.out.print("Tree : ");
		treeLevelOrder(tree);
		System.out.println("Size : "+tree.sizeWithIteration(tree.root));
		
		 /* 
		 2 and 3 become left and right children of 1 
			        1 
			      /   \ 
			     2        3 
			   /   \  	/   \ 
			 null null null null  
		*/
		
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		System.out.print("Tree : ");
		treeLevelOrder(tree);
		System.out.println("Size : "+tree.sizeWithIteration(tree.root));
        /* 4 becomes left child of 2 and 
         * 5 becomes right child of 2 
                    1 
                /       \ 
               2          3 
             /   \       /  \ 
            4    5	  null  null 
           /   \ 
          null null 
         */
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		System.out.print("Tree : ");
		treeLevelOrder(tree);
		System.out.println("Size : "+tree.sizeWithIteration(tree.root));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		System.out.print("Tree : ");
		treeLevelOrder(tree);
		System.out.println("Size : "+tree.sizeWithIteration(tree.root));
		
		/* 6 becomes left child of 3
		 * 7 becomes right child of 3 
		        1 
		    /       \ 
		   2          3 
		 /   \       /  \ 
		4    5	  	6    7 
		/   \ 
		null null 
		*/
		tree.root.getLeft().getLeft().setLeft(new BinaryTreeNode(8));
		tree.root.getLeft().getLeft().setRight(new BinaryTreeNode(9));
		System.out.print("Tree : ");
		treeLevelOrder(tree);
		System.out.println("Size : "+tree.sizeWithIteration(tree.root));
		/* 8 becomes left child of 4
		 * 9 becomes right child of 4 
		        1 
		    /       \ 
		   2          3 
		 /   \       /  \ 
		4    5	  	6    7 
	   / \ 
	   8  9 
		*/
		
		tree.root.getLeft().getRight().setLeft(new BinaryTreeNode(10));
		tree.root.getLeft().getRight().setRight(new BinaryTreeNode(11));
		System.out.print("Tree : ");
		treeLevelOrder(tree);
		System.out.println("Size : "+tree.sizeWithIteration(tree.root));
		/* 8 becomes left child of 4
		 * 9 becomes right child of 4 
		        1 
		    /       \ 
		   2          3 
		 /   \       /  \ 
		4     5	  	6    7 
	   / \   / \
	   8  9 10  11
		*/
		
	tree.root.getLeft().getLeft().getLeft().setLeft(new BinaryTreeNode(12));
	/* 12 becomes left child of 8 
	        1 
	    /       \ 
	   2          3 
	 /   \       /  \ 
	4     5	  	6    7 
   / \   / \
   8  9 10  11
  /
 12 
	*/
	
	
	//test(tree);
	
	// findInBT(tree);
	
	System.out.println(" size of tree : "+tree.sizeWithIteration(tree.root));
	
	// treeLevelOrder(tree);
	
	test(tree);
	
	}
	
	public static void treeLevelOrder(BinaryTree tree) {
		ArrayList<Integer> al = tree.printLevelOrder(tree.root);
		for(Integer i : al)
			System.out.print(i + ", ");
		System.out.println("Reverse Order : ");
		tree.printLevelOrderReverse(tree.root);
		System.out.println();
		System.out.println("Sum Of nodes : "+tree.sumOfNodeUsingRecursion(tree.root));
		System.out.println("Sum Of nodes : "+tree.sumOfNode(tree.root));
		
		System.out.println("After insertion");
		System.out.println(tree.insertInTreeLevelOrder(tree.root, 13).getData());
		
	}
	
	
	public static void insertInTreeLevelOrder(BinaryTree tree) {
		tree.insertInTreeLevelOrder(tree.root, 13);
	}
	
	public static void findInBT(BinaryTree tree) {
		System.out.println(tree.findInBT(tree.root, 13));
		System.out.println(tree.findInBTRecursion(tree.root, 13));
		System.out.println(tree.findInBTRecursion(tree.root, 7));
		System.out.println(tree.findInBTRecursion(tree.root, 1));
	}
	public static void test(BinaryTree tree) {
		System.out.println(tree.height1(tree.root));
		System.out.println("PreOrder Traversal : ");
		List<Integer> preOrder = tree.preOrderTraversal(tree.root);
		int[] preArr = new int[preOrder.size()];
		int i = 0;
		for(Integer pre : preOrder) {
			preArr[i++] = pre;
			System.out.print(pre + " ");
		}
		System.out.println();
		
		System.out.println("InOrder Traversal : ");
		List<Integer> inOrder = tree.inOrderTraversal(tree.root);
		i = 0;
		int[] inArr = new int[inOrder.size()];
		for(Integer in : inOrder) {
			inArr[i++] = in;
			System.out.print(in + " ");
		}
		System.out.println();
		

		System.out.println("PostOrder Traversal : ");
		List<Integer> postOrder = tree.postOrderTraversal(tree.root);
		int[] postArr = new int[preOrder.size()];
		i = 0;
		for(Integer post : postOrder) {
			postArr[i++] = post;
			System.out.print(post + " ");
		}
		System.out.println();
		
		System.out.print("Height of Tree : ");
		System.out.println(tree.height(tree.root));
		System.out.println("Post Order");
		tree.printPostOrder(tree.root);
		System.out.println();
		 
		System.out.println("Pre Order");
		tree.printPreOrder(tree.root);
		System.out.println();
		 
		System.out.println("In Order");
		tree.printInOrder(tree.root);
		System.out.println("");
		 
		System.out.println("Level Order");
		tree.printLevelOrder(tree.root);
		 // System.out.println("Post To Pre");
		 
		
		BinaryTreeNode bt = tree.buildBTUsingPreAndInOrder( preArr, inArr);
		System.out.println("After Pre and In Conversion::::::");
		ArrayList<Integer> plo = tree.printLevelOrder(bt);
		for(Integer i1 : plo)
			System.out.print(i1 + " ");
		System.out.println();
		BinaryTreeNode btPostIn = tree.buildBTUsingPostAndInOrder(postArr, inArr);
		System.out.println("After Post And IN Conversion::::::");
		ArrayList<Integer> plo1 = tree.printLevelOrder(btPostIn);
		for(Integer i1 : plo1)
			System.out.print(i1 + " ");
		System.out.println();
//		 int post[] = {8, 9, 4, 10, 11, 5, 2, 6, 7, 3, 1};
//		 tree.postToPre(post);
	}
}