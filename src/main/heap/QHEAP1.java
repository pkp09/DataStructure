package com.prashant.hacker.rank.practice.datastructures.heap;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QHEAP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Queue<Integer> q = new PriorityQueue<>(); 
		while(count-- != 0) {
			switch(sc.nextInt()) {
			case 1:{
				q.add(sc.nextInt());
				break;
			}
			case 2:{
				q.remove(sc.nextInt());
				break;
			}
			case 3:{
				System.out.println(q.peek());;
				break;
			}
			default:
		          ;
			}
		}
		sc.close();
	}

}
