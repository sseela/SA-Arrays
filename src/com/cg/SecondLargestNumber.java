package com.cg;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] array = {-2, 9,9,9,22,22, 4, 22,80,80,87, 87};
		//int res = noRepeatedElements(array);
		int res = ifRepeatedElements(array);
		System.out.println(res);
	}

	private static int noRepeatedElements(int[] arr) {
		if(arr.length < 2) {
			System.out.println("no need to calculate");
		}
		Arrays.sort(arr);
		return arr[arr.length - 2];
	}
	
	private static int ifRepeatedElements(int[] arr) {
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] != largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		if(secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest");
		} else {
			System.out.println("second largest "+ secondLargest);
		}
		return secondLargest;
	}
}
