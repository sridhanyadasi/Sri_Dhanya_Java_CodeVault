/*  8. Consider an application for a ride-sharing service. Create a base class `Vehicle` with a
method `calculateFare()`. Create subclasses `Car`, `Bike`, and `Auto` that override the
`calculateFare()` method based on their specific fare calculation logic. Write a program to
demonstrate runtime polymorphism by creating instances of these subclasses and
calculating fares for different rides. Hint: Use method overriding in subclasses and
demonstrate polymorphism by calling the overridden methods through a base class
reference.

1. Vehicle public double calculateFare(double distance) { return 0.0; }

2. Car public double calculateFare(double distance) { double baseFare = 50; double
farePerKm = 15; return baseFare + (farePerKm * distance); }

3. Bike public double calculateFare(double distance) { double baseFare = 20; double
farePerKm = 5; return baseFare + (farePerKm * distance); }

4. Auto public double calculateFare(double distance) { double baseFare = 30; double
farePerKm = 10; return baseFare + (farePerKm * distance); }  */

package com.te.interface3;

public class TestVehicle {

	public static void main(String[] args) {

		Vehicle car = new Car();
		System.out.println("Distance travelled by Car is :" +car.calculateFare(10));
		
		Vehicle bike = new Bike();
		System.out.println("\nDistance travelled by Bike is :" +bike.calculateFare(15));
		
		Vehicle auto = new Auto();
		System.out.println("\nDistance travelled by Auto is :" +auto.calculateFare(5));
		
		
	}

}
