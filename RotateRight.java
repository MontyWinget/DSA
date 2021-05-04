package com.arrays.java;

import java.util.ArrayList;
import java.util.List;

public class RotateRight {
	
public static void main(String args[]) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		
		int result[] = (rotateRight(3, arr));
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}	
	}
	static int[] rotateRight(int k, int nums[]) {
		
		int n = nums.length;
		int newArr[] = new int[nums.length];	
		int rotatingPoint = n - k;
		int currentPosition = 0;
		
		
		
		for(int i = rotatingPoint; i < n; i++) {
			newArr[currentPosition] = nums[i];
			currentPosition++;
		}
		
		for(int i = 0; i < rotatingPoint; i++) {
			newArr[currentPosition] = nums[i];
			currentPosition++;
		}		
		
//		int n = 0;	
//		while(rotatingPoint < nums.length) {
//			newArr[n] = nums[rotatingPoint];
//			n++;
//			rotatingPoint++;
//		}
//		
//		rotatingPoint = 0;
//		while(rotatingPoint < k) {
//			newArr[n] = nums[rotatingPoint];
//			n++;
//			rotatingPoint++;
//		}
		
		return newArr;
	}

}
