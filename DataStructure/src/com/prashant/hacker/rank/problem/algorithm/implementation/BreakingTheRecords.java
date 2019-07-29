package com.prashant.hacker.rank.problem.algorithm.implementation;

public class BreakingTheRecords {

	public static void main(String[] args) {

	}
	
	 // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	int highScore = scores[0];
    	int high = 0;
    	int lowScore = scores[0];
    	int low = 0;
    	for(int i = 1; i < scores.length; i++) {
    		if(highScore < scores[i]) {
    			highScore = scores[i];
    			high++;
    		}
    		if(lowScore > scores[i]) {
    			lowScore = scores[i];
    			low++;
    		}
    	}
    	int[] records = {high, low};
    	return records;
    }
}