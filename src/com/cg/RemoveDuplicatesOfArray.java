package com.cg;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesOfArray {
	public static void main(String[] args) {
		int[] array = {1, 2, 2, 3, 4, 4, 6, 6, 6, 6, 4, 8, 9, 9, 9, 9};
		
		/*UsingSetToRemoveDup set = new UsingSetToRemoveDup();
		Object[] objArray = set.m1(array);
		System.out.println(Arrays.toString(objArray));*/
		
		WithoutUsingCollection without = new WithoutUsingCollection();
		int j = without.m2(array);
		for (int i=0; i<j; i++) 
	           System.out.print(array[i]+" "); 
		
		/*ArraysAreMutable mutable = new ArraysAreMutable();
		mutable.m3(array);
		System.out.println(Arrays.toString(array));*/
		
	}
}

class UsingSetToRemoveDup {
	public Object[] m1(int[] arr) {
		Set<Integer> set= Arrays.stream(arr).boxed().collect(Collectors.toSet());
		return set.toArray();
	}
}

class WithoutUsingCollection {
	public int m2(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int[] temp = new int[n];
		int j=0;
		for(int i=0; i<n-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		
		for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
		
		return j;
	}
}


class ArraysAreMutable {
	public void m3(int[] arr) {
		for(int i=0; i<5; i++) {
			arr[i] = 0;
		}
	}
}