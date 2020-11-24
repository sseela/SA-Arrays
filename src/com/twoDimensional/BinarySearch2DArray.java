package com.twoDimensional;

public class BinarySearch2DArray {
	public static void main(String[] args) {
		int[][] mat = {{1, 2, 4}, {6, 7, 8}, {9, 10, 12}};
		int target = 1;

		boolean bool = searchRecursively(mat, target);
		if(bool) {
			System.out.println("element found");
		} else {
			System.out.println("element not found");
		}
		
	}

	private static boolean searchRecursively(int[][] mat, int target) {
		int rows = mat.length;
		int columns = mat[0].length;
		
		int left = 0;
		int right = rows*columns-1;
		
		while(left <= right) {
			int midpoint = left + (right-left)/2;
			int midpoint_element = mat[midpoint/columns][midpoint%columns];
			if(midpoint_element == target) {
				return true;
			} else if(target > midpoint_element) {
				left = midpoint+1;
			} else if(target < midpoint_element) {
				right = midpoint-1;
			}
		}
		return false;
	}
}
