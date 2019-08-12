package com.prashant.hacker.rank.problem.algorithm.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author pkp09
 *
 */
//https://www.hackerrank.com/challenges/equality-in-a-array/problem
public class EqualityInArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int equalizeArray(int[] arr) {
		int counter = 0;
		List<Integer> al = new ArrayList<>();
		for(int i = 0; i < arr.length; i++)
			al.add(arr[i]);
		Collections.sort(al);
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i < al.size();i++) {
			if(i+1 == al.size()) {
				if(al.get(i).equals(al.get(i-1))) {
					counter++;
					map.put(al.get(i), counter);
				}else
					map.put(al.get(i), 1);
				continue;
			}
			if(al.get(i).equals(al.get(i+1)))
				counter++;
			else {
				counter++;
				map.put(al.get(i), counter);
				counter = 0;
			}
		}
		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		int higher = 0;
		while(it.hasNext()) {
			int val = it.next().getValue();
			if(higher < val)
				higher = val;
		}
		return al.size() - higher;
    }
}
