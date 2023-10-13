package com.collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class MapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Shubham");
		map.put(2,"Patil");
		map.put(3, "Akshay");


//		map.put(4, "Vani");
		// Override 
		
		System.out.println(map);
		
//		Solution over the overriding for only the value 
		
		System.out.println(map);
		
//		interation in map using Map Entry
		
		for(Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
//		interation using key set
		for(Integer value: map.keySet()) {
			System.out.println(value);
		}
		
		
//		interation using values
		for(String value: map.values()) {
			System.out.println(value);
		}
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Shubham"));
		
	}

}
