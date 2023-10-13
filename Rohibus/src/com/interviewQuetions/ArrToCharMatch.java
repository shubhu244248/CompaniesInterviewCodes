package com.interviewQuetions;

public class ArrToCharMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 20, 31, 45, 68, 28, 83, 90, 45, 62, 33, 26};
		char ch [] = { 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h',
				'g', 'f', 'e', 'd', 'c', 'b', 'a' };
		for(int i=0; i<arr.length;i++) {
			if(arr[i] <= 26) {
				System.out.println(arr[i] +"="+ch[arr[i]-1]);
			}else {
				System.out.println(arr[i]+"="+ch[arr[i]%26-1]);
			}
		}
		
		System.out.println("");
		int n = arr.length;
		char ans;
		for (int i = 0; i < n; i++) {
			int rem = arr[i] % 26;
			if (rem == 0) {
				ans = 'a';
				System.out.println(arr[i]+"="+ans);
			} else {
				ans = (char) ('a' + 26 - rem);
				System.out.println(arr[i] + "=" + ans);
			}
		}
		
	}
}
