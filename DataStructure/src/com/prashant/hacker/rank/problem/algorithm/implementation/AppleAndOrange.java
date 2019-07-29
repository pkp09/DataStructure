package com.prashant.hacker.rank.problem.algorithm.implementation;

public class AppleAndOrange {
	
	// Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	int appleCount = 0;
    	int orangeCount = 0;
		for(int i = 0; i < apples.length; i++) {
			if(s <= (apples[i]+a) && apples[i] + a <= t)
				appleCount++;
		}

		for(int i = 0; i < oranges.length; i++) {
			if(oranges[i] + b  >= s && t >= oranges[i]+b)
				orangeCount++;
		}
		
		System.out.println(appleCount);
		System.out.println(orangeCount);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]apples = {-2, 2, 1};
		int[]oranges = {5, -6};
		// countApplesAndOranges( 5, 15, 3, 2, apples, oranges );
		
		int[]apples1 = {2, 3, -4};
		int[]oranges1 = {3, -2, -4};
		countApplesAndOranges( 7, 10, 4, 12, apples1, oranges1 );
	}

}
