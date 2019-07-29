package com.prashant.datastructure.stack.main;

import com.prashant.datastructure.stack.DynamicArrayBasedStack;
import com.prashant.datastructure.stack.SimpleArrayBasedStack;

public class ArrayBasedStackMain {

	public static void main(String[] args) {
		// testDynamicArrayBasedStack();
		// testSimpleArrayBasedStack();
		// parenthesisChecker();
		// reverseStack();
		// maxBalancedPrefix();
		pairsInvolvedInBalancedParentheses();
	}

	static void maxBalancedPrefix() {
		SimpleArrayBasedStack stack = new SimpleArrayBasedStack(100);
		try {
			// stack.maxBalancedPrefix("[()]{}{[()()]()}(((");
			// stack.maxBalancedPrefix("((()())())((");
			stack.maxBalancedPrefix("()(())((()");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void pairsInvolvedInBalancedParentheses() {
		SimpleArrayBasedStack stack = new SimpleArrayBasedStack(100);
		try {
			 //System.out.println(stack.pairsInvolvedInBalancedParentheses("(()", 1, 3));
			// System.out.println(stack.pairsInvolvedInBalancedParentheses("((()())())((", 1, 12));
			// System.out.println(stack.pairsInvolvedInBalancedParentheses("()(())((()", 1, 10));
			 System.out.println(stack.pairsInvolvedInBalancedParentheses("((())(()", 1, 5));
			// stack.pairsInvolvedInBalancedParentheses("((())(()", 3, 8);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void parenthesisChecker() {
		SimpleArrayBasedStack stack = new SimpleArrayBasedStack(100);
		try {
			System.out.println(stack.parenthesisChecker("(()"));
			// System.out.println(stack.parenthesisChecker("[(])"));
			// System.out.println(stack.parenthesisChecker("[()]{}{[()()]()}"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void testSimpleArrayBasedStack() {
		SimpleArrayBasedStack stack = new SimpleArrayBasedStack(1);
		System.out.println("Is Stack Empty : " + stack.isEmpty());
		System.out.println("Is Stack Full : " + stack.isStackFull());
		System.out.println("Stack Size : " + stack.size());
		try {
			System.out.println(stack.pop());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(stack.top());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Before adding element in stack : " + stack.toString());
			stack.push(1);
			System.out.println("After adding 1st element in stack : " + stack.toString());
			stack.push(2);
			System.out.println("After adding 2nd element in stack :" + stack.toString());
			stack.push(3);
			System.out.println("After pushing 3 elements in stack : is Stack Full : " + stack.isStackFull());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(stack.toString());
		// When stack is full and try to push the data.
		System.out.println("****** When stack is full and try to push the data. ******");
		try {
			stack.push(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(stack.top());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Try to delete all the element from the stack
		System.out.println("****** Try to delete all the element from the stack ******");
		try {
			System.out.println("Before deleting any element, size of the stack : " + stack.size());
			System.out.println(stack.pop());
			System.out.println("After deleting 1st element, size of the stack : " + stack.size());
			System.out.println(stack.pop());
			System.out.println("After deleting 2nd element, size of the stack : " + stack.size());
			System.out.println(stack.pop());
			System.out.println("After deleting all elements, size of the stack : " + stack.size());
			System.out.println(stack.pop());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void testDynamicArrayBasedStack() {
		DynamicArrayBasedStack stack = new DynamicArrayBasedStack(1);
		System.out.println("Is Stack Empty : " + stack.isEmpty());
		System.out.println("Stack Size : " + stack.size());
		try {
			System.out.println(stack.pop());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(stack.top());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Before adding element in stack : " + stack.toString());
			stack.push(1);
			System.out.println("After adding 1st element in stack : " + stack.toString());
			stack.push(2);
			System.out.println("After adding 2nd element in stack :" + stack.toString());
			stack.push(3);
			System.out.println("After adding 3rd element in stack :" + stack.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(stack.toString());
		// When stack is full and try to push the data.
		System.out.println("****** When stack is full and try to push the data. ******");
		try {
			stack.push(4);
			stack.push(5);
			System.out.println("After adding 5 element in stack : " + stack.toString());
			stack.push(6);
			System.out.println("After adding 6th element in stack :" + stack.toString());
			stack.push(7);
			System.out.println("After adding 7th element in stack :" + stack.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(stack.top());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Try to delete all the element from the stack
		System.out.println("****** Try to delete all the element from the stack ******");
		try {
			System.out.println("Before deleting any element, size of the stack : " + stack.size());
			System.out.println(stack.pop());
			System.out.println("After deleting 1st element, size of the stack : " + stack.size());
			System.out.println(stack.pop());
			System.out.println("After deleting 2nd element, size of the stack : " + stack.size());
			System.out.println(stack.pop());
			System.out.println("After deleting all elements, size of the stack : " + stack.size());
			System.out.println(stack.pop());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void reverseStack() {
		SimpleArrayBasedStack sabStack = new SimpleArrayBasedStack(4);
		try {
			sabStack.push(1);
			sabStack.push(2);
			sabStack.push(3);
			sabStack.push(4);
			System.out.println(sabStack.toString());
			Object[] s = sabStack.reverseStack(sabStack.get(), 0);
			System.out.println(sabStack.get());
			sabStack.reverseStackFor(s, 0);
			System.out.println(sabStack.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}