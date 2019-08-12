package com.prashant.hacker.rank.problem.algorithm.implementation;

import java.util.ArrayList;

/**
 * @author pkp09
 *
 */
public class SequenceEquation {
	
	 static int[] permutationEquation(int[] p) {
		 int[]result = new int[p.length];
		 for(int i = 1; i < p.length; i++) {
			 result[i] = p[p[i]-1];
		 }
		 int[]result1 = new int[p.length];
		 for(int i = 1; i < result.length; i++)
			 result1[i] = result[result[i]-1];
		 return result1;
	    }

	 
	 static int[] permutationEquation2(int[] p) {
		    int[]result = new int[p.length];
		         for(int i = 0; i < p.length; i++) {
		             result[i] = p[p[p[p[i]-1]-1]-1];
		         }
		         return result;
		    }
	 
	 public static void main(String ...args) {
		 //int[]p= {2, 3, 1};
		 // expected output 2 3 1
		//int[] p= {4, 3, 5, 1, 2};
		// expected output 1 3 5 4 2
		int[]p = {2, 5, 11, 10, 1, 14, 7, 3, 16, 9, 8, 6, 18, 12, 15, 17, 13, 4};
		// expected output 	2 5 11 13 1 14 7 3 4 18 8 6 16 12 15 10 9 17
		// My output 		2 5 11 17 1 14 7 3 18 13 8 6 9 12 15 4 10 16 
		int[]result = permutationEquation1(p);
		 for(int i = 0; i < result.length; i++)
			 System.out.print(result[i] + " ");
		 
		 
	 }

	 static int[] permutationEquation1(int[] p) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 for(int i = 0; i < p.length; i++)
			 list.add(p[i]);
		 int[]result = new int [p.length];
		 for(int i = 0; i < p.length; i++) {
			 result[i] = list.get(list.get(list.get(list.get(i)-1)-1)-1);
		 }
		 return result;
	 }
}