package com.prashant.datastructure.skewed;

public class SkewedNode {
	
	int data;
	SkewedNode left;
	SkewedNode right;
	
	SkewedNode(int key){
		this.data = key;
		this.left = this.right = null;
	}

}
