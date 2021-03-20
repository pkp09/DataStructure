package com.prashant;

enum EnumExample1 {
	FIRST(1, "First"), SECOND(2, "Second"), THIRD(3, "Third");

	EnumExample1(int index, String name) {
		System.out.println();
	}

	public EnumExample1 get(String name) {
		return EnumExample1.valueOf(name);
	}
}

// ============= enum can extends Interface
interface TestEnum {
	public void testInteface();
}

enum TestIntefaceImpl implements TestEnum {
	TESTINTERFACE1(1), TESTINTERFACE2(2);

	TestIntefaceImpl(int i){
		
	}
	
	public void testInteface() {
		TestIntefaceImpl[] test = TestIntefaceImpl.values();
		for (TestIntefaceImpl t : test)
			System.out.println("Class is : " + t.getDeclaringClass().getName() + "Name is : " + t.name());

	}
}
// =========================================

public class EnumExample {

	public static void main(String args[]) {
		EnumExample1 e1 = EnumExample1.FIRST;
		EnumExample1 e2 = e1.get(EnumExample1.FIRST.name());
		if(e2 != null) {
			System.out.println("Test Present");
		}else {
			System.out.println("Not Present");
		}
		
		EnumExample1[] exa1 = EnumExample1.values();
		for (EnumExample1 ex : exa1) {
			System.out.println("Name is : " + ex.name());
			System.out.println("Ordinal is : " + ex.ordinal());
			System.out.println("Value of : " + EnumExample1.valueOf(EnumExample1.FIRST.name()));
		}

		// Interface Example
		TestIntefaceImpl imple = TestIntefaceImpl.TESTINTERFACE1;
		imple.testInteface();
		TestIntefaceImpl impl2 = TestIntefaceImpl.TESTINTERFACE2;
		System.out.println("Ordinal is : " + impl2.ordinal());
		System.out.println("toString() is : " + impl2.toString());
		System.out.println("getDeclaringClass() is : " + impl2.getDeclaringClass());
	}

}
