package com.prashant.java.concept.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Java8Example {

	public static void main(String args[]) {
		// largestString();
		
		sortEmployee();
	}
	
	static void largestString() {
		List<String> str = new ArrayList<>();
		str.add("THis is a DOg");
		str.add("This is an Elephant");
		str.add("This is a Zebra");
		str.add("This is Hello New World");
		String maxLength = Collections.max(str, Comparator.comparingInt(String::length));
		System.out.println(maxLength);
		Optional<String> optStr = str.stream().max(Comparator.comparing(String::length));
		if(optStr.isPresent())
			System.out.println(optStr.get());
	}
	
	static void sortEmployee() {
		List<Employee> listEMp = new ArrayList<>();
		Employee emp1 = new Employee("emp1", new Address("Line1Addrress1", "line2Address1", 1));
		Employee emp3 = new Employee("emp3", new Address("Line1Addrress3", "line2Address3", 3));
		Employee emp2 = new Employee("emp2", new Address("Line1Addrress2", "line2Address2", 2));
		listEMp.add(emp1);
		listEMp.add(emp3);
		listEMp.add(emp2);
		listEMp.stream().sorted().forEach(System.out::println);
	}
}


class Employee implements Comparable<Employee>{
	private String name;
	private Address address;
	
	Employee(String name, Address address){
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}


class Address{
	String line1;
	String line2;
	int zip;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public Address(String line1, String line2, int zip) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", zip=" + zip + "]";
	}
	
}