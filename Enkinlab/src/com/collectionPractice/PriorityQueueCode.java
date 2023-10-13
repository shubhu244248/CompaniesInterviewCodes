package com.collectionPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Comparator.reverseOrder()  it gives the order in reverse or MAX HEAP
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		pqueue.offer(40);
		pqueue.offer(20);
		pqueue.offer(50);
		pqueue.offer(10);
		pqueue.offer(30);
		
		System.out.println(pqueue);
		
//		remove the element which has priority
		pqueue.poll();
		System.out.println(pqueue);
		
//		see which is next element is removing 
		pqueue.peek();
		System.out.println(pqueue);
		
		
	}

}
