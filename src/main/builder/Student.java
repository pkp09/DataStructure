/**
 * 
 */
package com.prashant.designpattern.builder;

/**
 * @author pkp
 *
 */
public class Student {
	private String name;
	private int age;
	private String address;
	
	private Student(StudentBuilder sb) {
		this.name = sb.name;
		this.age = sb.age;
		this.address = sb.address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	public static class StudentBuilder{
		private String name;
		private int age;
		private String address;
		
		public StudentBuilder(String name){
			this.name = name;
		}
		
		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public StudentBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public Student build() {
			Student student = new Student(this);
			return student;
		}
	}
}
