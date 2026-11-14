/* Now, consider a class `Car` that represents a specific vehicle type. Design the `Car` class to
implement the necessary interfaces to exhibit the behaviors of moving, stopping, and
honking. Ensure that the `Car` class provides appropriate implementations for all the
methods defined in the interfaces it implements. */

package com.te.interface2;

public class Car implements Moveable, Stoppable , Honkable , Amphibious {
	
	public void move() {
		System.out.println("Car is moving...");
	}
	
	public void honk() {
		System.out.println("Car honk like beep!...beep!...beep!...");
	}
	
	public void floatOnWater() {
		System.out.println("This Amphibious Car can Float on water");
	}
	
	public void stop() {
		System.out.println("Car has Stopped");
	}

}
