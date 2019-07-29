package com.prashant.hacker.rank.problem.array;

public class SparseArray {
	static int[] matchingStrings(String[] strings, String[] queries) {
		int[] result = new int[queries.length];
		int index = 0;
		for(String q : queries) {
			int count = 0;
			for(String s : strings) {
				if(s.equals(q)) {
					 ++count;
				}
				
			}
			result[index++] = count;
		}
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] strings = {"def", "de", "fgh"};
//		String[] queries = {"de", "lmn", "fgh"};
//		matchingStrings(strings, queries);
		
		String[] strings1 = {"aba", "baba", "aba", "xzxb"};
		String[] queries1 = {"aba", "xzxb", "ab"};
		matchingStrings(strings1, queries1);
	}

}
