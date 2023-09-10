package com.prashant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
private static String GENDER_MALE="Male";
private static String GENDER_FEMALE="Female";
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {"Aarav1", "Aayansh2","Kartik3","Avyan4","Aarav5", "Aayansh6","Kartik7","Avyan8","Aarav3"});
		
		// findLastElementInStream(list);
		
		// findNthElementFromLast(list, 2);
		// sort(list);
		
		Employee emp1 = new Employee("Aarav", 3, new Address("varanasi", "Line12"), GENDER_MALE);
		Employee emp2 = new Employee("Kartik", 4, new Address("Varanasi", "Line22"), GENDER_FEMALE);
		Employee emp3 = new Employee("Avyan", 2, new Address("Sultanpur", "Line32"), GENDER_FEMALE);
		Employee emp4 = new Employee("Prashant", 35, new Address("GyanKhand1", "Line42"), GENDER_MALE);

		Employee emp11 = new Employee("Aarav1", 3, new Address("varanasi", "Line12"), GENDER_MALE);
		Employee emp21 = new Employee("Kartik1", 4, new Address("Varanasi", "Line22"), GENDER_FEMALE);
		Employee emp31 = new Employee("Avyan1", 2, new Address("Sultanpur", "Line32"), GENDER_FEMALE);
		Employee emp41 = new Employee("Prashant1", 35, new Address("GyanKhand1", "Line42"), GENDER_MALE);
		Employee emp51 = new Employee("Rahul1", 5, new Address("GyanKhand51", "Line52"), GENDER_MALE);
		
		
		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4);
		// sortEmployee(empList);
		
		Map<Employee, String> map = new HashMap<>();
		map.put(emp4, "Emp4");
		map.put(emp1, "Emp1");
		map.put(emp3, "Emp3");
		map.put(emp2, "Emp2");
				
		// printMapUsingForEach(map);
		// printEvery2ndElement(list);
		// printEveryNthElement(list, 2);
		List<Employee> empList1 = Arrays.asList(emp1, emp2, emp3, emp4, emp11, emp21, emp31, emp41, emp51);
		// printNthElement(empList1, 2, GENDER_FEMALE);
		// printNthElement(empList1, 3, GENDER_MALE);
		
		List<Integer> intList = Arrays.asList(new Integer[] {1, 4, 2, 3, 5, 9, 6, 8, 7, 10});
		printAvg(intList);
	}

	private static void printAvg(List<Integer> listInt) {
		System.out.println("************************** Avarage of List *************************");
		int count = listInt.size();

		Function<Integer, Integer> sum = new Function<Integer, Integer>() {
			int sum = 0;
			@Override
			public Integer apply(Integer t) {
				sum = sum + t;
				return sum;
			}
		};
		
		
		Function<Integer, Float> average = new Function<Integer, Float>() {
			@Override
			public Float apply(Integer t) {
				System.out.println("Sum is : " + t);
				System.out.println("Count is : " + count);
				float avg = t/(float)count;
				
				System.out.println("Average is : " + avg);
				return avg;
			}
		};
		List<Integer> add = listInt.stream().map(sum).collect(Collectors.toList());
		System.out.println("Sum is : ");
		add.forEach(System.out::println);
		
		List<Float> avg = add.stream().skip(count-1).map(average).collect(Collectors.toList());
		
		System.out.println("Average is : ");
		avg.forEach(System.out::println);
		System.out.println("***********************************************************************");
	}

	
	private static void printNthElement(List<Employee> list, int index, String gender) {
		System.out.println("************************************* Print every Nth Employee from the List Who is " + gender +" Index is :" + index +"**********************************************");
		Consumer<Employee> action = new Consumer<Employee>() {
			int counter = 1;
			public void accept(Employee emp) {
				if(counter%index == 0 && emp.getSex().equals(gender)) {
					System.out.println(emp);
				}
				System.out.println("Counter is : " + counter + " Gender is : " + emp.getSex());
				counter++;
			}
		};
		list.forEach(action);
		System.out.println("**************************************************************************************");
	}
	
	private static void printEveryNthElement(List<String> list, int n) {
		System.out.println("************************************* Print every Nth element from the List Index is :" + n +"**********************************************");
		Consumer<String> action = new Consumer<String>() {
			int counter = 1;
			public void accept(String str) {
				if(counter%n == 0) {
					System.out.println(str.toUpperCase());
				}
				counter++;
			}
		};
		list.forEach(action);
		System.out.println("**************************************************************************************");
	}
	
	private static void printEvery2ndElement(List<String> list) {
		System.out.println("************************************* Print every 2nd element from the List **********************************************");
		Consumer<String> action = new Consumer<String>() {
			int counter = 1;
			public void accept(String str) {
				if(counter%2 == 0) {
					System.out.println(str);
				}
				counter++;
			}
		};
		list.forEach(action);
		System.out.println("**************************************************************************************");
	}
	
	
	
	
	
	private static void findLastElementInStream(List<String> list) {
		Stream<String> stream = list.stream();
		List<String> lastElement = stream.skip(list.stream().count()-1).collect(Collectors.toList());
		System.out.println("**************** Find the Last Element ****************");
		lastElement.forEach(System.out::println);
		System.out.println("***********************************************");
	}
	
	private static void findNthElementFromLast(List<String> list, int index) {
		System.out.println("**************** Find Nth element from the Last ****************");
		Stream<String> stream = list.stream();
		System.out.println("Element Position from the last : " + index);
		System.out.println(stream.skip(list.stream().count() - index).findFirst().get());
		System.out.println("***********************************************");
	}
	
	
	
	private static void sort(List<String> list) {
		System.out.println("**************** Sort the List of String ****************");
		Consumer<String> action = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		list.stream().sorted().forEach(action);
		System.out.println("***********************************************");
	}
	
	private static void sortEmployee(List<Employee> empList) {
		System.out.println("**************** Sort the List of Employee By Name ****************");
		Comparator<Employee> sortByEmpName = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		empList.stream().sorted(sortByEmpName).forEach(System.out::println);
		
		System.out.println("**************** Sort the List of Employee By Address ****************");
		
		Comparator<Employee> sortByAddressLine1 = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getAddress().getLine1().compareTo(e2.getAddress().getLine2());
			}
		};	
		empList.stream().sorted(sortByAddressLine1).forEach(System.out::println);
		
		
		System.out.println("***********************************************");
	}
	
	private static void printMapUsingForEach(Map <Employee, String> map) {
		System.out.println("**************** Print Map ****************");
		BiConsumer<Employee, String> action = new BiConsumer<Employee, String>(){
			public void accept(Employee emp, String str) {
				System.out.println(emp.getName());
				System.out.println(emp.getAddress().getLine1());
				System.out.println(emp.getAddress().getLine2());
				System.out.println(emp.getAge());
			}
		};
		map.forEach(action);
		System.out.println("***********************************************");
	}
}


class Employee {
	private String name;
	private int age;
	private Address address;
	private String gender;
	
	public Employee(String name, int age, Address address, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getSex() {
		return gender;
	}
	public void setSex(String sex) {
		this.gender = sex;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + "]";
	}
	
}

class Address implements Comparable<Address>{
	private String line1;
	private String line2;
	
	public Address(String line1, String line2) {
		super();
		this.line1 = line1;
		this.line2 = line2;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + "]";
	}

	@Override
	public int compareTo(Address o) {
		return this.getLine1().compareTo(o.getLine1());
	}
	
}