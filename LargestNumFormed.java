package com.arrays.java;
public class LargestNumFormed {
	
	public static void main(String args[]) {
		
		int[] a1 = {3, 30, 34, 9};
		int[] a2 = {1, 34, 3, 98, 9, 76, 45, 4};
		int[] a3 = {54, 546, 548, 60};
		
		LarNumFormed(a1);
		for(int i : a1) {	
			System.out.print(i + " ");
		}
		System.out.println();
		LarNumFormed(a2);
		for(int i : a2) {	
			System.out.print(i + " ");
		}
		System.out.println();
		LarNumFormed(a3);
		for(int i : a3) {	
			System.out.print(i + " ");
		}
	}
	public static void LarNumFormed(int[] a) {
		String v1;
		String v2;
		for(int j = 0; j < a.length; j++) {
			for(int i = 0; i < a.length - 1; i++) {
				v1 = Integer.toString(a[i]);
				v2 = Integer.toString(a[i+1]);
				String s1 =(new StringBuilder()).append(v1).append(v2).toString();
				String s2 =(new StringBuilder()).append(v2).append(v1).toString();
				int x1 = Integer.parseInt(s1);
				int x2 = Integer.parseInt(s2);;
				if(x1 < x2) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}		
			}
		}	
	}
}
