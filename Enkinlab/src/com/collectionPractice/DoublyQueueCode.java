package com.collectionPractice;

import java.util.ArrayDeque;

public class DoublyQueueCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> dqueue = new ArrayDeque<>();
		
		dqueue.offer(30); // Add element in end of the queue
		
		dqueue.offerFirst(20); // Add element in starting of queue
		
		dqueue.offerLast(50); //  Add element in end of queue
		
		System.out.println(dqueue);
		
//		it also having peek and poll for the fist and last 
		System.out.println(dqueue.peek());
		System.out.println(dqueue);
		System.out.println(dqueue.peekFirst());
		System.out.println(dqueue);
		System.out.println(dqueue.peekLast());
		System.out.println(dqueue);
		
		System.out.println(dqueue.poll());
		System.out.println(dqueue);
		System.out.println(dqueue.pollFirst());
		System.out.println(dqueue);
		System.out.println(dqueue.pollLast());
		System.out.println(dqueue);
		
		
		dqueue.offer(30); // Add element in end of the queue
		dqueue.offerFirst(20); // Add element in starting of queue
		dqueue.offerLast(50); //  Add element in end of queue
		System.out.println(dqueue);
		
	}

}
