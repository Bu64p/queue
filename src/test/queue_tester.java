package test;

import queue.queue;

public class queue_tester {

	public static void main(String[] args) throws Exception {
		// FIFO: first in , first out
		queue myQueue = new queue();
		myQueue.enqueue("A");
		myQueue.enqueue("B");
		myQueue.enqueue("C");
		myQueue.enqueue("D");
		/*
		 * order of enter:
		 * 1. A
		 * 2. B
		 * 3. C
		 * 4. D
		 */
		System.out.println(myQueue.enqueue());
		System.out.println(myQueue.enqueue());
		System.out.println(myQueue.enqueue());
		System.out.println(myQueue.enqueue());
		/*
		 * order of enqueue:
		 * 1.A
		 * 2.B
		 * 3.C
		 * 4.D
		 */	
		
	}

}
