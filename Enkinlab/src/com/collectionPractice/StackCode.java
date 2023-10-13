package com.collectionPractice;

import java.util.Iterator;
import java.util.Stack;

public class StackCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(30);
		stack.push(50);

		System.out.println(stack);

		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());

//	Using foe each loop
		for (Integer num : stack) {
			System.out.println(num);
		}
//	Using Iterator interface 
		Iterator<Integer> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
