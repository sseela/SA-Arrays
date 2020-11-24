package com.cg;

public class LargestAndSmallest1 {
	public static void main(String[] args) {
		int[] array = {10, 2, 90, 1, 3, 5};
		method(array);
	}

	private static void method(int[] array) {
		if(array.length < 2) {
			return;
		} else {
			int largest = array[0];
			int smallest = array[0];
			int indexOfLargest = 0;
			int indexOfSmallest = 0;
			for(int i=0; i<array.length; i++) {
				if(array[i] > largest) {
					largest = array[i];
					indexOfLargest = i;
				} else if(array[i] < smallest) {
					smallest = array[i];
					indexOfSmallest = i;
				}
			}
			System.out.println(largest+" at index "+indexOfLargest+" "+smallest+" at index "+indexOfSmallest);
		}
		
	}
}
