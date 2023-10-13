package com.interviewQuetions;

public class Dscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,3,9,1,8};
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        
        for(int i=0; i<arr.length-1;i++) {
        	System.out.println(arr[i]);
        }
	}

}
