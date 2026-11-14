package com.te.interface1;

public class TextVehicle {

	public static void main(String[] args) {

		Vehicle amph = new AmphibiousVehicle();
		amph.move();
		amph.honk();
		amph.stop();
	
		System.out.println("-------------------------------------------");
		
		AmphibiousVehicle vehicle = new AmphibiousVehicle();
		vehicle.land();
		vehicle.floatOnWater();
		vehicle.move();
		vehicle.honk();
		vehicle.stop();
	}

}
