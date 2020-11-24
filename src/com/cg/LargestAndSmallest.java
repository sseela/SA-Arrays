package com.cg;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int[] array = {10, 2, 1, 10, 1, 3, 5};
		largestAndSmallest(array);
	}
	LargestAndSmallest() {
		
	}
	public void LargestAndSmallest() {
		
	}

	private static void largestAndSmallest(int[] array) {
		int largest = array[0];
		int smallest = array[0];
		for(int i=0; i<array.length; i++) {
			if(largest < array[i]) {
				largest = array[i];
			} else if(smallest > array[i]) {
				smallest = array[i];
			}
		}
		System.out.println("Largest: "+largest+" Smallest: "+smallest);
		
	}
}
