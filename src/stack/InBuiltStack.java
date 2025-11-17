package stack;

import java.util.Stack;

public class InBuiltStack {
	
	public static void main(String[] args) {
		
		// Create a stack of integers
		Stack<Integer> stack = new Stack<>();
		
		// push elements into the stack
		stack.push(24);
		stack.push(18);
		stack.push(3);
		stack.push(5);
		stack.push(9);
		
		// pop all elements from the stack
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		// Check if stack is empty
		System.out.println("Is stack empty? "+ stack.isEmpty());
		
		// Push new elements to the stack
		stack.push(60);
		stack.push(50);
		
		// Peek the top element
		System.out.println("Top element of stack is " + stack.peek());
		
		// Final check
		System.out.println("Is stack empty? " + stack.isEmpty());
		System.out.println("Current stack size: " + stack.size());
		
		
	}
}