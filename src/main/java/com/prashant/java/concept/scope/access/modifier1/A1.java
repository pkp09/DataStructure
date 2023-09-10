package com.prashant.java.concept.scope.access.modifier1;

public class A1 extends A {
	public int age;
	String name;
	protected String address;
	double code;

	void Test(A b) {
		b.member();
	}

	void Test(A1 yd) {
		yd.member();
	}
}
