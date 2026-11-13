package com.te.encapsulation;

public class TestCar1 {

	public static void main(String[] args) {

	
		Car1 car = new Car1();
		car.setMake("Audi");
		car.setModel("Q5");
		car.setYear(2022);
		car.setSpeed(100);
		
		System.out.println("\nMake : " +car.getMake()+ "\nModel :" +car.getModel()+ "\nYear :  " +car.getYear()+ "\nSpeed : " +car.getSpeed());
	}

}
