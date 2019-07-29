package com.prashant.datastructure.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	public BinaryTreeNode root;

	// Constructors
	public BinaryTree(int key) {
		root = new BinaryTreeNode(key);
	}

	public BinaryTree() {
		root = null;
	}

	/*
	    		1 
		    /       \ 
		   2          3 
		 /   \       /  \ 
		4     5	  	6    7 
	   / \   / \
	  8   9 10  11
	 /
	12 
	*/
	public int height(BinaryTreeNode root) {
		if(root == null)
			return 0;
		int lHeight = height(root.getLeft());
		int rHeight = height(root.getRight());

		if(lHeight > rHeight)
			return lHeight+1;
		else
			return rHeight+1;
	}
	
	/*
		1 
	/       \ 
	2          3 
	/   \       /  \ 
	4     5	  	6    7 
	/ \   / \
	8   9 10  11
	/
	12 
*/
	// 
	public int height1(BinaryTreeNode root) {
	    int leftHeight = 0;
	    int rightHeight = 0;

	    if (root.getLeft() != null) {
	        leftHeight = 1 + height1(root.getLeft());
	    }

	    if (root.getRight() != null) {
	        rightHeight = 1 + height1(root.getRight());
	    }

	    return leftHeight > rightHeight ? leftHeight : rightHeight;
	}
	
	public int size(BinaryTreeNode node) {
		int left = node.getLeft() == null ? 0 : size(node.getLeft());
		int right = node.getRight() == null ? 0 : size(node.getRight()) ;
		return 1 + left + right;
	}
	
	// by me
	public int sizeWithIteration(BinaryTreeNode node) {
		int size = 0;
		if(node == null)
			return 0;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		while(!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if(temp != null) {
				size++;
				if(temp.getLeft() != null) 
					q.offer(temp.getLeft());
				
				if(temp.getRight() != null)
					q.offer(temp.getRight());
			}
		}
		return size;
	}
	// https://practice.geeksforgeeks.org/problems/postorder-traversal/1
	public void printPostOrder(BinaryTreeNode node) {
		if(node == null)
			return;
		printPostOrder(node.getLeft());
		printPostOrder(node.getRight());
		System.out.print(node.getData() + " ");
	}
	
	public List<Integer> postOrderTraversal(BinaryTreeNode node) {
		List<Integer> result = new ArrayList<>();
		if(node == null)
			return result;
		Stack<BinaryTreeNode> stack = new Stack<>();
		stack.push(node);
		BinaryTreeNode prev = null;
		while(!stack.isEmpty()) {
			BinaryTreeNode current = stack.peek();
			if(prev == null || prev.getLeft() == current || prev.getRight() == current) {
				if(current.getLeft() != null)
					stack.push(current.getLeft());
				else if(current.getRight() != null)
					stack.push(current.getRight());
			}else if(current.getLeft() == prev) {
				if(current.getRight() != null)
					stack.push(current.getRight());
			}else {
				result.add(current.getData());
				stack.pop();
			}
			prev = current;
		}
		return result;
	}

		/*
			   1 
		  /     	\ 
		  2          3 
		/   \       /  \ 
		4     5	  	6    7 
		/ \   / \
	   8   9 10  11
	   /
	  12 
	*/
	public List<Integer> preOrderTraversal(BinaryTreeNode root){
		List<Integer> result = new ArrayList<>();
		if(root == null)
			return result;
		Stack<BinaryTreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			BinaryTreeNode temp = stack.pop();
			result.add(temp.getData());
			if(temp.getRight() != null) {
				stack.push(temp.getRight());
			}
			if(temp.getLeft() != null)
				stack.push(temp.getLeft());
		}
		return result;
	}
	
	// https://practice.geeksforgeeks.org/problems/preorder-traversal/1
	public void printPreOrder(BinaryTreeNode node) {
		if(node == null)
			return;
		System.out.print(node.getData() +" ");
		printPreOrder(node.getLeft());
		printPreOrder(node.getRight());
	}
	
			/*
			   1 
			/     	\ 
		   2          3 
		/   \       /  \ 
		4     5	  	6    7 
		/ \   / \
		8   9 10  11
		/
		12 
		*/
	public List<Integer> inOrderTraversal(BinaryTreeNode node){
		List<Integer> result = new ArrayList<>();
		if(node == null)
			return result;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode current = node;
		boolean isEmpty = false;
		while(!isEmpty) {
			if(current != null) {
				stack.push(current);
				current = current.getLeft();
			}else {
				if(stack.isEmpty())
					isEmpty=true;
				else {
					current = stack.pop();
					result.add(current.getData());
					current = current.getRight();
				}
			}
		}
		return result;
	}
	
	// https://practice.geeksforgeeks.org/problems/inorder-traversal/1
	public void printInOrder(BinaryTreeNode node) {
		if(node == null)
			return;
		printInOrder(node.getLeft());
		System.out.print(node.getData() + " ");
		printInOrder(node.getRight());
	}

	// By me
	public ArrayList<Integer> printLevelOrder(BinaryTreeNode node) {
		ArrayList<Integer> result = new ArrayList<>();
		if(node == null)
			return result;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		while (!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if (temp != null) {
				result.add(temp.getData());
				if (temp.getLeft() != null)
					q.offer(temp.getLeft());
				if (temp.getRight() != null)
					q.offer(temp.getRight());
			}
		}
		return result;
	}

	// By me
	public void printLevelOrderReverse(BinaryTreeNode node) {
		if(node == null)
			return ;
		Stack<BinaryTreeNode> s = new Stack<>();
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		while (!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if (temp != null) {
				s.push(temp);
				if (temp.getRight() != null)
					q.offer(temp.getRight());
				if (temp.getLeft() != null)
					q.offer(temp.getLeft());
			}
		}
		while(!s.isEmpty())
			System.out.print(s.pop().getData() + " ");
	}
	
	// needs to look
	public ArrayList<ArrayList<Integer>> printLevelOrder1(BinaryTreeNode node) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(node == null)
			return result;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		q.offer(null);

		ArrayList<Integer> current = new ArrayList<>();
		while(!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if(temp != null) {
				current.add(temp.getData());
				if(temp.getLeft() != null)
					q.offer(temp.getLeft());
				if(temp.getRight() != null)
					q.offer(temp.getRight());
			}else {
				ArrayList<Integer> c_current = new ArrayList<>(current);
				result.add(c_current);
				current.clear();
				if(!q.isEmpty())
					q.offer(null);
			}
		}
		return result;
	}

	
	// https://www.geeksforgeeks.org/preorder-from-inorder-and-postorder-traversals/
	// needs to work
	/**
	 * PreOrder from InOrder and PostOrder traversals
	 * 
	 * @param postOrderTree
	 */
	public void postToPre(int[] postOrderTree) {
		int[] subArray = new int[3];
		int length = postOrderTree.length;
		int count = 0;
		while(length != count){
			for(int i = 0; i < 3; i++) {
				subArray[i] = postOrderTree[count++];
			}
			System.out.print(" " + subArray[2] + " " + subArray[0] + " " + subArray[1]);
		}
		System.out.println();
	}
	
	// By me
	public BinaryTreeNode buildBTUsingPostAndInOrder(int[] post, int[] in) {
		if (post.length == 0 || in.length == 0)
			return null;
		int data = post[post.length - 1];
		BinaryTreeNode Bt = new BinaryTreeNode(data);
		int dataPositionIn = searchDataFromArray(in, data);

		int[] postLeftOrder = createLeftArrayFromPost(post, dataPositionIn);
		int[] postRightOrder = createRightArrayFromPost(post, dataPositionIn);
		int[] inLeftOrder = createLeftArrayFromIn(in, dataPositionIn);
		int[] inRightOrder = createRightArrayFromIn(in, dataPositionIn);
		
		// left Node processing
		Bt.setLeft(buildBTUsingPostAndInOrder(postLeftOrder, inLeftOrder));
		// Right Node processing
		Bt.setRight(buildBTUsingPostAndInOrder(postRightOrder, inRightOrder));

		return Bt;
	}

	// By me
	public BinaryTreeNode buildBTUsingPreAndInOrder(int[] pre, int[] in) {
		if(pre.length == 0 || in.length == 0)
			return null;
		int data = pre[0];
		BinaryTreeNode Bt = new BinaryTreeNode(data);
		int dataPositionIn = searchDataFromArray(in, data);
//		int[] preLeftOrder = createSubPreOrder(pre, dataPositionIn);
//		int[] preRightOrder = createSubPreOrderForRight(pre, dataPositionIn);
//		int[] inLeftOrder = createLeftArrayFromIn(in, dataPositionIn);
//		int[] inRightOrder = createRightArrayFromIn(in, dataPositionIn);

		// left Node processing
		Bt.setLeft(buildBTUsingPreAndInOrder(createLeftArrayFromPre(pre, dataPositionIn), createLeftArrayFromIn(in, dataPositionIn)));
		// Right Node processing
		Bt.setRight(buildBTUsingPreAndInOrder(createRightArrayFromPre(pre, dataPositionIn), createRightArrayFromIn(in, dataPositionIn)));

		return Bt;
	}
	
	private int[] createLeftArrayFromPost(int[] post, int length) {
		int[] newArray = new int[length];
		for(int i = 0; i < length; i++)
			newArray[i] = post[i];
		return newArray;
	}
	
	private int[] createRightArrayFromPost(int[] post, int length) {
		int[] newArr = new int[post.length-length -1];
		for(int i = 0; i < (post.length-length-1); i++)
			newArr[i] = post[i + length];
		return newArr;
	}
	
	private int[] createLeftArrayFromPre(int[] pre, int length) {
		int[] newArr = new int[length];
		for(int i = 0; i < length; i++)
			newArr[i] = pre[i+1];
		return newArr;
	}
	
	private int[] createRightArrayFromPre(int[] pre, int length) {
		int[] newArr = new int[pre.length-length -1];
		for(int i = 0; i < (pre.length-length-1); i++)
			newArr[i] = pre[i + 1 + length];
		return newArr;
	}
	
	private int[] createLeftArrayFromIn(int[] arr, int length) {
//		if(length == 0 )
//			return null;
		int[] newArr = new int[length];
		for(int i = 0; i < length; i++)
			newArr[i] = arr[i];
		return newArr;
	}
	
	private int[] createRightArrayFromIn(int[] arr, int length) {
//		if(length == 0 )
//			return null;
		int[] newArr = new int[arr.length - length -1];
		for(int i = 0; i < (arr.length - length -1); i++)
			newArr[i] = arr[i + 1 + length];
		return newArr;
	}
	
	private int searchDataFromArray(int[] arr, int data) {
		if(arr == null)
			return 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == data)
				return i;
		}
		
		return 0;
	}
	public boolean findInBTRecursion(BinaryTreeNode node, int data) {
		if(node == null)
			return false;
		if(node.getData() == data) {
			return true;
		}
		return findInBTRecursion(node.getLeft(), data) || findInBTRecursion(node.getRight(), data);
	}
	
	public boolean findInBT(BinaryTreeNode node, int data) {
		if(node == null)
			return false;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		while(!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if(temp.getData() == data)
				return true;
			if(temp != null) {
				if(temp.getLeft() != null)
					q.offer(temp.getLeft());
				if(temp.getRight() != null)
					q.offer(temp.getRight());
			}
		}
		return false;
	}
	
	public BinaryTreeNode insertInTreeLevelOrder(BinaryTreeNode root, int data) {
		if(root == null)
			return new BinaryTreeNode(data);
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if(temp != null) {
				if(temp.getLeft() != null)
					q.offer(temp.getLeft());
				else {
					temp.setLeft(new BinaryTreeNode(data));
					return root;
				}
			
				if(temp.getRight() != null)
					q.offer(temp.getRight());
				else {
					temp.setRight(new BinaryTreeNode(data));
					return root;
				}
			}
		}
		return root;
	}

	// https://www.geeksforgeeks.org/sum-nodes-binary-tree/
	public int sumOfNodeUsingRecursion(BinaryTreeNode node) {
		if(node == null)
			return 0;
		return node.getData() + sumOfNodeUsingRecursion(node.getLeft()) + sumOfNodeUsingRecursion(node.getRight());
	}
	
	public int sumOfNode(BinaryTreeNode node) {
		if(node == null)
			return 0;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		int sum = 0;
		while(!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if(temp != null) {
				sum = sum + temp.getData();
				if(temp.getLeft() != null)
					q.offer(temp.getLeft());
				if(temp.getRight() != null)
					q.offer(temp.getRight());
			}
		}
		return sum;
	}
	
	public int numberOfLeaves(BinaryTreeNode node) {
		if(node == null)
			return 0;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		int count = 0;
		while(!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if(temp != null) {
				if(temp.getLeft() == null && temp.getRight() == null)
					count++;
				if(temp.getLeft() != null)
					q.offer(temp.getLeft());
				if(temp.getRight() != null)
					q.offer(temp.getRight());
			}
		}
		return count;
	}
	
	// Nodes with only one child. 
	// The set of all nodes with either left or either right child but not both are called half nodes.
	public int numberOfHalfNode(BinaryTreeNode node) {
		if(node == null)
			return 0;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		int count = 0;
		while(!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if(temp != null) {
				if((temp.getLeft() == null && temp.getRight() != null) || (temp.getLeft() != null && temp.getRight() == null))
					count++;
				if(temp.getLeft() != null)
					q.offer(temp.getLeft());
				if(temp.getRight() != null)
					q.offer(temp.getRight());
			}
		}
		return count;
	}

	// set of all nodes with both left and right children present.
	public int numberOfFullNodes(BinaryTreeNode node) {
		if(node == null)
			return 0;
		int count = 0;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		if(!q.isEmpty()) {
			BinaryTreeNode temp = q.poll();
			if(temp != null) {
				if(temp.getLeft() != null && temp.getRight() != null)
					count++;
				if(temp.getLeft() != null)
					q.offer(temp.getLeft());
				if(temp.getRight() != null)
					q.offer(temp.getRight());
			}
		}
		return count;
	}

	// last node processed from queue in level order is the deepest node in binary tree
	public BinaryTreeNode deepestNode(BinaryTreeNode node) {
		if(node == null) {
			return null;
		}
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(node);
		BinaryTreeNode temp = null;
		while(!q.isEmpty()) {
			 temp = q.poll();
			if(temp != null) {
				if(temp.getLeft() != null) {
					q.offer(temp.getLeft());
				}
				if(temp.getRight() != null) {
					q.offer(temp.getRight());
				}
			}
		}
		return temp;
	}
	
	// https://www.geeksforgeeks.org/construct-a-binary-tree-from-postorder-and-inorder/
	// needs to work
	/**
	 * Construct a Binary Tree from PostOrder and InOrder
	 * @param in
	 * @param post
	 * @param n
	 */
	/*public void constructTreeUsingPostAndInTree(int in[], int post[], int n) {
		int rootElem = post[n-1];
		int rootElemIn = 0;
		for(int i = 0; i < n-1; i++) {
			if(in[i] == rootElem) {
				rootElemIn = i;
				break;
			}
			
		int[]subInLeft = new int[rootElemIn];
		int[]subInRight = new int[n - rootElemIn];
		}
	}*/
	
	/*
	 * Binary Search Tree insertion
	 * https://www.hackerrank.com/challenges/binary-search-tree-insertion/forum
	if(root==null)
  {
     Node node=new Node();
     node.data=value;
     node.left=null;
     node.right=null;
     root=node;
 }
 else if(root.data>value)
      root.left=Insert(root.left,value);
  else if(root.data<value)
      root.right=Insert(root.right,value);

  return root;
}
	*/
}
