package com.prashant.hacker.rank.problem.algorithm.implementation;

// https://www.hackerrank.com/challenges/strange-advertising/problem
public class ViralAdvertising {

	public static void main(String[] args) {
		System.out.println(viralAdvertising(2));
		System.out.println(viralAdvertising(3));
		System.out.println(viralAdvertising(4));
		System.out.println(viralAdvertising(5));
		System.out.println(viralAdvertising(6  ));
	}

	// Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
    	int cummulative = 0;
    	int i = 5;
    	int like = 0;
    	while(n-- != 0) {
    		like = i/2;
    		cummulative += like;
    		i = like * 3;
    	}
    	return cummulative;
    }
}
