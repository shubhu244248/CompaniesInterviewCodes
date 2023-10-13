package com.interviewQuetions;

public class LargestNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {10,5,5,6,9,12};
		int temp =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > temp) {
				temp = arr[i];
			} 
		}
		System.out.println(temp);
	

	}

}
