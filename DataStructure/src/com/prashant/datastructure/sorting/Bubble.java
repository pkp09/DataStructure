package com.prashant.datastructure.sorting;

public class Bubble {

	public static void main(String[] args) {

		// int a[] = {21, 1, 11, 22, 2, 12, 23, 3, 13, 24, 4, 14, 25, 5, 15, 26, 6, 16,
		// 27, 7, 17, 28, 8, 18, 29, 9 };
		int a[] = { 21, 1, 11, 22, 2, 12, 23 };
		// bubble(a);

		// printArray(a);

		int b[] = bubbleRecursive(a, a.length);
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}
		// printNumber(3);
	}

	// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
	public static void bubble(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}

	}

	// https://www.geeksforgeeks.org/recursive-bubble-sort/
	public static int[] bubbleRecursive(int[] a, int length) {
		int temp = 0;
		for(int i = 0; i < length-1; i++) {
			if(a[i] > a[i + 1]) {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
			bubbleRecursive(a, length-1);
		}
		return a;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static void printNumber(int n) {
		int k = n;
		for (int i = 1; i <= (2 * n - 1); i++) {
			for (int j = 1; j <= (2 * n - 1); j++) {
				if (i == 1 || i == (2 * n - 1))
					System.out.print(k);
				else {
					System.out.print(1 + Math.max(Math.abs(n - i), Math.abs(n - j)));
				}
			}
			System.out.println();
		}
	}
}
