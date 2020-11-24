package com.twoDimensional;

public class Array2DSearchWord {

	public static void main(String[] args) {
		String target = "kiran";
		String[][] arr = {{"sandeep", "rupesh"},{"sasi", "kiran"}};

		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				if(arr[i][j].equals(target)) {
					System.out.println(i+" "+j);
				}
			}
		}
	}
}
