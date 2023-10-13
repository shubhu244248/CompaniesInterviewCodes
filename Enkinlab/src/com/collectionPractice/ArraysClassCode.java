package com.collectionPractice;

import java.util.*;

public class ArraysClassCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []arr = {100,4,6,3,8,9,1,2,3,4,5,6,7,99};
		Arrays.sort(arr); // Sort in ascending order 
//		Arrays.fill(arr,60); // Add element 
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
//		Descending order
		Arrays.sort(arr, Comparator.reverseOrder());
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
