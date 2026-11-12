/* 6.Define a `Vehicle` class with attributes like `brand`, `model`, and `year`. Then, create a
subclass `Car` that inherits from `Vehicle` and adds attributes like `numberOfDoors` and
`fuelType`. Finally, create a subclass `ElectricCar` that inherits from `Car` and adds attributes
like `batteryCapacity` and `chargeTime`. */

package com.te.inheritance2;

public class ElectricCar extends Car{
	
	String batteryCapacity;
	String chargeTime;

	public ElectricCar(String brand, String model, int year, int numberOfDoors, String fuelType, String batteryCapacity,String chargeTime) {
      
		super(brand,model,year,numberOfDoors,fuelType);
		
		this.batteryCapacity = batteryCapacity;
		this.chargeTime = chargeTime;
	}

	public String toString() {
		return "Car Brand :" +brand+ "\nCar Model :" +model+ "\nCar Year :"+year+"\nNumber of doors in BMW Car :"+numberOfDoors+ "\nFuel Type :"+fuelType+ "\nBattery Capacity :"+batteryCapacity+ "\nCharge Time :" +chargeTime;
	}
}

