/* 5. Create a `Car` class with private attributes ‘make’, ‘model’, ‘year’ and `speed`. Provide a setter
method that only allows the speed to be set if it is a non-negative value. Write a program to test this
validation.
Hint: Add a condition inside the setter method to validate the value. */

package com.te.encapsulation;

public class Car1 {
	
	private String make;
	private String model;
	private int year;
	private int speed;
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	if (speed <= 100) {
		System.out.println("Access Granted to drive a Car");
	}
	else {
		System.out.println("Access Denied to drive a Car");
	}
		
	}

}