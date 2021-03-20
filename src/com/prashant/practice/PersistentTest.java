package com.prashant;

public class PersistentTest {

	public static void main(String[] args) {
		int[] sortedDuplicateArray = {10, 20, 20, 30, 30, 30, 40};
		removeDuplicate(sortedDuplicateArray);
		System.out.println("******************************************");
		int[] sortedDuplicateArray1 = {10, 20, 20, 30, 30, 30, 40, 40, 50, 50, 50};
		removeDuplicate(sortedDuplicateArray1);
		System.out.println("*******************************************");
		String str = "LALITA";
		nonRepeatingCharacter(str);
		
		String str1 = "PRASHANT";
		nonRepeatingCharacter(str1);
		
		String str2 = "RAHUL";
		nonRepeatingCharacter(str2);
	}

	static void nonRepeatingCharacter(String str) {
		String newStr = "";
		String sub = "";
		for(int i = 1; i <= str.length(); i++) {
			sub = str.substring(i-1, i);
			newStr = str.substring(0, i-1) + str.substring(i);
			if(!newStr.contains(sub)) {
				System.out.println("Non repeating character is : " + sub + " : index is : " + i);
			}
		}
	}
	
	static void removeDuplicate(int[] sortedDuplicateArray) {
		int[] sortedArray = new int[sortedDuplicateArray.length];
		int count= 1;
		sortedArray[0] = sortedDuplicateArray[0];
		for(int i = 0; i < sortedDuplicateArray.length; i++) {
			if(sortedDuplicateArray[i] != sortedArray[count-1]) {
				sortedArray[count] = sortedDuplicateArray[i];
				count++;
			}
		}
		
		for(Integer it3 : sortedArray) {
			System.out.println(it3);
		}
	}
}