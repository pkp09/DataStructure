package com.prashant.datastructure.stack;

public class DynamicArrayBasedStack {
	protected Object[] stack;
	// Index of the top element in the stack.
	protected int top = -1;

	public DynamicArrayBasedStack(int capacity) {
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
	public void push(Object item) {
		if (size() == stack.length)
			expand();
		stack[++top] = item;
	}

	/**
	 * To remove a item from top of stack
	 * 
	 * @return
	 */
	public Object pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is already Empty");
		Object result = stack[top];
		stack[top--] = null;
		return result;
	}

	/**
	 * To look up top item in stack without removing it from stack
	 * 
	 * @return
	 */
	public Object top() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is Empty");
		return stack[top];
	}

	private void expand() {
		int length = size();
		// https://stackoverflow.com/questions/141525/what-are-bitwise-shift-bit-shift-operators-and-how-do-they-work
		System.out.print("length<<1 : ");
		System.out.println(length<<1);
		System.out.print("length<<2 : ");
		System.out.println(length<<2);
		System.out.print("length<<3 : ");
		System.out.println(length<<3);
		System.out.print("length<<4 : ");
		System.out.println(length<<4);
		System.out.print("length<<5 : ");
		System.out.println(length<<5);
		System.out.print("length<<6 : ");
		System.out.println(length<<6);
		System.out.print("length<<7 : ");
		System.out.println(length<<7);
		System.out.print("length<<8 : ");
		System.out.println(length<<8);
		System.out.print("length<<9 : ");
		System.out.println(length<<9);
		Object [] newStack = new Object[length<<1];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}

	/*private void shrink() {

	}*/

	public String toString() {
		String s = "[";
		for (int i = 0; i <= top; i++) {
			s = s + stack[i] + ",";
		}
		s = s + "]";
		return s;
	}
}