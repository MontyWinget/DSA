package com.arrays.java;

public class TwoSum {

	public static void main(String[] args) {
		
		int arr[] = {2, 5, 5, 11};
		
		int result[] = twoSum(arr, 10);

		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 1; j < nums.length; j++) {
				if(i != j) {
					if(nums[i] == target - nums[j]) {
						return new int[] {i,j};
					}
				}
			}
		 }
		throw new IllegalArgumentException("No two sum solution");
	}
	
}
