package com.prashant.hacker.rank.problem.algorithm.warmup;

public class BirthdayCakeCandle {

	static int birthdayCakeCandles1(int[] ar) {
		int count = 0;
		int maxSize = 0;
		for(int i = 0; i < ar.length; i++) {
			if(maxSize < ar[i]) {
				maxSize = ar[i];
				count = 1;
			}else if(maxSize == ar[i]){
				count++;
			}
		}
		
		return count;
	}
	static int birthdayCakeCandles(int[] ar) {
		int count = 1;
		int temp = 0;
		for(int i = 0; i < ar.length; i++) {
			for(int j = i; j < ar.length; j++) {
				if(ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}

		for(int i = 0; i < ar.length; i++) {
			if(ar[i] == ar[i+1])
				count++;
			else
				break;
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 2, 1, 3, 1, 3, 3 };
		System.out.println(birthdayCakeCandles1(a));
	}

}
