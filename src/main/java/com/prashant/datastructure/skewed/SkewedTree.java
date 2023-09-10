package com.prashant.datastructure.skewed;

public class SkewedTree {
	
	
	public boolean isSkewedBinaryTree(SkewedNode node) {
		if(node == null || (node.left == null && node.right == null)) {
			return true;
		}
		
		if(node.left != null && node.right != null) {
			return false;
		}
		
		if(node.left != null) {
			return isSkewedBinaryTree(node.left);
		}else if(node.right != null) {
			return isSkewedBinaryTree(node.right);
		}
		
		
		return false;
	}
	
	public boolean isSkewedBinaryTreeIterative(SkewedNode node) {
		if(node == null || (node.right == null && node.left == null)) {
			return true;
		}
		while(node != null) {
			if(node.left != null && node.right != null) {
				return false;
			}
			
			if(node.left != null) {
				node = node.left;
			} else if(node.right != null) {
				node = node.right;
			}
		}
		return true;
	}	
}
