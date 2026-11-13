/* 4. Create a `Car` class with private attributes `make`, `model`, and `year`. Provide public getter and
setter methods for each attribute. Write a program to create an instance of the `Car` class, set its
attributes, and print them.
Hint: Use private variables and public methods to access and modify these variables. */

package com.te.encapsulation;

public class TestCar {

	public static void main(String[] args) {

		Car car = new Car("Candy", "s", 23);
		//car.setMake("Tessla");
		car.setModel("Model S");
		car.setYear(2015);
		
		System.out.println("Make : "+car.getMake()+ "\nModel : " +car.getModel()+ "\nYear : " +car.getYear());
	}

}
