package com.prashant.hacker.rank.problem.array;

public class ReverseArray {
	
	static int[] reverseArray(int[] a) {
        int [] arr = new int[a.length];
        int c = 0;
        for(int i = a.length; i > 0; i--){
            System.out.println(a[i-1]);
            arr[c] = a[i-1];
            c++;
        }

    return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,2, 3, 4};
		reverseArray(a);
	}

}
