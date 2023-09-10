package com.prashant.hacker.rank.problem.warmup;

import java.time.Duration;
import java.time.Instant;

public class RepeatedString {

	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	String sNew = s;
    	long count1 = 0;
    	boolean br = false;
    	Instant start = Instant.now();
    	for(long i = 0; i < n ;) {
    		for(long j = i; j < sNew.length(); j++) {
    			i++;
    			if(sNew.length() > n) {
        			sNew = sNew.substring(0, (int)n);
        			br = true;
        			}
    			if(sNew.substring((int)j, (int)j+1).equals("a"))
    				count1++;
    		}
    		sNew = sNew + s;
    		
    		if(br)
    			break;
    		
    	}
    	Instant end = Instant.now();
    	
    	Duration timeElapsed = Duration.between(start, end);
    	System.out.println("Time taken: "+ timeElapsed.toMinutes() +" minutes");
    	
    	return count1;
    }
	
    static long repeatedString1(String s, long n) {
    	
    	int count = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.substring(i, i+1).equals("a")) {
    			count++;
    		}
    	}
    	
    	long div = n / (s.length());
    	long mod = n % s.length();
    	
    	long divCount = count * div;
    	for(int j = 0; j < mod; j++) {
    		if(s.substring(j, j+1).equals("a")) {
    			divCount = divCount + 1;
    		}
    	}
    	
    	return divCount;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedString1("aba", 1000000000000l));
	}

}
