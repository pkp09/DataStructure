package com.prashant.java8.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class CustomBiConsumer {

	static void mapForEachExample() {
		Map<Integer, String> names = new HashMap<>();
		names.put(1, "Aarav");
		names.put(2, "Kartik");
		names.put(3, "Avyan");
		names.put(4, "Aayansh");

		System.out.println("************** without writing custom BiConsumer **************");
		names.forEach((k, v) -> System.out.println("Key : " + k + " value : " + v));

		System.out.println("************** Custom BiConsumer Using new and accept() **************");
		BiConsumer<Integer, String> biConsumer = new BiConsumer<Integer, String>() {
			public void accept(Integer num, String name) {
				System.out.println("Key is : " + num + " Value is : " + name);
			}
		};

		System.out.println("************** Printing Key and Value **************");
		names.putIfAbsent(5, "Avyu");
		names.forEach(biConsumer);

		System.out.println("************** Custom BiConsumer Using anonymous function **************");
		BiConsumer<Integer, String> action = (a, b) -> {
			System.out.println("Key is : " + a + " : Value is : " + b);
		};

		names.forEach(action);

		BiFunction<Integer, String, String> biFunction = new BiFunction<Integer, String, String>() {

			@Override
			public String apply(Integer t, String u) {
				return u;
			}
		};
		System.out.println("Using BiFunction on compute and computeIfPresent");
		System.out.println(names.compute(1, biFunction));
		System.out.println(names.computeIfPresent(6, biFunction));

		// if key is absent it will add this value to map
		Function<Integer, String> function = new Function<Integer, String>() {
			public String apply(Integer t) {
				return "New Name";
			}
		};

		System.out.println("************** Custom function on computeIfAbsent**************");
		System.out.println(names.computeIfAbsent(6, function));
		names.forEach(action);

		
	}

}
