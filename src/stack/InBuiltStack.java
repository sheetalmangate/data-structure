package stack;

import java.util.Stack;

/**
 * Demonstration of Java's built-in Stack class.
 *
 * This program shows how to perform basic stack operations using
 * java.util.Stack
 *
 * 1. Push  – inserting elements into the stack
 * 2. Pop   – removing elements from the top of the stack
 * 3. Peek  – viewing the top element without removing it
 * 4. isEmpty – checking whether the stack is empty
 * 5. size – checking the current number of elements
 *
 * The purpose of this code is to understand how the built-in Stack
 * data structure works and how LIFO (Last-In-First-Out)
 * operations behave through simple examples.
 *
 * This file is part of the 'data-structure' repository that 
 * demonstrates fundamental data structures implemented or 
 * illustrated in Java.
 */

public class InBuiltStack {
	
	public static void main(String[] args) {
		
		// Create a stack of integers
		Stack<Integer> stack = new Stack<>();
		
		// push elements into the stack
		System.out.println("Adding elements in Stack : 24, 18, 3, 5, 9");
		stack.push(24);
		stack.push(18);
		stack.push(3);
		stack.push(5);
		stack.push(9);
		
		// print the stack
		System.out.println(" Current Stack "+ stack);
		
		// pop all elements from the stack
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		// Check if stack is empty
		System.out.println("Is stack empty? "+ stack.isEmpty());
		
		// Push new elements to the stack
		System.out.println("Push new elements again in stack: 60, 50");
		stack.push(60);
		stack.push(50);
		
		// Peek the top element
		System.out.println("Top element of stack is " + stack.peek());
		
		// Final check
		System.out.println("Is stack empty? " + stack.isEmpty());
		System.out.println("Current stack size: " + stack.size());
		
		
	}
}