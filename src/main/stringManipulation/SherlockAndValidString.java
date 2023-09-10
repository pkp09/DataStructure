package com.prashant.hacker.rank.problem.interviewPreparationKit.stringManipulation;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isValid("abcabcacdb");
	}

	// Complete the isValid function below.
	// Still needs to work
    static String isValid(String s) {
    	String sValid = "";
    	
    	Map<String, Integer> chars = new HashMap<String, Integer>();
    	
    	int[] c = new int[s.length()];
    	
    	for(int i = 0; i < s.length(); i++) {
    		int count = 0;
    		for(int j = i; j < s.length(); j++) {
    			if(s.length() > i+1 && s.length() > j+1 && 
    					s.substring(i, i+1).equals(s.substring(j, j+1))) {
    					++count;
    			}
    		}
    		chars.put(s.substring(i, i+1), count);
    		c[i] = count;
    	}
    	
    	return sValid;
    }
}
