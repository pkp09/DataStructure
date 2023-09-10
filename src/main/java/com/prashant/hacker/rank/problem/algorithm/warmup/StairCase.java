package com.prashant.hacker.rank.problem.algorithm.warmup;

public class StairCase {
	
	// Complete the staircase function below.
    static void staircase(int n) {
    	int printSpace = n-1;
        for(int i = 0; i < n; i++){
            for(int j = printSpace; j >0; j--)
                System.out.print(" ");
            for(int k = 0; k <= i; k++)
            	System.out.print("#");
            System.out.println();
            printSpace--;
        }


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staircase(6);
	}

}
