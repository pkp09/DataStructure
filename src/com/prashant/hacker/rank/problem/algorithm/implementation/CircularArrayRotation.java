package com.prashant.hacker.rank.problem.algorithm.implementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author pkp09
 *
 */
// https://www.hackerrank.com/challenges/circular-array-rotation/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
public class CircularArrayRotation {
	//Correct solution
	static int[] circularArrayRotation1(int[] a, int k, int[] queries) {
//		if(a.length == k )
//    		return a;
		int counter = k % a.length;
		int[] temp = new int[a.length];
		// 1 2 3 4 5 6 7 8 9
		// 9 12345678
		// 8 9 1234567
		// 7 8 9 123456
		//6 7 8 9 12345
		int j = a.length;
		for(int i = counter; i > 0; i--) {
			// counter = 4
			// temp = 9 
			temp[i-1] = a[--j];
		}
		int k1 = 0;
		for(int i = counter; i< a.length; i++) {
			temp[counter++] = a[k1++];
		}
		
		int[]t1 = new int [queries.length]; 
    	for(int i = 0; i < queries.length; i++) {
    		t1[i] = temp[queries[i]];
    	}
    	return t1;
	}
	
	// Complete the circularArrayRotation function below.
	// a: an array of integers to rotate
	// k: an integer, the rotation count
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    	if(a.length == k )
    		return a;
    	int counter = k % a.length;
    	for(int i = 0; i < counter; i++ ) {
    		int temp[] = new int [a.length];
    		for(int j = 0; j < a.length; j++) {
    			if(j+1 == a.length) {
    				temp[0] = a[j];
    				break;
    			}
    			temp[j+1] = a[j];		
    		}
    		a = temp;
    		temp = null;
    	}
    	int[]t1 = new int [queries.length]; 
    	for(int i = 0; i < queries.length; i++) {
    		t1[i] = a[queries[i]];
    	}
    	return t1;
    }

    public static void main(String ...args) {
    	int[]a1 = {1,2,3,4,5,6,7,8,9};
    	int numberOfRotation1 = 4;
    	int[]queries1 = {1,2,3,4,5,6,7};
    	int[] result = circularArrayRotation1(a1,numberOfRotation1, queries1);
    	for(int i = 0; i < result.length; i++)
    		System.out.println(result[i]);
    	System.out.println("+++++++++++++++++++++++++++++++++");
    	 int numberOfRotation = 72823;
    	 int[]a = read(new File("C:\\Users\\Saurabh\\Desktop\\Hackerrank\\CircularArrayRotation\\Array.txt"));
    	 int queries[] = read("C:\\Users\\Saurabh\\Desktop\\Hackerrank\\CircularArrayRotation\\Queries.txt") ;
    	int[] result1 = circularArrayRotation1(a,numberOfRotation, queries);
    	for(int i = 0; i < result1.length; i++)
    		System.out.print(result1[i]+ ", ");
    }
    

    public static int[] read(String fileName) {
    	// BufferedReader br = null;
//    	FileReader fr = null;
    	int[] iStr = new int[500];
    	try(BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {
    		String str = "";
    		int count = 0;
    		while((str = br.readLine())!= null) {
    			iStr[count] = Integer.parseInt(str);
    			count++;
    		}
    	} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return iStr; 
    }
    
    public static int[] intArray(String[] strings) {
    	int[] intarray=new int[strings.length];
        int i=0;
        for(String str:strings){
            intarray[i]=Integer.parseInt(str.trim());
            i++;
        }
        return intarray;
    }
    
    public static int[] read(File file) {
    	int[] iStr = null;
    	try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line = "";
			while((line = br.readLine()) != null) {
				String [] str = line.split(" ");
				iStr=intArray(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return iStr;
    }
}
