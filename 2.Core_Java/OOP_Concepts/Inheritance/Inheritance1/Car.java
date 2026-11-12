/* 1.Define a `Vehicle` class with attributes such as `brand`, `model`, and `year`. Then, create a
subclass `Car` that inherits from `Vehicle` and adds additional attributes specific to cars,
such as `numberOfDoors` and `fuelType`.*/
package com.te.inheritance;

public class Car extends Vehicle {
	
	int numberOfDoors;
	String fuelType;
	
	public Car(String brand, String model, int year, int numberOfDoors, String fuelType) {
		//super(brand , model, year);
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.numberOfDoors = numberOfDoors;
		this.fuelType = fuelType;
	}
	public void display1() {
		System.out.println("Car Brand :" +brand+ "\nCar Model :" +model+ "\nCar Year :"+year+"\nNumber of doors in BMW Car :"+numberOfDoors+ "\nFuel Type :"+fuelType);
	}	
}
