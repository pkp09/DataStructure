/**
 * 
 */
package com.prashant.designpattern.builder;

/**
 * @author Saurabh
 *
 */
public class User {
	private String firstName;
	private String lastName;
	private String address;
	private int age;
	
	private User(UserBuilder ub) {
		this.firstName = ub.firstName;
		this.lastName = ub.lastName;
		this.address = ub.address;
		this.age = ub.age;
	}
	

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getAddress() {
		return address;
	}


	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", age=" + age
				+ "]";
	}


	public static class UserBuilder{
		private String firstName;
		private String lastName;
		private String address;
		private int age;
		
		/*public UserBuilder(String fName, String lName) {
			this.firstName = fName;
			this.lastName = lName;
		}*/
		
		public UserBuilder firstName(String fName) {
			this.firstName = fName;
			return this;
		}
		
		public UserBuilder lastName(String lName) {
			this.lastName = lName;
			return this;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
	}
}
