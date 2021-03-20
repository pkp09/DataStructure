package com.prashant;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class OracleTest1 {

	public static void main(String[] args) {

		substring();
		reverse();
		zeros();
	}

	static void zeros() {
		Integer[] int1 = {1,2,3,4,0,4,0,3,0,2,0,1};
		int count = int1.length;
		for(int i = 0; i < int1.length; i++) {
			System.out.println(int1[i]);
			if(int1[i] == 0) {
				int temp = int1[count-1];
				int1[count-1] = 0;
				int1[i] = temp;
				count--;
			}
		}
		System.out.println("Updated Array is : ");
		for(Integer it : int1) {
			System.out.print(it + " : ");
		}
	}
	
	static void reverse() {
		String str = "Welcome to Oracle";
		// output : emocleW ot elcarO
		System.out.println("Input String is : " + str);
		String[] str1 = str.split(" ");
		String rev = "";
		for(String str2 : str1) {
			for(int i = str2.length(); i >0 ; i--) {
				rev = rev + str2.substring(i-1, i);
			}
			rev = rev + " ";
		}
		System.out.println("Reversed String is : " +rev);
		
	}
	
	static void substring() {
		String str = "asdasdfghhgfertywel";
		System.out.println("Input String is : " + str);
		//asdfghertywl
		String str1 = "";
		int count = 0;
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++){
			str1 = str.substring(i, i+1);
			if(map == null || !map.containsKey(str1)) {
				map.put(str1,  1);
			}else {
				if(map.containsKey(str1)) {
					count = map.get(str1);
					count++;
					map.put(str1, count);
				}
			}
		}
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> keyset = it.next();
			String key = keyset.getKey();
			count = keyset.getValue();
			if(count > 1) {
				int lastIndex = str.lastIndexOf(key);
				str = str.substring(0, lastIndex) + str.substring(lastIndex+1, str.length());
			}
		}
		System.out.println("Final sub string is : " + str);

	}
}
