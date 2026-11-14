/*  8. Consider an application for a ride-sharing service. Create a base class `Vehicle` with a
method `calculateFare()`. Create subclasses `Car`, `Bike`, and `Auto` that override the
`calculateFare()` method based on their specific fare calculation logic. Write a program to
demonstrate runtime polymorphism by creating instances of these subclasses and
calculating fares for different rides. Hint: Use method overriding in subclasses and
demonstrate polymorphism by calling the overridden methods through a base class
reference.

1. Vehicle public double calculateFare(double distance) { return 0.0; }

2. Car public double calculateFare(double distance) { double baseFare = 50; double
farePerKm = 15; return baseFare + (farePerKm * distance); }   */


package com.te.interface3;

public class Car extends Vehicle{
	
	public double calculateFare(double distance) {
		
		double baseFare = 50;
		double farePerKm = 15;
		
		return baseFare + (farePerKm * distance);
		
	}

}
