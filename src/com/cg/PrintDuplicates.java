package com.cg;

import java.util.Arrays;

public class PrintDuplicates {
	public static void main(String[] args) {
		int[] array = {1, 2, 2, 2, 3, 3, 3, 4, 5};
		int[] res = printDuplicates(array);
		System.out.println(Arrays.toString(res));
	}

	private static int[] printDuplicates(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] == array[j]) {
					System.out.println("duplicate: "+array[j]);
				}
			}
		}
		return null;
	}
}
