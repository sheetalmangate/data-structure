package stack;

/**
* This class acts as a runner or driver program for the custom stack
*
* It performs the following operations:
* 1. Pushes a set of element into the stack
* 2. Prints the entire stack using toString()
* 3. Pops all elements one by one until the stack becomes empty
* 4. Checks stack empty state
* 5. Pushes new elements again to show reusability
* 6. Retrieves the top element using peek()
* 7. Prints final stack status (empty check + size)
*
*
*/
public class MyStackRunner {
	
	public static void main(String[] args) throws StackException{
		MyStack stack = new MyStack();
		
		// push elements into the stack
		System.out.println("Adding elements in Stack : 24, 18, 3, 5, 9");
		stack.push(24);
		stack.push(18);
		stack.push(3);
		stack.push(5);
		stack.push(9);
		
		// print the stack
		System.out.println("Current Stack "+ stack);
		
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