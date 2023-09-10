package com.prashant.java8.example;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedStreamExample {

	public static void intStream() {
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);

		System.out.println("Converting IntStream to List<Integer>");
		List<Integer> listIntStream = intStream.boxed().collect(Collectors.toList());
		listIntStream.forEach(System.out::println);

		IntStream intStream2 = IntStream.of(1, 2, 3, 4, 5, 6);
		List<Integer> listEvenIntStream1 =  intStream2.boxed().filter(i -> i % 2 == 0).collect(Collectors.toList());
		listEvenIntStream1.forEach(System.out::println);
		
		IntStream intStream3 = IntStream.of(1, 2, 3, 4, 5, 6);
		OptionalInt maxInt = intStream3.max();
		if(maxInt.isPresent()) {
			System.out.println(maxInt.orElse(7));
			System.out.println(maxInt.getAsInt());
		}
	}

}
