package com.tcs.backtracking;

import java.util.ArrayList;
import java.util.HashSet;

public class Permutation {

	public static void main(String[] args) {

		String word = "ABA";
		ArrayList<Integer> index = new ArrayList<Integer>();
		
		Permutation pr = new Permutation();
		
		ArrayList<String> str = pr.permute(word, index);
		HashSet<String> hStr = new HashSet<String>();
		
		for(String tStr : str){
			hStr.add(tStr);
		}
		
		System.out.println(hStr);

	}

	public ArrayList<String> permute(String word, ArrayList<Integer> index){
		
		int len = word.length();
		
		ArrayList<String> toString = new ArrayList<String>();
		
		if(index.size() == len){
			toString.add("");
			return toString;
		}
		
		System.out.println("111111 "+toString);
		
		for(int i=0;i<len;i++){
			
			if(index.contains(i)) continue;
			
			ArrayList<Integer> dupIndex = new ArrayList<Integer>();
			
			for(int in : index){
				dupIndex.add(in);
			}
			
			dupIndex.add(i);
			System.out.println("11111222 "+dupIndex);
			
			ArrayList<String> permutation = permute(word, dupIndex);
			
			System.out.println("1113333 "+permutation);
			
			for(String s : permutation){
				
				toString.add(word.charAt(i)+s);
			}
			System.out.println("1114444 "+toString);
			
			
		}
		
		System.out.println(toString);
		return toString;
		
	}
}
