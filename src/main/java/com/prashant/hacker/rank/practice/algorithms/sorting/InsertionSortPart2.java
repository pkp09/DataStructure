package com.prashant.hacker.rank.practice.algorithms.sorting;

public class InsertionSortPart2 {

	public static void main(String[] args) {

		int[]arr = {1, 4, 6, 9, 2, 8, 3};
		insertionSort1(7, arr);
	}
	// needs to work
	// 1 4 6 9 2 8 3 
	// 1 2 6 9 3 8 4
	// 1 2 3 9 4 8 6
	// 1 2 3 4 8 6 9
	// 1 2 3 4 6 8 9
	
	 // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int temp = 0;
        int j ;
        for(int i = 0; i < arr.length; i++){
        	j = i;
        	temp = arr[i];
        	while(j < n-1 && temp > arr[j + 1]) {
        		temp = arr[j + 1];
        		arr[j + 1] = arr[j];
        		arr[j] = temp;
        		j++;
        	}	
        }
        printArr(arr);
    }

	
	static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
