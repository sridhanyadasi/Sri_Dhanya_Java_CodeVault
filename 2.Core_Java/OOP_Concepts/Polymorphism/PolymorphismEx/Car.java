package com.te.PolyMorphismEx;

public class Car extends Vehicle {
	
	
	public void start() {
		System.out.println("Cars have started");
	}
	
	public void engine() {
		System.out.println("Engine is about to start");
	}
	
	public static void stop() {
		System.out.println("Static method");
	}

}
