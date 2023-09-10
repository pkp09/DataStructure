package com.prashant.codechef.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClearWaterPerfectSubString {

	
	public static void main(String[] args) {
		System.out.println("Count of perfect subStrings are : " + perfectSubString("111000222", 3));
	}
	
	static int perfectSubString(String str, int k) {
		List<String> alSub = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+k; j <= str.length(); j++) {
				String sub = str.substring(i, j);
				if(sub.length()%k == 0) {
					alSub.add(sub);
					System.out.println(sub);
				}
			}
		}
		Map<String, Integer> map = new HashMap<>();
		int count = 0;
		for(String sub : alSub) {
			for(int j = 0; j < sub.length(); j++) {
				String s = sub.substring(j, j+1);
				Integer v = map.get(s);
				if(v == null) {
					map.put(s, 1);
				}else if(v < k) {
					map.put(s, ++v);
				}else {
					break;
				}
			}
			boolean allTrue = false;
			for(Integer val : map.values()) {
				if(val != k) {
					allTrue = false;
				}else {
					allTrue = true;
				}
			}
			if(allTrue)
				count++;
			map.clear();
		}
		
		return count;
	}
	
	
	
}
