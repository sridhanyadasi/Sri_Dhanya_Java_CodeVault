/* → Define a subclass `Car` that extends `Vehicle` with an additional attribute `numDoors`
(int). - Implement a constructor to initialize all attributes. - Override the `startEngine()`
method to print &quot;Car engine started&quot; */

package com.te.abstractClass2;

public class Car extends Vehicle{
	
	int numDoors;
	
	public Car(String make, String model, int numDoors) {

		super(make, model);
		this.numDoors = numDoors;
	}
	
	public String toString() {
		return  "\nNum of doors : " +numDoors;
	}
	
	public void startEngine() {
		System.out.println("Car Engine Started");
	}

}
