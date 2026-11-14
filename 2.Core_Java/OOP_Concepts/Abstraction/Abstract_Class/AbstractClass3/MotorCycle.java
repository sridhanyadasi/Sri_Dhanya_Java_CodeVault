/* → Define another subclass `Motorcycle` that extends `Vehicle` with an additional attribute
`hasSideCar` (boolean). - Implement a constructor to initialize all attributes. - Override the
`startEngine()` method to print &quot;Motorcycle engine started&quot;  */

package com.te.abstractClass2;

public class MotorCycle extends Vehicle {
	
	boolean hasSideCar;
	
	public MotorCycle(String make, String model, boolean hasSideCar) {
	
		super(make, model);
		this.hasSideCar = hasSideCar;		
	}
	
	public String toString() {
		return  "\nHas Side Car : " +hasSideCar;
	}
	
	public void startEngine() {
		System.out.println("MotorCycle Engine Started");
	}

}
