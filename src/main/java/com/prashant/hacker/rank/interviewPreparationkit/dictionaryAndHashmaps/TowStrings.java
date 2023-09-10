package com.prashant.hacker.rank.interviewPreparationkit.dictionaryAndHashmaps;

public class TowStrings {

	public static void main(String[] args) {

	}
	
	// needs to work
	 // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	int i = 0;
    	String [] s11 = new String[s1.length()];
    	while(i < s1.length()) {
    		s11[i++] = s1.substring(i, i+1);
    	}

    	String [] s21 = new String[s2.length()];
    	while(i < s2.length()) {
    		s21[i++] = s2.substring(i, i+1);
    	}
    	
    	
    	if(s1.length() > s2.length()) {
    		for(i = 0; i < s1.length(); i++) {
    			
    		}
    	}else {
    		
    	}
    	
    	return "";
    }

}
