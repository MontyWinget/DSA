package com.arrays.java;

public class InsertPosition {

	public static void main(String[] args) {
		
		int[] nums = {1,3,4,5};
		int t = 2;
		System.out.println(searchInsert(nums, t));
		

	}
	
	public static int searchInsert(int[] nums, int target) {
		
		//Step 1: Check is target is already Present
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                //Returning index of target
                return i;
            }
        }
        
        //Step 2: Find x such that :- nums[x-1]<target<nums[x]
        for(int x=1;x<nums.length;x++) {
            if(nums[x-1]<target&&target<nums[x]) {
                return x;
            }
        }
        
        //Step 3: If the target is outside the bounds of array
        if(nums[nums.length-1]<target) {
            //Target is greater than the biggest number in array
            return nums.length;
            
        } else {
            //Target is smaller than the smallest number in array
            return 0;
        }
	}

}
