package com.prashant.datastructure.linkedlist.main;
public class Emp{
	String name;
	
	public Emp(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/* toString implementation to print just the data */
	@Override
	public String toString() {
		return "Emp Name is : " + name;
	}
	
}