package com.arrays.java;

public class Running {
	
	public static void main(String args[]) {
		
		int nums[] = {1, 1, 1, 1, 1};
		
		int result[] = runningSum(nums);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}
	}
	
	public static int[] runningSum(int[] nums) {
		
		for(int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i-1];
		}
		
		return nums;
	}
}
