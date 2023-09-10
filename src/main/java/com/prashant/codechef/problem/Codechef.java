package com.prashant.codechef.problem;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// https://www.codechef.com/viewsolution/5973516

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{ 
	public static void main (String[] args) throws java.lang.Exception
	{
		// smallFactorials();
		// reverseNumber1();
		fancy();
	}
	
	static void test() {
		// your code goes here
				Scanner sc = new Scanner(System.in);
				boolean b = true;
				int i = 0;
				while(b){
				   i = sc.nextInt();
				    if(i != 42)
				        System.out.println(i);
				    else if(i == 42)
				        b = false;
				}
				sc.close();
	}
	
	static void add() {
		Scanner sc = new Scanner(System.in);
		int numberTC = sc.nextInt();
		int a  = 0, b = 0;
		for(int i = 0; i < numberTC; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
	
	// https://www.codechef.com/problems/PPATTERN
	// needs to work
	static void printPattern2() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int count = 1;
		// int print = 0;
		int nextline = 0;
		int col = 1;
		int colCount = 1;
		for(int j = 0; j <= i*i; j++) {
			for(int k = 0; k < i; k++ ) {
			count = k + count;
			System.out.print(count+" ");
			nextline++;
			}
			if(nextline%(i)==0) {
				System.out.println();
				colCount++;
				col = col + colCount;
				count = col;
			}
		}
		sc.close();
		
	}
	static void printPattern() {
		Scanner br=new Scanner(System.in);
		//int n=br.nextInt();
		//while(n!=0)
		// {
		    int x=br.nextInt();
			int a1[]=new int[x*x];
			int temp[]=new int[x*x];
			int k1=1,k2=1;
			int i;
			for(i=0;i<x*x;i++)
			{
				a1[i]=i+1;
			}
			for(i=0;i<x;i++)
			{
				temp[i]=k1;
				k1=k1+k2;
				k2++;
			}
			k1=1;
			k2=x;
			for(i=x;i<x*x;i++)
			{
				if((i+1)%x!=0)
				{
					temp[i]=a1[temp[k1]];
				}
				else
				{
					temp[i]=temp[k1-1]+k2;
					k2--;
				}
				k1++;
			}
			for(i=0;i<x*x;i++)
			{
				System.out.print(temp[i]+" ");
				if((i+1)%x==0)
				{
					System.out.println();
				}
			}
			// n--;
		  
		//}
		br.close();  
	}
	
	static void sumOfDigits() {
		Scanner sc = new Scanner(System.in);
		int tc= sc.nextInt();
		while(tc != 0) {
			int number = sc.nextInt();
			int x = 10;
			int j = number/x;
			int digit = number%x;
			int sum = 0;
			while(j != 0) {
				sum = sum + digit;
				digit = j%x;
				j = j/x;
			}
			if(digit != 0)
				sum = sum + digit;
			System.out.println(sum);
			tc--;
		}
		sc.close();
	}
	
	
	//https://www.codechef.com/submit/FLOW002
	static void findRemainder() {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc != 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a%b);
			tc--;
		}
		sc.close();
	}
	
	static void enormousInputTest() {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int k = sc.nextInt();
		int number = 0;
		int remainder = 0;
		while(tc != 0) {
			number = sc.nextInt();
			if(number % k == 0)
				remainder++;
			tc--;
		}
		System.out.println(remainder);
		sc.close();
	}
	
	static void smallFactorials() {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int i =0;
		BigInteger result = new BigInteger("1");
		while(tc != 0) {
			i = sc.nextInt();
			for(int k = i; k>0; k--) {
				BigInteger i1 = BigInteger.valueOf(k);
				result = result.multiply(i1);
			}
			System.out.println(result);
			tc--;
		}
		sc.close();
	}
	
	
	//https://www.codechef.com/submit/FLOW007#
	static void reverseNumber() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while(count-- != 0){
		    int number = sc.nextInt();
		    int div = number;
		    int mod = 0;
		    ArrayList<Integer> al = new ArrayList<>();
		    while(div != 0){
		        mod = div % 10;
		        if(mod == 0 && !al.isEmpty())
		            al.add(mod);
		        else if(mod != 0)
		            al.add(mod);
		    div = div/10;
		    }
		for(Integer it : al)
		    System.out.print(it);    
		}
	System.out.println();
	sc.close();	
	}
	
	
	static void reverseNumber1() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while(count-- != 0){
		    int number = sc.nextInt();
		    int div = number;
		    int mod = 0;
		    int sum = 0;
		    ArrayList<Integer> al = new ArrayList<>();
		    while(div != 0){
		        mod = div % 10;
		        sum = (sum*10) + mod;
		    div = div/10;
		    }
		    System.out.println(sum);
		for(Integer it : al)
		    System.out.print(it);    
		}
	System.out.println();
	sc.close();	
	}
	
	
	static void fancy() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while(count-- != 0){
			String str = sc.nextLine();
			String[] stArr = str.split(" ");
			boolean realFancy = false;
			for(int i = 0; i < stArr.length; i++) {
				if("not".equalsIgnoreCase(stArr[i])) {
					realFancy = true;
					break;
				}
			}
			if(realFancy)
				System.out.print("Real Fancy");
			else
				System.out.println("regularly fancy");
		}
		System.out.println();
		sc.close();
	}
	
	
	static void turboSort(String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		while(count-- != 0){
		    al.add(sc.nextInt());
		}
		Collections.sort(al);
		for(Integer i : al){
		    System.out.println(i);
		}
		sc.close();
	}
}