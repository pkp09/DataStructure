/**
 * 
 */
package com.prashant.designpattern.builder;

/**
 * @author Saurabh
 *
 */
public class UserBuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User.UserBuilder().address("INDIA").age(32).lastName("Pandey").firstName("PK").build();
		System.out.println(user);
	}

}
