package com.cg;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 6};
		int [] res = new int[arr.length];
		int j = arr.length-1;

		for(int i=0; i<res.length; i++) {
			res[j--] = arr[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
