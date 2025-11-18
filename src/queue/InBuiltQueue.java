package queue;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Demonstration of Java's built-in Queue interface using LinkedList.
 *
 * This program shows how to work with a Queue in Java and perform
 * common FIFO (First-In-First-Out) operations including:
 *
 * 1. add()   – inserting elements into the queue (enqueue)
 * 2. remove() – removing elements from the front (dequeue)
 * 3. peek()  – retrieving the front element without removing it
 * 4. isEmpty() – checking whether the queue is empty
 * 5. size() – retrieving the number of elements currently in the queue
 *
 * The purpose of this class is to demonstrate how Java's LinkedList
 * implements the Queue interface and how typical queue operations
 * behave in FIFO order through simple, readable examples.
 *
 * This file is part of the 'data-structure' repository that demonstrate the 
 * fundamental data structures implemented in Java.
 */


public class InBuiltQueue {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		System.out.println("Adding elements in queue : 3, 9, 10, 8, 6");
		queue.add(3);
		queue.add(9);
		queue.add(10);
		queue.add(8);
		queue.add(6);
		
		// print the queue
		System.out.println(" Current Queue "+ queue);
		
		// Remove elements from queue
		while(!queue.isEmpty()) {
			System.out.println("Dequeed "+ queue.remove());
		}
		
		// Check if queue empty
		System.out.println("Is queue empty? "+queue.isEmpty());
		
		// Add new elements again
		System.out.println("Adding new elements again 23, 33");
		queue.add(23);
		queue.add(33);
		
		// peek the front element
		System.out.println("Front element (peek) "+queue.peek());
		
		// Final state of queue
		System.out.println("Current Queue "+queue);
		System.out.println("Queue Size "+queue.size());
	}
}