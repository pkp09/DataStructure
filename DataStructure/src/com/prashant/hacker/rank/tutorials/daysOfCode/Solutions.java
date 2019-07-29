package com.prashant.hacker.rank.tutorials.daysOfCode;

import java.util.Scanner;

public class Solutions {

	public static void main(String arg[]) {
		// solve(12, 20, 8);
		// solve(10.25, 17, 5);
		
	}

	// https://www.hackerrank.com/challenges/30-operators/problem?h_r=next-challenge&h_v=zen
	// Complete the solve function below.
	/**
	 * @param meal_cost
	 * @param tip_percent
	 * @param tax_percent
	 */
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double cost = (meal_cost + (meal_cost * tip_percent / 100) + (meal_cost * tax_percent / 100));
		System.out.println(Math.round(cost));
	}

	// https://www.hackerrank.com/challenges/30-conditional-statements/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
	static void introToConditionalStatement() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		// If i is odd, print Weird
		if (i % 2 != 0)
			System.out.println("Weird");
		// If i is even and in the inclusive range of 2 to 5, print Not Weird
		if (i % 2 == 0 && i >= 2 && i <= 5)
			System.out.println("Not Weird");
		// If i is even and in the inclusive range of 6 to 20, print Weird
		if (i % 2 == 0 && i >= 6 && i <= 20)
			System.out.println("Weird");
		// If i is even and greater than 20, print Not Weird
		if (i % 2 == 0 && i > 20)
			System.out.println("Not Weird");
		sc.close();
	}

	

}
