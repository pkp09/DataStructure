package com.prashant.codechef.problem;

public class PrintPermutation {

	public static void main(String[] args) {
		printPermutatoin("ABCDEFGH", "");
	}

	static void printPermutatoin(String str, String printStr) {
		if(str.length() == 0) {
			System.out.println(printStr);
			return;
		}
		
		for(int i =0; i < str.length(); i++) {
			char c = str.charAt(i);
			String strToPrint = str.substring(0, i) + str.substring(i+1);
			
			printPermutatoin(strToPrint, printStr+c);
		}
	}
}
