package com.arrays.java;

public class Arrays {
	
	public static void main(String args[]) {
		
		int arr[] = new int[5];

		
		arr[0] = 12;
		arr[1] = 32;
		arr[2] = 14;
		arr[3] = 11;
		arr[4] = 17;
		
		for(int i = 0; i < 5; i++)
		{
		System.out.println(arr.length);
		}
		
		// 2D Array
		
		int d[][] = {
				
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		// Jagged arrays : Where no. columns are not same
		
		System.out.println();
		for(int i = 0; i < 3; i++) {				// Rows
			for(int j = 0; j < 4; j++) {			// Columns
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
		
	}

}
