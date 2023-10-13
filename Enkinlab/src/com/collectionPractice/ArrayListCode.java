package com.collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <Integer> al = new ArrayList<Integer>();
		
//		Collections.sort(al);
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(100);
		
		System.out.println(al.size());
		
//		Get all elements from the ArrayList or Iterate the ArrayList
		for(int i =0; i<= al.size()-1; i++) {
			System.out.println(al.get(i));
		}
//		Using foe each loop
		for(Integer num :al) {
			System.out.println(num);
		}
//		Using Iterator interface 
		Iterator< Integer> itr =al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

//		Add element in array list using user input
		for(int i =0; i<=2;i++) {
			al.add(sc.nextInt());
		}
		
		System.out.println(al);
		
//		Remove and Add element in particular location 
		for(int i =0; i<= al.size()-1;i++) {
			if(al.get(i) ==100) {
				al.remove(i);
				al.add(i, 20);
				al.remove(Integer.valueOf(i));
				al.add(Integer.valueOf(40));
			}
		}
		
		System.out.println(al);
		
		ArrayList<Integer> sort = new ArrayList<Integer>();
//		Sort ArrayList 
		Collections.sort(al);
		System.out.println(al);
		for(Integer num : al) {
			System.out.println(num);
		}
//		Sorting another method
		
//		Set element in particular index
		al.set(4, 100);
		System.out.println(al);
		
//		Element present in list 
		System.out.println(al.contains(30));
		
//		Clear list 
		al.clear();
		System.out.println(al);
		
	}

}
