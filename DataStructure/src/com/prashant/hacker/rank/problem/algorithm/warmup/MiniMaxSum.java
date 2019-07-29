package com.prashant.hacker.rank.problem.algorithm.warmup;

public class MiniMaxSum {

	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	int max = 0;
    	int min = 2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2-1;
    	int count = 0;

    	for(int j = 0; j < arr.length; j++) {
    		int sum1 = 0;
	    	for(int i = 0; i < arr.length; i++) {
	    		if(count == i)
	    			continue;
	    		sum1 = sum1 + arr[i];
	    	}
	    	count++;
    	// sum[j] = sum1;
    	if(max < sum1)
			max = sum1;
		if(min > sum1)
			min = sum1;
    	}
    	System.out.println(min + " "+ max);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5};
		int [] arr1 = {7, 69, 2, 221, 8974};
		miniMaxSum(arr1);

	}

}
