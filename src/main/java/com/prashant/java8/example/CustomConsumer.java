package com.prashant.java8.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CustomConsumer {

	static void forEachExample() {
		List<String> names = Arrays.asList("Aarav", "Kartik", "Avyan", "Vaibhav");
		System.out.println("************* Using Custom Anonymous Consumer1 *************");
		Consumer<String> anonymousConsumer1 = (a) -> {
			System.out.println(a);
		};
		names.forEach(anonymousConsumer1);
		
		System.out.println("************* Using Custom Anonymous Consumer2 *************");
		Consumer<String> anonymousConsumer2 = System.out::println;
		names.forEach(anonymousConsumer2);

		System.out.println("************* Printing Name in Uppper Case Using Custom Consumer *************");
		Consumer<String> upperCaseConsumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		};

		names.forEach(upperCaseConsumer);
		
		System.out.println("************* Length of each element using map ************* ");
		List<Integer> nameLength = names.stream().map(name -> name.length()).collect(Collectors.toList());
		nameLength.forEach(System.out::println);

		System.out.println("************* Sorting Name in Normal Case Using Custom Consumer *************");
		Consumer<String> normalCaseConsumer = new Consumer<String>() {
			public void accept(String normalCase) {
				System.out.println(normalCase);
			}
		};
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};

		names.stream().sorted(comparator).forEach(normalCaseConsumer);

		System.out.println("************* Reversing Sorting Name in Normal Case Using Custom Consumer *************");
		Comparator<String> reverseOrder = new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};

		names.stream().sorted(reverseOrder).forEach(normalCaseConsumer);
		
		
		MySecondFunctionalInterface second = new MySecondFunctionalInterface() {

			@Override
			public boolean secondWork() {
				System.out.println("Second");
				return true;

			}

			@Override
			public void firstWork() {
				System.out.println("First");
			}
		};
		
		names.stream().filter(p -> second.secondWork()).collect(Collectors.toList()).forEach(normalCaseConsumer);
	}
}
