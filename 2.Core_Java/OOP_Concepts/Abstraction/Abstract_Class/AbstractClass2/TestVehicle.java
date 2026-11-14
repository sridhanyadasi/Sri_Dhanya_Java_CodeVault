package com.te.abstractClass1;

public class TestVehicle {

	public static void main(String[] args) {		
		
		Vehicle car = new Car();
		car.setMake("BMW");
		car.setModel("BMW Z8");
		System.out.println("Make : "+car.getMake()+ "\nModel :" +car.getModel());
		car.start();
		car.stop();
		System.out.println("--------------------------------------------------------");
				
		Vehicle motor = new MotorCycle();
		motor.setMake("Royal Enfield");
		motor.setModel("Classic 350");
		System.out.println("Make : "+motor.getMake()+ "\nModel :" +motor.getModel());
		motor.start();
		motor.stop();
		System.out.println("--------------------------------------------------------");
		
		Vehicle truck = new Truck();
		truck.setMake("Mahindra");
		truck.setModel("Veero CNG");
		System.out.println("Make : "+truck.getMake()+ "\nModel :" +truck.getModel());
		truck.start();
		truck.stop();
	}
}
