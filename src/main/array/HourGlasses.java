package com.prashant.hacker.rank.problem.array;

public class HourGlasses {
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	
    	int sum1 = 0, sum2=0, sum3=0, sum = -1000000000 ;
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr[i].length; j++) {
    			if(i < arr.length-2 && j < arr[i].length-2){
	    			sum1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
	    			sum2 = arr[i+1][j+1];
	    			sum3 = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
    			}
    			System.out.println(sum1 + sum2 + sum3);
    			if(sum < sum1 + sum2 + sum3)
    				sum = sum1 + sum2 + sum3;
    			
    		}
    	}
    	return sum;

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int[][] arr = new int[6][6];
		
		for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
		for (int j = 0; j < 6; j++) {
            int arrItem = Integer.parseInt(arrRowItems[j]);
            arr[i][j] = arrItem;
        }

        }
		
		 int result = hourglassSum(arr);
		*/
		int[][] a = {
			      {1,  2,  3,  4,  5,  6}, 
			      {7,  8,  9,  10, 11, 12}, 
			      {13, 14, 15, 16, 17, 18}, 
			      {19, 20, 21, 22, 23, 24},
			      {25, 26, 27, 28, 29, 30},
			      {31, 32, 33, 34, 35, 36},
			};
		
		
		int[][] a1 = {
				{-1, -1, 0, -9, -2, -2},
				{-2, -1, -6, -8, -2, -5},
				{-1, -1, -1, -2, -3, -4},
				{-1, -9, -2, -4, -4, -5},
				{-7, -3, -3, -2, -9, -9},
				{-1, -3, -1, -2, -4, -5}
		};
		int result = hourglassSum(a1);
		System.out.println(result);

	}

}
