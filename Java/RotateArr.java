package com.arrays.java;

public class RotateArr {

	
	public static void main(String args[]) {
		
		int arr[] = {1, 2, 3, 4, 5};
		
		int result[] = (rotateLeft(1, arr));
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}
		
	}
	
	static int[] rotateLeft(int i, int arr[]) {
		
		int newArr[] = new int[arr.length];
		
		int rotatingPoint = i;
		
		int n = 0;
		while(rotatingPoint < arr.length) {
			newArr[n] = arr[rotatingPoint];
			n++;
			rotatingPoint++;
		}
		
		rotatingPoint = 0;
		while(rotatingPoint < i) {
			newArr[n] = arr[rotatingPoint];
			n++;
			rotatingPoint++;
		}
		
		return newArr;
	}
	
	
}
