package com.prashant.datastructure.queue;

import java.util.Stack;

public class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            while (!stackNewestOnTop.isEmpty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            stackOldestOnTop.push(value);

            while (!stackOldestOnTop.isEmpty())
                stackNewestOnTop.push(stackOldestOnTop.pop());
        }

        public T peek() {
             if (stackNewestOnTop.isEmpty())
                return null;
            return stackNewestOnTop.peek();
        }

        public T dequeue() {
            if (stackNewestOnTop.isEmpty())
                return null;
            return stackNewestOnTop.pop();
        }
    }