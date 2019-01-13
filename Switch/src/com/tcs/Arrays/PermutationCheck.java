package com.tcs.Arrays;

public class PermutationCheck {

	public static void main(String[] args) {

		PermutationCheck pmc = new PermutationCheck();
		System.out.println(pmc.isPermutation("abc", "bcA"));
	}
	
	public boolean isPermutation(String str1, String str2){
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length()) return false;
		
		else{
			int[] arr = new int[128];
			char[] chArr = str1.toCharArray();
			for(char c : chArr){
				arr[c]++;
			}
			
			char[] chArr1 = str2.toCharArray();
			for(char c : chArr1){
				arr[c]--;
				if(arr[c]<0){
					return false;
				}
			}
			return true;
		}
	}

}
