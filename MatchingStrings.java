package com.arrays.java;

public class MatchingStrings {

	public static void main(String[] args) {
		
		String[] string = {"aba", "baba", "aba", "xzxb"};
		String[] queries = {"aba", "xzxb", "ab"};
		
		int[] ans = matchingStrings(string,queries);
		
		for(	int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	static int[] matchingStrings(String[] strings, String[] queries) {
		
		int[] result =  new int[queries.length];
		
		for(int i = 0; i < queries.length; i++) {
			result[i] = 0;
			for(int j = 0; j < strings.length; j++) {
				
				if(strings[j] == queries[i]) {
					result[i]++;
				}
			}
		}
		return result;
	}

}
