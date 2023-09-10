package com.prashant.java8.example;

public class Java8Example {

	public static void main(String[] args) {
		 CustomConsumer.forEachExample();
		
		System.out.println("******************* Map Iterator *******************");
		CustomBiConsumer.mapForEachExample();
		
		 BoxedStreamExample.intStream();

	}

	
}
