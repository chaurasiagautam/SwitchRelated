package com.tcs.TreeSet;

import java.util.*;

public class EmpImplementation {

	public static void main(String[] args) {

		Employee e1= new Employee(100, "A");
		Employee e2= new Employee(101, "C");
		Employee e3= new Employee(102, "B");
		Employee e4= new Employee(103, "D");
		Employee e5= new Employee(100, "A");
		
		TreeSet tr = new TreeSet(new Employee());
		
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);
		tr.add(e5);
		System.out.println(tr);
		
	}

}
