package com.prashant.hacker.rank.interviewPreparationkit.stackQueue;

import java.util.Stack;

//https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
public class BalancedBrackets {
	public static void main(String args[]) {
		System.out.println(isBalanced("{(([])[])[]]}"));
		
		System.out.println(isBalanced("{{)[](}}"));
		
		System.out.println(isBalanced("{{([])}}"));
	}
	static String isBalanced(String s) {
			String yes = "YES";
			String no = "NO";
			Stack<String> stack = new Stack<>();
			if(s == null || s.length() == 0)
				return no;
			for(int i = 0; i < s.length(); i++) {
				System.out.print(s.substring(i, i+1) + " ");
				if(s.substring(i, i+1).equals("["))
					stack.add("[");
				else if(s.substring(i, i + 1).equals("]")) {
					if(!stack.isEmpty()) {
						String top = stack.peek();
						if(top.equals("["))
							stack.pop();
						else
							stack.add(s.substring(i, i + 1));
					}else
						return no;
				} else if (s.substring(i, i + 1).equals("{"))
					stack.push("{");
				else if (s.substring(i, i + 1).equals("}")) {
					if (!stack.isEmpty()) {
						String top = (String) stack.peek();
						if (top.equals("{"))
							stack.pop();
						else
							stack.add(s.substring(i, i + 1));
					} else
						return no;
				} else if (s.substring(i, i + 1).equals("("))
					stack.push("(");
				else if (s.substring(i, i + 1).equals(")")) {
					if (!stack.isEmpty()) {
						String top = (String) stack.peek();
						if (top.equals("("))
							stack.pop();
						else
							stack.add(s.substring(i, i + 1));
					} else {
						return no;
					}
				}
			}
			if (stack.isEmpty())
				return yes;
			
			return no;
		}
}

