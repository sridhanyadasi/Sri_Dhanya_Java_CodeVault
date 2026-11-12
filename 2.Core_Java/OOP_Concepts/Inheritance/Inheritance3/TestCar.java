package com.te.inheritance2;

public class TestCar {

	public static void main(String[] args) {
		
		Car car = new Car("Audi", "Q8" , 2025, 4, "Petrol");
		car.display1();	
	
		ElectricCar electricCar = new ElectricCar("Audi", "Q8" , 2025, 4, "Petrol","10-80% Battery Capacity", "31 minutes charge time");
	  
	    System.out.println(electricCar);
	  
	    electricCar.batteries();
	    electricCar.regenerativeBreaking();
	    electricCar.features();
	    
	}
}
