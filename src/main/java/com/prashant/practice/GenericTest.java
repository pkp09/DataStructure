package com.prashant.practice;

public class GenericTest {

	public static void main(String[] args) {
		Test3Param<Integer, String, Double> test1 = new Test3Param<>(1, "PKP", 1d);
		test1.printParam();
		
		new TestGenericFunction().genericvFunction("StringTest");
		new TestGenericFunction().genericvFunction(1);
		new TestGenericFunction().genericvFunction(new TestGenericType());
		
	}

}

class TestGenericFunction{
	<T> void genericvFunction(T t) {
		System.out.println(t);
	}
}

class Test3Param<T, U, V> {
	private T t; 
	private U u; 
	private V v;
	
	Test3Param(T t, U u, V v){
		this.t = t;
		this.u = u;
		this.v = v;
	}
	
	public T getT() {
		return t;
	}
	public U getU() {
		return u;
	}
	public V getV() {
		return v;
	}
	
	public void printParam() {
		System.out.println("t is : " + t.toString());
		System.out.println("u is : " + u.toString());
		System.out.println("v is : " + v.toString());
	}
}


class TestGenericType {
	private String var1;
	private Integer var2;
	private Double var3;
	private Long var4;
	
	TestGenericType(){
		
	}

	public String getVar1() {
		return var1;
	}

	public void setVar1(String var1) {
		this.var1 = var1;
	}

	public Integer getVar2() {
		return var2;
	}

	public void setVar2(Integer var2) {
		this.var2 = var2;
	}

	public Double getVar3() {
		return var3;
	}

	public void setVar3(Double var3) {
		this.var3 = var3;
	}

	public Long getVar4() {
		return var4;
	}

	public void setVar4(Long var4) {
		this.var4 = var4;
	}

	@Override
	public String toString() {
		return "TestGenericType [var1=" + var1 + ", var2=" + var2 + ", var3=" + var3 + ", var4=" + var4 + "]";
	}
	
	
}