package com.prashant.hacker.rank.problem.warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


/*
 * 
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):

n: the number of socks in the pile
ar: the colors of each sock
Input Format

The first line contains an integer , the number of socks represented in . 
The second line contains  space-separated integers describing the colors  of the socks in the pile.

Constraints

 where 
Output Format

Print the total number of matching pairs of socks that John can sell.

Sample Input

9
10 20 20 10 10 30 50 10 20
Sample Output

3
 * 
*/
public class PairCount {

	
	static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> pairCount = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < n; i++){
        	int value = 0;
            if(pairCount.containsKey(ar[i])) {
            	value = pairCount.get(ar[i]);
            	pairCount.put(ar[i], ++value);
            }else
            	pairCount.put(ar[i], ++value);
        }
        int count = 0;
       for(Entry<Integer, Integer> set : pairCount.entrySet()) {
    	   count = count + (set.getValue() / 2);
       }
        return count;

    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {1, 1 ,3, 1, 2, 1, 3, 3, 3, 3};
		int count = sockMerchant(10, ar);
		System.out.println(count);
		
		
		
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
	}

}
