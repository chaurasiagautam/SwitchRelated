package com.tcs.Arrays;

public class UniqueElement {

	public boolean isUnique(String str){
		
		char[] chrArr = str.toCharArray();
		int len = chrArr.length;
		boolean flag = true;
		
		for(int i=0;i<len-1;i++){
			for(int j = i+1;j<len;j++){
				if(chrArr[i] == chrArr[j]){
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args){
		
		UniqueElement un = new UniqueElement();
		System.out.println(un.enhancedCode("aA"));
		int val = 'a';
		int val1 = 'z';
//		System.out.println(val+" "+val1);
	}

	public boolean enhancedCode(String str){
		
		str = str.toLowerCase();
		if(str.length()>128) return false;
		
		else{
			boolean[] bolArr = new boolean[128];
			for(int i=0;i<str.length();i++){
				int val = str.charAt(i);
				if(bolArr[val]){
					return false;
				}
				bolArr[val] = true;
			}
		}
		return true;
	}

}
