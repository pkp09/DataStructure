package com.prashant.hacker.rank.problem.algorithm.warmup;

public class DiagonalDifference {

	static int diagonalDifference(int[][] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr[i].length; j++) {
        		if(i == j)
        			sumLeft = sumLeft + arr[i][j];
        		if(i+j == arr.length - 1)
        			sumRight = sumRight + arr[i][j];
        	}
        }
        return Math.abs(sumLeft - sumRight);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]a = {
				{11, 2, 4},
				{4, 5, 6},
				{10, 8, -12}
		};
		
		/* [0][0] = 11, [0][1] = 2, [0][2] = 11, [0][3] = 11
		 * [1][0] = 4, [1][1] = 5, [1][2] = 6, [1][3] = 6,
		 * [2][0] = 10, [2][1] = 8, [2][2] = -12, [2][3] = -12,
		 * [3][0] = 10, [3][1] = 8, [3][2] = -12, [3][3] = -12;
		 * 
		 * */
		
		System.out.println(diagonalDifference(a));
	}

}
