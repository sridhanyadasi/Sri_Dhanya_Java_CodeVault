/* 6.Define a `Vehicle` class with attributes like `brand`, `model`, and `year`. Then, create a
subclass `Car` that inherits from `Vehicle` and adds attributes like `numberOfDoors` and
`fuelType`. Finally, create a subclass `ElectricCar` that inherits from `Car` and adds attributes
like `batteryCapacity` and `chargeTime`. */

package com.te.inheritance2;

public class Vehicle {
	
	String brand;
	String model;
	int year;
	
	
	public Vehicle (String brand , String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	public void batteries() {
		System.out.println("Electric Cars utilize high capacity Batteries");
	}
	
	public void regenerativeBreaking () {
		System.out.println("Uses it to recharge the battery, enhancing efficiency");
	}
	
	public void features() {
		System.out.println("Electric vehicles comes with advanced saftey technologies");
	}
	
}

