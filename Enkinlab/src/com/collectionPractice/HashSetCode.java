package com.collectionPractice;

import java.util.HashSet;
import java.util.Set;

public class HashSetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		We can order set using the LinkedHashSet
		
		Set<Integer> hashSet = new HashSet<>();
		
		hashSet.add(20);
		hashSet.add(60);
		hashSet.add(10);
		hashSet.add(5);
		
		System.out.println(hashSet);
		
		hashSet.add(5);
		System.out.println(hashSet);
		
//		hashSet.notify();
		hashSet.contains(40);
		hashSet.isEmpty();
		hashSet.iterator();
		
		
	}

}
