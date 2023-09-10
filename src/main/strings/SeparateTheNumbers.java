package com.prashant.hacker.rank.algorithms.strings;

// https://www.hackerrank.com/challenges/separate-the-numbers/problem
// needs to work
public class SeparateTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 65;
		char c1 = 'A';
		if(c == c1)
			System.out.println("Hello");
		//A-Z 65-90 and  a-z 97-122

	}

	// Complete the separateNumbers function below.
	static void separateNumbers(String s) {
		String sub = "";
		int first = 0;
		int second = 0;
		for (int i = 0; i < s.length(); i++) {
			sub = s.substring(i, i+1);
			first = Integer.valueOf(sub);
			if(i+2 < s.length() && i+3 < s.length() && i+4 < s.length()) {
				second = Integer.valueOf(s.substring(i+2, i+3));
			}
		}

	}

}
