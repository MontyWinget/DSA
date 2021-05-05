package com.arrays.java;

public class MinimumSwapsTwo {
	
	public static void main(String args[]) {
		
		int[] a = {2, 3, 4, 1, 5};
		int[] b = {1, 3, 5, 2, 4, 6, 7};
		
		System.out.println(minimumSwaps(b));
		
	}
	
	static int minimumSwaps(int[] arr) {
		int minSwaps = 0;
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			
			while(arr[i] != i+1) {
				int temp = arr[i];
				arr[i] = arr[temp-1];
				arr[temp-1] = temp;
				minSwaps++;
			}
		}
		
		
		
		
		return minSwaps;
	}

}
