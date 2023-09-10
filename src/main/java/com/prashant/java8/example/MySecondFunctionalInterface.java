package com.prashant.java8.example;

@FunctionalInterface
public interface MySecondFunctionalInterface extends MyFirstFunctionalInterface {
	
	public boolean secondWork();
	
	@Override
	default public void firstWork() {
		System.out.println("From MySecondFunctionalInterface : firstWork() : ");
	}

	@Override
	public String toString(); // Overridden from Object class

	@Override
	public boolean equals(Object obj); // Overridden from Object class
}