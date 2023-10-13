package com.collectionPractice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCodeOrLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
//		offer for the adding element from the rear
		System.out.println(queue.offer(10));
		queue.offer(40);
		queue.offer(50);
		
		System.out.println(queue);
		
//		check element in rear for removing or return head element and return null if no element in queue
		System.out.println(queue.poll());
		System.out.println(queue);
		
//		which element is removing next or head element  and return null if no element in queue
		System.out.println(queue.peek());
		System.out.println(queue);
		
//		Insert specific element into the queue from front and return true If no element added throws exception
		System.out.println(queue.add(30));
		System.out.println(queue);
		
//		Remove any element from the queue and If is queue empty it throws exception
		System.out.println(queue.remove(50));
		System.out.println(queue);
		
//		return the head of the queue and If is queue empty it throws exception
		System.out.println(queue.element());
		System.out.println(queue);
		
		
	}

}
