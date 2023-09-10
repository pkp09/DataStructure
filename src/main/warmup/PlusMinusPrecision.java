package com.prashant.hacker.rank.problem.algorithm.warmup;

import java.text.DecimalFormat;

public class PlusMinusPrecision {

	 // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	DecimalFormat dec = new DecimalFormat("#0.000000");
    	
    	float plusPrecision = 0.0f;
    	float minusPrecision = 0.0f;
    	float zeroPrecision =0.0f;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] < 0)
    			minusPrecision++;
    		else if(arr[i] > 0 )
    			plusPrecision++;
    		else
    			zeroPrecision++;
    	}

    	System.out.println(dec.format(plusPrecision / arr.length));
    	System.out.println(dec.format(minusPrecision / arr.length));
    	System.out.println(dec.format(zeroPrecision / arr.length));
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {-4, 3, -9, 0, 4, 1};
		plusMinus(a);
	}

}
