package com.prashant.hacker.rank.problem.algorithm.implementation;

public class CatsAndAMouse {

	public static void main(String[] args) {
		System.out.println(catAndMouse(1, 2, 3));
		System.out.println(catAndMouse(1, 3, 2));
		printIfElse(18);
	}

	static String catAndMouse(int a, int b, int c) {
		int distanceXZ = c - a;
		int distanceYZ = c - b;

		if (Math.abs(distanceXZ) > Math.abs(distanceYZ))
			return "Cat A";
		else if (Math.abs(distanceXZ) < Math.abs(distanceYZ))
			return "Cat B";
		else
			return "Mouse C";
	}

	static void printIfElse(int n) {
		if (n % 2 != 0 || (n >= 6 && n <= 20 && n % 2 == 0))
			System.out.println("Weird");
		if (n % 2 == 0 && ((n >= 2 && n <= 5) || (n > 20)))
			System.out.println("Not Weird");

	}
}
