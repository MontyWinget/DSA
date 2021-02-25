package com.arrays.java;

public class Hourglass {
	
	public static void main(String args[]) {
		
		int[][] arr = {
			
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}
		};
		
		System.out.println(hourglassSum(arr));
		
	}
	
	static int hourglassSum(int[][] arr) {
int maxSum = Integer.MIN_VALUE;
		
		for(int row = 0; row < 4; row++) {
			for(int col = 0; col < 4; col++) {
				int max = 0;
				max = arr[row][col] + arr[row][col+1] + arr[row][col+2]
									+ arr[row+1][col+1] +
					  arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
				
				if(max > maxSum) {
					maxSum = max;
				}
			}
		}
		
        return maxSum;

	}
}
