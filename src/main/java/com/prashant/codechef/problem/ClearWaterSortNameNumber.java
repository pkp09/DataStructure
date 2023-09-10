package com.prashant.codechef.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClearWaterSortNameNumber {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Prashant 3");
		names.add("Prashant 2");
		names.add("Vaibhav 2");
		names.add("Vaibhav 1");
		names.add("Sudhanshu 0");
		
		sortName(names);
		
		names.forEach(System.out::println);
	}
	
	static void sortName(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			public int compare(String str1, String str2) {
				String str11 = str1.substring(0, str1.indexOf(" "));
				String str21 = str2.substring(0, str2.indexOf(" "));
				if(str11.equals(str21)) {
					Integer str12 = Integer.valueOf(str1.substring(str1.indexOf(" ")+1));
					Integer str22 = Integer.valueOf(str2.substring(str2.indexOf(" ")+1));
					return str12.compareTo(str22);
				}else {
					return str1.compareTo(str2);
				}
			}
		});
	}
	// XXXIII = 43
	static Integer convertRomanToNumber(String roman) {
		if(roman.equals("I"))
			return 1;
		else if(roman.equals("II"))
			return 2;
		else if(roman.equals("III"))
			return 3;
		else if(roman.equals("IV"))
			return 4;
		else if(roman.equals("V"))
			return 5;
		else if(roman.equals("VI"))
			return 6;
		else if(roman.equals("VII"))
			return 7;
		else if(roman.equals("VIII"))
			return 8;
		else if(roman.equals("IX"))
			return 9;
		else if(roman.equals("X"))
			return 10;
		return 0;
	}
}



