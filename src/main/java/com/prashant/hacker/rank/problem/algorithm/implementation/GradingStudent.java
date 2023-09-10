package com.prashant.hacker.rank.problem.algorithm.implementation;

public class GradingStudent {

	 static int[] gradingStudents(int[] grades) {
	     int []finalResult = new int[grades.length];
	     int index = 0;
	     for(int i = 0; i < grades.length; i++) {
	    	 if(grades[i] > 37) {
	    		 int modules = grades[i]%5;
	    		 if((5-modules) <= 2) {
	    			 finalResult[index] = grades[i]+(5-modules);
	    			 index++;
	    		 }else {
	    			 finalResult[index] = grades[i];
	    			 index++;
	    		 }
	    	 }else {
    			 finalResult[index] = grades[i];
    			 index++;
    		 }
	     }
	     
		 return finalResult;
	    }
	 
	 public static void main(String args[]) {
		 int[]grades = {4, 73, 67, 38, 33};
		 
		int[]finalR =  gradingStudents(grades);
		for(int i = 0; i < finalR.length; i++) {
			System.out.println(finalR[i]);
		}
	 }
}
