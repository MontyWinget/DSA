package com.arrays.java;

import java.util.ArrayList;
import java.util.List;

public class SpiralArr {

	public static void main(String[] args) {
		
		ArrayList<Integer> firstlist = new ArrayList<Integer>();
		firstlist.add(1);
		firstlist.add(2);
		firstlist.add(3);
		
		ArrayList<Integer> secondlist = new ArrayList<Integer>();
		secondlist.add(4);
		secondlist.add(5);
		secondlist.add(6);
		
		ArrayList<Integer> thirdlist = new ArrayList<Integer>();
		thirdlist.add(7);
		thirdlist.add(8);
		thirdlist.add(9);
		
		ArrayList<Integer> fourthlist = new ArrayList<Integer>();
		fourthlist.add(10);
		fourthlist.add(11);
		fourthlist.add(12);
		
		List<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(firstlist);
		arr.add(secondlist);
		arr.add(thirdlist);
		arr.add(fourthlist);
		
		//1  2  3
		//4  5  6
		//7  8  9
		//10 11 12
		
		System.out.println(arr);
		System.out.println("Spiral Order : " + spiralOrder(arr));
		
	}

	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        
		ArrayList<Integer> spiral = new ArrayList<Integer>();
		int top = 0;
		int bottom = A.size() - 1;
		int right = A.get(0).size() - 1;
		int left = 0;
		int i;
		int dir = 0; // 0 -> right, 1 -> down, 2 -> left, 3 -> up traverse
		
		while(top <= bottom && left <= right){
			if(dir == 0) {
				for(i = left; i <= right; i++) {
					spiral.add(A.get(top).get(i));
				}
				top++;
			}
			else if(dir == 1) {
				for(i = top; i <= bottom; i++) {
					spiral.add(A.get(i).get(right));
				}
				right--;
			}
			else if(dir == 2) {
				for(i = right; i >= left; i--) {
					spiral.add(A.get(bottom).get(i));
				}
				bottom--;
			}
			else if(dir == 3) {
				for(i = bottom; i >= top; i--) {
					spiral.add(A.get(i).get(left));
				}
				left++;
			}
			
			dir = (dir + 1) % 4;
		}
		
        return spiral;
    }
}
