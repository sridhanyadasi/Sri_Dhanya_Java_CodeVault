/* → In the main method, create instances of `Car` and `Motorcycle` and demonstrate
up casting and down casting as follows: - Upcast each object to type `Vehicle` and call the
`startEngine()` method. - Downcast each object back to its original type and call the
subclass-specific methods (`getters/setters` for subclass-specific attributes, or overridden
methods).

→ Constraints: - Ensure proper encapsulation of attributes with getters and setters. -
Implement constructors and methods in each class. - Demonstrate both up casting and
down casting in the main method.  */

package com.te.abstractClass2;

public class TestVehicle {

	public static void main(String[] args) {

		Vehicle car = new Car("Rolls Royce" , "Rolls - Royce 10 hp",2 ); //upCasting
		car.display();
		System.out.println(car);
		car.startEngine();
		car.stopEngine();
	
//		Car vehicle =(Car) new Vehicle(); //downCasting
//		vehicle.setMake("Tessla");
//		vehicle.setModel("Model S");
//		System.out.println("Make : " +make+ "Model : " +model);
		
	    System.out.println("--------------------------------------------------");
	    
		Vehicle motor = new MotorCycle("Lamborghini", "Lamborghini Aventador ", false);
		motor.display();
		System.out.println(motor);
		motor.startEngine();
		motor.stopEngine();
		
//		MotorCycle vehic = (MotorCycle) new Vehicle();
//		vehic.setMake("Audi");
//		vehic.setMake("Q5");
//		vehic.startEngine();
//		vehic.stopEngine();	
	}
}
