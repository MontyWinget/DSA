package com.arrays.java;

public class DuplicatesII {
	
	public static void main(String args[]) {
		
		int a[] = {1,2,3,1};
		
		System.out.println(containsNearbyDuplicate(a,3));
		
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean ans = false;
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length-1; j++) {
				if(nums[i] == nums[j] && (i-j) <= k) {
					ans = true;
				}
			}
		}
		
		return ans;
	}

}
