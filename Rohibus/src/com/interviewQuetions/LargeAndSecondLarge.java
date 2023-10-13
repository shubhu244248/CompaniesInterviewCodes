package com.interviewQuetions;

public class LargeAndSecondLarge {
	public static void main(String[] args) {
		int[] arr = { 20, 31, 45, 68, 28 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}

		System.out.println("Largest element: " + largest);
		System.out.println("Second largest element: " + secondLargest);
	}
}
