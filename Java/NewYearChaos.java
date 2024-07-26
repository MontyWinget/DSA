package com.arrays.java;

public class NewYearChaos {
	
	public static void main(String args[]) {
		
		int[] a = {2, 1, 5, 3, 4};
		int[] b = {2, 5, 1, 3, 4};
		
		minimumBribes(a);
		
		
	}
	
	static void minimumBribes(int[] q) {
		
		int bribes = 0;
		int position = q.length-1;
		for(int i = position; i >= 0; --i) {
			if(q[i] != i+1) {
				if((i-1) >=0 && q[i-1] == (i+1)) {
					q[i-1] = q[i];
					q[i] = i+1;
					bribes += 1;
				}else if((i-2) >=0 && q[i-2] == (i+1)) {
					q[i-2] = q[i-1];
					q[i-1] = q[i];
					q[i] = i+1;
					bribes += 2;
				}else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(bribes);
		
	}

}
