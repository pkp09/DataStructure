package com.prashant.geeksforgeeks;

//https://www.geeksforgeeks.org/print-a-pattern-without-using-any-loop/
public class PrintANumberWithoutUsingLoop {

	public static void main(String[] args) {
		printNumberWithoutUsingLoop(16);
		
//		usingOriginal(16, 16);

	}
	
	//Print a pattern without using any loop
	/**	 
	 * Input: n = 16
	 * Output: 16, 11, 6, 1, -4, 1, 6, 11, 16
	 * 
	 * Input: n = 10
	 * Output: 10, 5, 0, 5, 10*/
	static int printNumberWithoutUsingLoop(int number) {
		if(number <= 0 ) {
			System.out.print(number + ", ");
			return number;
		}
		System.out.print(number + ", ");
		printNumberWithoutUsingLoop(number-5);
		System.out.print(number + ", ");
		return number;
	}
}
