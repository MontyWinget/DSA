package com.arrays.java;


// hackerRank Arrays DS - Reverse an Array
public class RevArr {

	public static void main(String args[]) {
		
		int arr[] = {12,23,31,42,57};			// Array literal
	
		int newArr[] = reverseArray(arr);
		
		for(int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		
	}
	
	// Function to reverse an Array
    static int[] reverseArray(int[] a) {
        
    	int j = a.length - 1;
    	
        int rev[] = new int[a.length];
    	
            for(int i = 0; i < a.length; i++){
   
                	rev[j] = a[i];
                	j--;
            }
            
            return rev;
    }	
}
