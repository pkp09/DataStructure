/**
 * 
 */
package com.prashant.practice.arraylist;

import java.util.ArrayList;

/**
 * @author Saurabh
 *
 */
public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		for(Integer elem : arrayList) {
			System.out.println(elem);
		}
		
		System.out.println("******************* Before Remove *******************");
		System.out.println("Get the element at index = 1 : " + arrayList.get(1));

		arrayList.remove(1);
		
		System.out.println("******************* After Remove *******************");
		System.out.print("Get the element at index = 1 : " + arrayList.get(1));
				
	}

}
