package stack;

/**
* A Simple custom implementation of a Stack using an integer array
*
* 1. push()  – inserting elements into the stack
* 2. pop()   – removing elements from the top of the stack
* 3. peek()  – viewing the top element without removing it
* 4. isEmpty() – checking whether the stack is empty
* 5. size() – checking the current number of elements
*
* This stack grows in a fixed array and does not resize dynamically
*
*
*/
public class MyStack{
	
	// Internal array to store stack element
	private int[] data;
	
	// Pointer to the current top element
	private int current = -1;
	
	// default stack size
	private static final int DEFAULT_SIZE = 10;
	
	public MyStack(){
		this.data = new int[DEFAULT_SIZE];
	}
	
	public MyStack(int size){
		this.data = new int[size];
	}
	
	// push element into stack
	public boolean push(int n) { 
		if(isFull()) return false;
		
		current++;
		this.data[current] = n;
		
		return true;
	}
	
	// remove the top element from stack
	public int pop() throws StackException{
		if(isEmpty()) {
			throw new StackException("Can not pop from empty stack!!");
		}
		
		return data[current--];
	}
	
	//returns the top element of stack
	public int peek() throws StackException{
		if(isEmpty()) {
			throw new StackException("Can not peek from empty stack!!");
		}
		return data[current];
	}
	// check whether the satck is empty 
	public boolean isEmpty() {
		return (current == -1) ? true : false;
	}
	
	public int size(){
		return data.length;
	}
	
	public boolean isFull(){
		return (current == data.length - 1) ? true : false;
	}
	
	@Override
	public String toString() {
		
		if(isEmpty()) {
			return "[]";
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for(int i = 0; i<= current; i++ ) {
			sb.append(data[i]+" ,");
		}
		sb.append("] ");
		
		return sb.toString();
	}
	
}