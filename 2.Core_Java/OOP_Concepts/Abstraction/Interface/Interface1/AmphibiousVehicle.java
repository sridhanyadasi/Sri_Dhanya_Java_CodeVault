/*  5. Suppose you&#39;re designing a system to model different types of vehicles. You have
identified three main behaviors that vehicles can exhibit: they can move, stop, and honk.
Additionally, you want to model a special type of vehicle called an amphibious vehicle,
which can both move on land and float on water. */

package com.te.interface1;

public class AmphibiousVehicle implements Vehicle{   // interface to class     ---> implements
	                                                 //interface to interface  ---> extends 
	                                                 //class to class          ---> extends
	
	public void land() {
		System.out.println("This Amphibious Vehicle moves on Land");
	}
	
	public void floatOnWater() {
		System.out.println("This Amphibious Vehicle Floats on Water");
	}
}
