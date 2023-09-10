package com.prashant.codechef.problem;

public class MissingNumber {

	public static void main(String[] args) {
		int[]a= {1, 9, 2, 8, 3, 7, 4, 12, 5, 10, 6};
		System.out.println("Missing Number is : " + missingNumber(a));
	}

	static int missingNumber(int[] a) {
		int missingNumber = 0;
		int highestNumber = 0;
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > highestNumber) {
				highestNumber = a[i];
			}
			sum += a[i];
		}
		System.out.println("Sum of Array : " + sum);
		System.out.println("Highest Number is : " + highestNumber);
		
		int highestSum = (highestNumber * (highestNumber+1))/2;
		System.out.println("Sum of Highest number is : " + highestSum);
		missingNumber = highestSum - sum;
		return missingNumber;
	}
}
