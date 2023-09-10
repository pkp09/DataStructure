package com.prashant.hacker.rank.problem.algorithm.implementation;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class MigratoryBirds {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(4);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		arr.add(3);
		// arr.add(3);
		// arr.add(3);
		System.out.println(migratoryBirds(arr));
	}

	static int migratoryBirds(List<Integer> arr) {
        int count = 0;
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for(Integer in : arr){
            if(hashtable.containsKey(in)){
                count = hashtable.get(in);
                hashtable.put(in, count+1);
            }else
            hashtable.put(in, 1);
        }
        
        Enumeration<Integer> keys = hashtable.keys();
        int key = 0;
        
        int value = 0;
        int answer = 0;
        int i =0;
        int k = 0;
        while(keys.hasMoreElements()){
            key = keys.nextElement();
            if(value < hashtable.get(key) || value == hashtable.get(key) ) {
            	value = hashtable.get(key);
            	
            	answer = i+1;
            	k = key;
            }
            i++;
        }
    return (hashtable.get(k) > answer ? hashtable.get(k):answer);
    }
}