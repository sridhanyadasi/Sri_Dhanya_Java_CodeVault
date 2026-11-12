/* 1.Define a `Vehicle` class with attributes such as `brand`, `model`, and `year`. Then, create a
subclass `Car` that inherits from `Vehicle` and adds additional attributes specific to cars,
such as `numberOfDoors` and `fuelType`.*/


package com.te.inheritance;

public class Vehicle {
	
	String brand;
	String model;
	int year;
	
	public Vehicle (String brand , String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	public Vehicle  () {
		
	}
	public void display() {
		System.out.println("Car Brand :" +brand+ "\nCar Model :" +model+ "\nCar Year :"+year);
	}

}
