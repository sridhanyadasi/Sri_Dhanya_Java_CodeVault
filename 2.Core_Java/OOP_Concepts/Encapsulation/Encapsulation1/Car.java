/* 4. Create a `Car` class with private attributes `make`, `model`, and `year`. Provide public getter and
setter methods for each attribute. Write a program to create an instance of the `Car` class, set its
attributes, and print them.
Hint: Use private variables and public methods to access and modify these variables. */

package com.te.encapsulation;

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	public Car(String make , String model , int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
  
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake (String make) {
		this.make = make;
	}
	
	public void setModel (String model) {
		this.model = model;
	}
	
	public void setYear (int year) {
		this.year = year;
	}
}