package com.prashant.datastructure.binarytree;

public class BinarySearchTree {

	public boolean find(BinarySearchTreeNode root, int data) {
		if (root == null)
			return false;
		boolean bFind = false;
		if (root.getData() == data)
			return true;
		else if (data > root.getData())
			bFind = find(root.getRight(), data);
		else if (data < root.getData())
			bFind = find(root.getLeft(), data);

		return bFind;
	}

	public BinarySearchTreeNode find1(BinarySearchTreeNode root, int data) {
		if (root == null)
			return new BinarySearchTreeNode();
		BinarySearchTreeNode bFind = null;
		if (root.getData() == data) {
			bFind = root;
			return bFind;
		} else if (data > root.getData())
			bFind = find1(root.getRight(), data);
		else if (data < root.getData())
			bFind = find1(root.getLeft(), data);

		return bFind;
	}

	public BinarySearchTreeNode find(int data, BinarySearchTreeNode root) {
		if (root == null)
			return null;
		while (root != null) {
			if (data == root.getData())
				return root;
			if (data > root.getData())
				root = root.getRight();
			else
				root = root.getLeft();
		}
		return null;
	}

	public BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
		if (root == null)
			return null;
		while (root != null) {
			if (root.getLeft() != null)
				root = root.getLeft();
			else if (root.getLeft() == null)
				return root;
		}
		return root;
	}

	public BinarySearchTreeNode findMinUsingRecursion(BinarySearchTreeNode root) {
		BinarySearchTreeNode node = null;
		if (root == null)
			return null;
		else if (root.getLeft() == null)
			return root;
		else
			node = findMinUsingRecursion(root.getLeft());
		return node;
	}

	public BinarySearchTreeNode findMaxUsingWhile(BinarySearchTreeNode root) {
		if (root == null)
			return null;
		while (root.getRight() != null)
			root = root.getRight();
		return root;
	}

	public BinarySearchTreeNode findMaxUsingRecursion(BinarySearchTreeNode root) {
		if (root == null)
			return null;
		else {
			if (root.getRight() == null)
				return root;
			else if (root.getRight() != null)
				root = findMaxUsingRecursion(root.getRight());
		}
		return root;
	}

	public BinarySearchTreeNode insert(BinarySearchTreeNode root, int data) {
		if (root == null) {
			root = new BinarySearchTreeNode();
			root.setData(data);
			root.setLeft(null);
			root.setRight(null);
		} else {
			if (data > root.getData())
				root.setRight(insert(root.getRight(), data));
			else if (data < root.getData())
				root.setLeft(insert(root.getLeft(), data));
		}
		return root;
	}

	/**
	 * Insert the data using While loop.
	 * 
	 * @param data
	 * @param root
	 * @return
	 */
	public BinarySearchTreeNode insert(int data, BinarySearchTreeNode root) {
		BinarySearchTreeNode temp1 = new BinarySearchTreeNode();
		temp1.setData(data);
		if (root == null) {
			return temp1;
		} else {
			BinarySearchTreeNode temp = root, current = null;
			while (temp != null) {
				current = temp;
				if (data > temp.getData()) {
					if (temp.getRight() != null) {
						temp = temp.getRight();
					} else {
						current.setRight(temp1);
						return root;
					}
				} else if (data < temp.getData()) {
					if (temp.getLeft() != null) {
						temp = temp.getLeft();
					} else {
						current.setLeft(temp1);
						return root;
					}
				}
			}
		}
		return root;
	}

	public void delete(BinarySearchTreeNode root, int data) {
		if (root == null)
			return;
		if (root.getData() == data) {
			if (root.getLeft() == null && root.getRight() == null)
				root = null;
			else if (root.getLeft() != null && root.getRight() == null)
				root = root.getLeft();
			else if (root.getLeft() == null && root.getRight() != null)
				root = root.getRight();
			else if (root.getLeft() != null && root.getRight() != null) {
				// find inorder node successor
				root = inOrderSuccessor(root, data);
			}
		} else if (root.getData() > data) {
			// move to left
			delete(root.getLeft(), data);
		} else if (root.getData() < data) {
			// move right
			delete(root.getRight(), data);
		}
	}

	// STILL NEEDS TO WORK
	// find the inOrder successor node for the given node
	public BinarySearchTreeNode inOrderSuccessor(BinarySearchTreeNode root, int data) {
		if (root == null)
			return null;
		BinarySearchTreeNode node = null;
		if (root.getData() == data) {
			// find the in order successor for the given node data
			if (root.getRight() != null) {
				node = root.getRight();
				while (node.getLeft() != null)
					node = node.getLeft();
				return node;
			} else if (root.getRight() == null) {

			}
		} else if (root.getData() > data) {
			// move to left
			node = inOrderSuccessor(root.getLeft(), data);
		} else if (root.getData() < data) {
			// move to right
			node = inOrderSuccessor(root.getRight(), data);
		}
		return node;
	}

	// still needs t work
	public boolean isBST(BinarySearchTreeNode node) {
		if(node == null)
			return true;
		BinarySearchTreeNode temp = null;
		if(node.getData() > node.getLeft().getData() && node.getData() < node.getRight().getData()) {
			return true;
		}
		return false;
	}
	/*
	 * { // Your code here Node temp1 = new Node(data); if (root == null) { return
	 * temp1; } else { Node temp = root, current = null; while (temp != null) {
	 * current = temp; if (data > temp.data && temp.right != null) { temp =
	 * temp.right; } else if (data > temp.data && temp.right == null){ current.right
	 * = (temp1); return root; } else if (data < temp.data && temp.left != null) {
	 * temp = temp.left; } else if (data < temp.data && temp.left == null){
	 * current.left = (temp1); return root; } } } return root; }
	 */
}