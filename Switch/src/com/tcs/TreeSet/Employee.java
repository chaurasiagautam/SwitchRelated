package com.tcs.TreeSet;

import java.util.Comparator;

public class Employee implements Comparator{

	int emId;
	String name;
	
	public Employee(){}
	public Employee(int emId, String name){
		this.emId = emId;
		this.name = name;
	}
	
	@Override
	public String toString(){
		
		return this.emId+"--"+this.name;
	}

	@Override
	public int compare(Object arg0,Object o2) {
		Employee e = (Employee)arg0;
		Employee e1 = (Employee)o2;
		String newName = e.name;
		String newName1= e1.name;
		return newName.compareTo(newName1);
		
	}


}
