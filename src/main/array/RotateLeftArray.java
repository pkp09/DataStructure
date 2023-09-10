package com.prashant.hacker.rank.problem.array;

public class RotateLeftArray {

	static int[] rotLeft(int[] a, int d) {
		int[] aa = new int[a.length];
		int index = 0;
		for(int i = d; i < a.length; i++) {
			aa[index] = a[i];
			index++;
		}
		for(int i = 0; i < d; i++) {
			aa[index] = a[i];
			index++;
		}
		return aa;
    }
	
	public static void main(String[] args) {
		int[]a = {1, 2, 3, 4, 5};
		int[]a1 = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
		rotLeft(a1, 10);
	}

}
