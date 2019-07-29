package com.prashant.hacker.rank.problem.interviewPreparationKit.stringManipulation;

public class AlternationCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
		System.out.println(alternatingCharacters("AAAABBBB"));
	}

	
	// Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    	char[] c = s.toCharArray();
    	int deletedCount = 0;
    	
    	for(int i = 0; i < c.length; i++) {
    		if(c.length > i+1 && c[i] == c[i+1])
    			++deletedCount;
    	}
    	return deletedCount;
    }
}
