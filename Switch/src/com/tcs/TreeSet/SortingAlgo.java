package com.tcs.TreeSet;

import java.util.HashMap;
import java.util.TreeSet;

public class SortingAlgo {

	public static void main(String[] args) {

		SortingAlgo sa = new SortingAlgo();
		sa.arrangeByCustomSorting();
	}
	
	public void arrangeByCustomSorting(){
		
		TreeSet ts = new TreeSet();
		TreeSet tsC = new TreeSet(new MyComparator());
		ts.add("A");
		ts.add("C");
		ts.add("G");
		ts.add("SSED");
		ts.add("HURD");
		ts.add("AWSX");
		ts.add("OTFD");
		ts.add("JUYG");
		ts.add("OPUG");
		ts.add("FRED");
		ts.add("SWAER");
		ts.add("XCDFDS");
		ts.add("B");
		System.out.println(ts);
		tsC.add("A");
		tsC.add("C");
		tsC.add("G");
		tsC.add("SSED");
		tsC.add("HURD");
		tsC.add("AWSX");
		tsC.add("OTFD");
		tsC.add("JUYG");
		tsC.add("OPUG");
		tsC.add("FRED");
		tsC.add("SWAER");
		tsC.add("XCDFDS");
		tsC.add("B");
		System.out.println(tsC);
	}

}
