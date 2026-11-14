/*  5. Suppose you&#39;re designing a system to model different types of vehicles. You have
identified three main behaviors that vehicles can exhibit: they can move, stop, and honk.
Additionally, you want to model a special type of vehicle called an amphibious vehicle,
which can both move on land and float on water. */

package com.te.interface1;

public interface Vehicle {

	public default void move() {
		System.out.println("Vehicle is Moving ");
	}
	
	public default void stop() {
		System.out.println("Vehicle has Stopped");
	}
	
	public default void honk() {
		System.out.println("Vehicle honk like Beep!.... Beep!...Beep!...");
	}

}
