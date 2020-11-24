package com.twoDimensional;

public class Array2 {
	
	public static void main(String[] args) {
		int x = 3;
		int[][] arr = {{1, 2},{3, 4}};

		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				if(arr[i][j] == x) {
					System.out.println(i+" "+j);
				}
			}
		}
	}
	
}
