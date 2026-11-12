/* 6.Define a `Vehicle` class with attributes like `brand`, `model`, and `year`. Then, create a
subclass `Car` that inherits from `Vehicle` and adds attributes like `numberOfDoors` and
`fuelType`. Finally, create a subclass `ElectricCar` that inherits from `Car` and adds attributes
like `batteryCapacity` and `chargeTime`. */

package com.te.inheritance2;

public class Car extends Vehicle {
	
	int numberOfDoors;
	String fuelType;
	
	public Car(String brand, String model, int year, int numberOfDoors, String fuelType) {
		super(brand, model, year);
		this.numberOfDoors = numberOfDoors;
		this.fuelType = fuelType;
	}
	public void display1() {
		System.out.println("Car Brand :" +brand+ "\nCar Model :" +model+ "\nCar Year :"+year+"\nNumber of doors in BMW Car :"+numberOfDoors+ "\nFuel Type :"+fuelType);
	}
}
