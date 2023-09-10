package com.prashant.java.concept.scope.access.modifier1;

public class A {

	public int age;
	private String name;
	protected String address;
	double code;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	double getCode() {
		return code;
	}
	void setCode(double code) {
		this.code = code;
	}
	
	public String toString() {
		setName(name);
		return getName();
	}
	
	
	
	protected void member() { }
}
