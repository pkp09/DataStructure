package com.prashant.hacker.rank.problem.algorithm.implementation;

/**
 * @author pkp09
 *
 */
// https://www.hackerrank.com/challenges/find-digits/problem
public class FindDigits {

	static int findDigits(int n) {
		System.out.print("Number :\t"+n);
		int temp = n;
		int divisor = 0;
		int remainder = 0;
		while (n != 0) {
			remainder = n % 10;
			if (remainder != 0 && (temp % remainder == 0))
				divisor++;
			n = n / 10;
		}
		System.out.println("\tDIvisor :\t"+divisor);
		return divisor;

	}

	public static void main(String[] args) {
		 findDigits(123456789);
		 findDigits(114108089);
		 findDigits(110110015);
		findDigits(121);
		 findDigits(33);
		 findDigits(44);
		 findDigits(55);
		 findDigits(66);
		 findDigits(77);
		 findDigits(88);
		 findDigits(106108048);

	}

}
