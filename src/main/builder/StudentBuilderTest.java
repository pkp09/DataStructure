/**
 * 
 */
package com.prashant.designpattern.builder;

/**
 * @author pkp
 *
 */
public class StudentBuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu = new Student.StudentBuilder("PKP").age(30).address("India").build();
		System.out.println(stu);
	}

}
