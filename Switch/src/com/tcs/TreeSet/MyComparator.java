package com.tcs.TreeSet;

import java.util.Comparator;

public  class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		String s1 = String.valueOf(obj1);
		String s2 = String.valueOf(obj2);
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 < len2 ){
			return -1;
		}
		else if(len1 > len2){
			return 1;
		}
		else {
			return s1.compareTo(s2);
		}
		
	}

}
