package com.te.polymorphismPractice;


public class TestVehicle {

	public static void main(String[] args) {

		Vehicle myCar = new Car();
		myCar.speedUp();
		
		Vehicle myBicycle = new Bicycle();
		myBicycle.speedUp();	
	}
}
