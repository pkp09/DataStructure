package com.prashant.designpattern;

public class TestFactoryPattern {

	public static void main(String[] args) {
		Car car = FactoryCar.buildCar(CarType.HATCHBACK);
		car.getFetaures();
		car.setFeatures("Hatchback style");
		System.out.println("**********************************");
		
		Car car2 = FactoryCar.buildCar(CarType.SEDAN);
		car2.getFetaures();
		car2.setFeatures("Sedan style");
		System.out.println("**********************************");
		
		Car car3 = FactoryCar.buildCar(CarType.SUV);
		car3.getFetaures();
		car3.setFeatures("SUV Style");

	}

}

class FactoryCar {
	private static Car car;

	public static  Car buildCar(CarType type) {
		switch (type) {
		case HATCHBACK:
			car = new HatchBack();
			break;
		case SEDAN:
			car = new Sedan();
			break;
		case SUV:
			car = new Suv();
			break;
		default:
			car = null;
			break;
		}
		return car;
	}

	public void modifyCar(String feature) {
		car.setFeatures(feature);
	}
}

enum CarType {
	HATCHBACK, SEDAN, SUV
}

interface Car {
	public void getFetaures();

	public default void setFeatures(String feature) {
		System.out.println("Default features : " + feature);
	}
}

class HatchBack implements Car {
	public HatchBack() {
		System.out.println("Hactchback Instance has been created");
	}
	
	public void getFetaures() {
		System.out.println("New Hatchback");
	}

	public void setFeatures(String feature) {
		System.out.println("Hatchback features : " + feature);
	}
}

class Sedan implements Car {
	public Sedan() {
		System.out.println("Sedan Instance has been created");
	}
	
	public void getFetaures() {
		System.out.println("New Sedan");
	}
}

class Suv implements Car {
	public Suv() {
		System.out.println("Suv Instance has been created");
	}
	
	public void getFetaures() {
		System.out.println("New Suv");
	}
}