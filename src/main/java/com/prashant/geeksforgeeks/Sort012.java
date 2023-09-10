package com.prashant.geeksforgeeks;

public class Sort012 {

	public static void main(String args[]) {
		int a[] = {0,0,0,0,0,22,1,2,1,21,2,1,2,1,2,1,0,1,2,1,0};
		sort012(a);
	}
	public static void sort012(int a[])
    {
        // code here 
        int low =0, mid = 0, high = a.length -1;
        int temp =0;
        while(mid <= high){
	        switch(a[mid]){
	            case 0 : {
	                temp = a[mid];
	                a[mid] = a[low];
	                a[low] = temp;
	                low++;
	                mid++;
	                break;
	            }
	            
	            case 1:{
	                mid++;
	                break;
	            }
	            
	            case 2:{
	                temp = a[mid];
	                a[mid] = a[high];
	                a[high] = temp;
	                high--;
	                break;
	            }
	        }
        }
        for(int i = 0; i < a.length; i++) {
        	System.out.println(a[i]);
        }
    }
}
