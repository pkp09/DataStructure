import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

class GFG {
	public static void main (String[] args) {
		// checkTwoArray();
		// lowerCase();
		// javaInputOutput();
		// javaIterator();
		//spiderStep();
//		deleteAlternateChar();
		stock();
	}
	
	// https://practice.geeksforgeeks.org/problems/java-convert-string-to-lowercase/0
	static void lowerCase() {
		Scanner sc = new Scanner(System.in);
		 int counter = sc.nextInt();
		 while(counter != 0){
		     String str = sc.next();
		     System.out.println(str.toLowerCase());
		     counter--;
		 }
		 sc.close();
	}
	
	
	// https://practice.geeksforgeeks.org/problems/java-inputoutput/0/?ref=self
	static void javaInputOutput() {
		Scanner sc = new Scanner(System.in);
		int counter = sc.nextInt();
		while(counter != 0) {
			String str = sc.next();
			int i = sc.nextInt();
			System.out.println("The input string :" + str);
			System.out.println("The input integer :" + i);
			counter--;
		}
		sc.close();
		
	}
	
	//https://practice.geeksforgeeks.org/problems/java-iterator/0
	static void javaIterator() {
	Scanner sc = new Scanner(System.in);
	int count = sc.nextInt();
	while(count-- != 0) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		int elem = 0;
		while(n>0) {
			elem = sc.nextInt();
			al.add(elem);
			n--;
		}
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			if(k > Integer.valueOf(it.next())) {
				it.remove();
			}
		}
		Collections.sort(al);
		System.out.println(al);
	}
	sc.close();
	}
	
	// The Spider Steps
	// https://practice.geeksforgeeks.org/problems/the-spider-steps/0/?ref=self
	// needs to work
	static void spiderStep() {
	Scanner sc = new Scanner(System.in);
	int tc = sc.nextInt();
	while(tc-- != 0) {
		int h = sc.nextInt(), u = sc.nextInt(), d = sc.nextInt();
		int distanceCovered = u-d;
		int h1 = h-u;
		int div = h1/distanceCovered;
		int remainder = h1 % distanceCovered;
		if(remainder > 0)
			System.out.println(div + 1);
		else
			System.out.println(div);
	}
	sc.close();
	}
	// Java Delete alternate characters
	// https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters/0/?ref=self
	static void deleteAlternateChar() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while(count-- != 0) {
			String str = sc.next();
			for(int i = 0; i< str.length(); i++) {
				System.out.print(str.substring(i, i+1));
				i++;
				
			}
		}
		sc.close();
	}
	static void test() {
		//code
		Scanner s = new Scanner(System.in);
    	int input = s.nextInt();
	    for(int i=0;i<input;i++)
	    {
	       String str= s.nextLine();
	       Stack<Character> ss= new Stack<Character>();
	       boolean b=false;
    	for(int k=0;k<str.length();k++)
	      {
	        if(str.charAt(k)=='('||str.charAt(k)=='{'||str.charAt(k)=='[')
	        {
	            ss.push(str.charAt(k));
	            System.out.println("pushed"+str.charAt(k));
	        }
	        else{
	            if(ss.empty()==true)
	            {
	                b=true;
	            }
	            else
	            {
	                if(str.charAt(k)==')')
	                {
	                    if(ss.peek()=='(')
	                    {
	                       ss.pop(); 
	                    }
	                    else{b=true;}
	                }
	                if(str.charAt(k)=='}')
	                {
	                    if(ss.peek()=='{')
	                    {
	                       ss.pop(); 
	                    }
	                    else{b=true;}
	                }
	                if(str.charAt(k)==']')
	                {
	                    if(ss.peek()=='[')
	                    {
	                        ss.pop();
	                    }
	                    else{b=true;}
	              }
	            }
	        }
	      }
	     if(b==true)
	     { System.out.println("not balanced"); }
	     else if(ss.empty()==true)
	     {System.out.println("balanced");}
	     else
	     {System.out.println("not balanced");}
	     
	   }
	    s.close();
	}
	
	
	//Given a string, find its first non-repeating character
	// needs to work
	/*static void findFirstNonrepeatingChar(String str) {
		HashMap<String, Integer> set = new HashMap<>();
		int value =1;
		for(int i = 0; i < str.length(); i++) {
			if(set.containsKey(str.substring(i, i+1))) {
			set.entrySet().
				set.put(str.substring(i, i+1), value);
			}
		}
	}*/
	
	// https://www.geeksforgeeks.org/reverse-words-in-a-given-string/
	static void reverseString() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while(count != 0) {
			String str = sc.next();
			String[] strArr = str.split("\\.");
			for(int i = strArr.length-1; i >= 0; i--) {
				if(i != 0)
					System.out.print(strArr[i] + ".");
				else
					System.out.print(strArr[i]);
			}
			System.out.println();
			count--;
		}
		sc.close();
	}
	
	static void checkTwoArray() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while(count-- != 0) {
			int size = sc.nextInt();
			String a = sc.next("\n");
			String b = sc.next();

			String[] arrA = a.split(" ");
			String[] arrB = b.split(" ");
			
			boolean equ = false;

			if(size != arrA.length || size != arrB.length || arrA.length != arrB.length)
				equ = false;
			else {
				Arrays.sort(arrA);
				Arrays.sort(arrB);
				for(int i = 0; i < arrA.length; i++) {
					if(!arrA[i].equals(arrB[i]))
						equ =false;
					else
						equ = true;
				}
			}
			if(!equ)
				System.out.println("0");
			else
				System.out.println("1");
		}
		sc.close();
	}
	
	/*
	 * Input
	 	7
		100 180 260 310 40 535 695
		10
		23 13 25 29 33 19 34 45 65 67
		
		Output:
		(0 3) (4 6)
		(1 4) (5 9)
	*/
	// https://practice.geeksforgeeks.org/problems/stock-buy-and-sell/0
	static void stock() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while (count-- != 0) {
			int size = sc.nextInt();
			int a[] = new int[size];
			int i = 0;
			while (size-- != 0) {
				a[i++] = sc.nextInt();
			}

			int buy_date = -1, sale_date = -1;
			boolean b = false;
			for (int k = 0; k < a.length - 1; k++) {
				if (a[k] < a[k + 1]) {
					if( buy_date == -1)
						buy_date = k;
				} else {
					if (buy_date > -1)
						sale_date = k;
				}
				if (buy_date != -1 && sale_date != -1) {
					System.out.print("(" + buy_date + "," + sale_date + ")");
					buy_date = -1; 
					sale_date = -1;
					b = true;
				}else {
					System.out.println("No Profit");
				}
			}
			if(buy_date != -1) {
				System.out.print("(" + buy_date + "," + (a.length-1) + ")");
				b = true;
			}
			if(!b)
					System.out.println("No Profit");
			System.out.println();
		}
		sc.close();
	}
	
	
	//https://practice.geeksforgeeks.org/problems/smaller-on-left2036/0
	// needs to work
	static void smallerOnLeft() {

		 Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			while (count-- != 0) {
				int size = sc.nextInt();
				int a[] = new int[size];
				int i = 0;
				while (size-- != 0) {
					a[i++] = sc.nextInt();
				}
	        
	        for(int k = 0 ; i < a.length-1; i++){
	            if(a[k+1] > a[k])
	                a[k+1] = -1;
	            else
	                a[k+1] = --a[k+1];
	            }
			}
			sc.close();
	}
}