package com.prashant.datastructure.stack;

import java.util.Stack;

// https://www.geeksforgeeks.org/data-structure-gq/stack-gq/
// https://www.geeksforgeeks.org/stack-data-structure-introduction-program/
// https://www.geeksforgeeks.org/stack-class-in-java/

// https://www.geeksforgeeks.org/stack-data-structure/
public class SimpleArrayBasedStack {
	protected Object[] stack;
	// Index of the top element in the stack.
	protected int top = -1;

	public SimpleArrayBasedStack(int capacity) {
		stack = new Object[capacity];
	}

	/**
	 * To check size of the stack
	 * 
	 * @return
	 */
	public int size() {
		return top + 1;
	}

	/**
	 * To check if stack is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (top < 0);
	}

	/**
	 * To push a item on top of stack.
	 * 
	 * @return
	 * @throws Exception
	 */
	public void push(Object item) throws Exception {
		if (top >= (stack.length - 1))
			throw new Exception("Stack is already full");
		stack[++top] = item;
	}

	/**
	 * To remove a item from top of stack
	 * 
	 * @return
	 */
	public Object pop() throws Exception {
		if (top < 0) {
			throw new Exception("Stack is Empty");
		}
		Object obj = stack[top];
		stack[top--] = null;
		return obj;
	}

	/**
	 * To look up top item in stack without removing it from stack
	 * 
	 * @return
	 */
	public Object top() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty");
		Object result = stack[top];
		return result;
	}

	/**
	 * Indicates whether the stack is full or not.
	 * 
	 * @return
	 */
	public boolean isStackFull() {
		if (top == stack.length - 1)
			return true;
		return false;
	}

	public Object[] get() {
		return stack;
	}

	@Override
	public String toString() {
		if (size() < 0)
			return "";
		String s = "[";
		for (int i = 0; i <= top; i++)
			s = s + stack[i] + ", ";
		s = s + "]";
		return s;
	}

	static String isBalanced(String s) {
		String yes = "YES";
		String no = "NO";
		Stack<String> stack = new Stack<>();
		if(s == null || s.length() == 0)
			return no;
		for(int i = 0; i < s.length(); i++) {
			if(s.substring(i, i+1).equals("["))
				stack.add("[");
			else if(s.substring(i, i + 1).equals("]")) {
				if(!stack.isEmpty()) {
					String top = stack.peek();
					if(top.equals("["))
						stack.pop();
				}else
					return no;
			} else if (s.substring(i, i + 1).equals("{"))
				stack.push("{");
			else if (s.substring(i, i + 1).equals("}")) {
				if (!stack.isEmpty()) {
					String top = (String) stack.peek();
					if (top.equals("{"))
						stack.pop();
				} else
					return no;
			} else if (s.substring(i, i + 1).equals("("))
				stack.push("(");
			else if (s.substring(i, i + 1).equals(")")) {
				if (!stack.isEmpty()) {
					String top = (String) stack.peek();
					if (top.equals("("))
						stack.pop();
				} else {
					return no;
				}
			}
		}
		if (stack.isEmpty())
			return yes;
		
		return yes;
	}
	/**
	 * Checking balancing of symbols.
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public boolean parenthesisChecker(String str) throws Exception {
		// [()]{}{[()()]()}
		if (str == null || str.length() == 0)
			return true;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("["))
				push("[");
			else if (str.substring(i, i + 1).equals("]")) {
				if (!isEmpty()) {
					String top = (String) top();
					if (top.equals("["))
						pop();
				} else
					return false;
			} else if (str.substring(i, i + 1).equals("{"))
				push("{");
			else if (str.substring(i, i + 1).equals("}")) {
				if (!isEmpty()) {
					String top = (String) top();
					if (top.equals("{"))
						pop();
				} else
					return false;
			} else if (str.substring(i, i + 1).equals("("))
				push("(");
			else if (str.substring(i, i + 1).equals(")")) {
				if (!isEmpty()) {
					String top = (String) top();
					if (top.equals("("))
						pop();
				} else {
					return false;
				}
			}
		}
		if (isEmpty())
			return true;

		return false;
	}

	// https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
	public String reverseString(String str) throws Exception {
		if (str == null || str.length() == 0)
			return "";
		for (int i = 0; i < str.length(); i++) {
			push(str.substring(i, i + 1));
		}

		String revStr = "";
		for (int i = 0; i < size(); i++)
			revStr = (String) pop();

		return revStr;
	}

	
	private void fillStack(Object[] stack, int index, Object element) {
		stack[index] = element;
	}

	/**
	 * Reverse a stack using recursion method.
	 * 
	 * @param stack1
	 * @param index
	 *            it should start from 0
	 * @throws Exception
	 * https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
	 */
	public Object[] reverseStack(Object stack1[], int index) throws Exception {
		Object element = null;
		while (!isEmpty()) {
			element = pop();
			stack1 = stack;
			reverseStack(stack1, ++index);
			fillStack(stack1, --index, element);
			stack = stack1;
		}
		return stack;
	}

	/**
	 * Reverse the stack using for loop.
	 * @param stack1 
	 * @param index it should start from 0;
	 * @throws Exception
	 * https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
	 */
	public void reverseStackFor(Object stack1[], int index) throws Exception {
		Object element = null;
		int count = size();
		for (int i = 0; i < stack1.length; i++) {
			element = pop();
			stack1 = stack;
			reverseStackFor(stack1, ++index);
			fillStack(stack1, --count, element);
			stack = stack1;
		}
	}
	
	// https://www.geeksforgeeks.org/length-longest-balanced-parentheses-prefix/
	public int maxBalancedPrefix(String str) throws Exception{
		int count = 0;
		int furthest = 0;
		for(int i = 0; i < str.length(); i++) {
			String subStr = str.substring(i, i+1);
			if(subStr.equals("[")) {
				push(subStr);
				++count;
			}else if(subStr.equals("]")) {
				if(top().equals("[")) {
					pop();
					++count;
				}
			}
			else if(subStr.equals("(")) {
				push(subStr);
				++count;
			}else if(subStr.equals(")")) {
				if(top().equals("(")) {
					pop();
					++count;
				}
			}
			else if(subStr.equals("{")) {
				push(subStr);
				++count;
			}else if(subStr.equals("}")) {
				if(top().equals("{")) {
					pop();
					++count;
				}
			}
			if(isEmpty()) {
				furthest = count;
			}
		}
		System.out.println(furthest);
		return furthest;
	}
	
	// https://www.geeksforgeeks.org/pairs-involved-balanced-parentheses/
	public int pairsInvolvedInBalancedParentheses(String str, int start, int end) throws Exception{
		int pairs = 0;
		for(int i = start-1; i < end; i++) {
			String subStr = str.substring(i, i+1);
			System.out.print(subStr);
			if(subStr.equals("(")) {
				push(subStr);
			}else if(subStr.equals(")")) {
				if(!isEmpty()&& top().equals("(")) {
					pop();
					pairs++;
				}else {
					continue;
				}
			}
		}
		System.out.println(pairs);
		return pairs;
	}

	// Needs to work on below queries 
	// https://www.geeksforgeeks.org/balanced-expression-replacement/
	// https://www.geeksforgeeks.org/remove-invalid-parentheses/
	// https://www.geeksforgeeks.org/print-all-combinations-of-balanced-parentheses/
	
	// https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
	static String infixToPostfix(String exp) {
		return "";
	}
}