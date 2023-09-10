package com.prashant.hacker.rank.practice.algorithms.sorting;

public class InsertionSortPart1 {

	 // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int temp = arr[n-1];
        for(int i = n-1; i >= 0; i--){
            if(arr[i] > temp){
                arr[i+1] = arr[i];
                printArr(arr);
                arr[i] = temp;
                temp = arr[i];
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 4, 6, 8, 3};
		insertionSort1(5, arr);
	}

}
