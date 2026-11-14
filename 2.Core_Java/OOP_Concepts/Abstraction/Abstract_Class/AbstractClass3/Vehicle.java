/*  5. Vehicle Hierarchy : Consider a hierarchy of vehicles consisting of a base class `Vehicle` and
two subclasses `Car` and `Motorcycle`. Each vehicle has attributes such as `make`, `model`,
and methods `startEngine()` and `stopEngine()`.

→ Define a class `Vehicle` with the following specifications: - Attributes: `make` (String),
`model` (String) - Methods: `startEngine()` and `stopEngine()`, which print &quot;Engine started&quot;
and &quot;Engine stopped&quot; respectively.

→ Define a subclass `Car` that extends `Vehicle` with an additional attribute `numDoors`
(int). - Implement a constructor to initialize all attributes. - Override the `startEngine()`
method to print &quot;Car engine started&quot;.

→ Define another subclass `Motorcycle` that extends `Vehicle` with an additional attribute
`hasSideCar` (boolean). - Implement a constructor to initialize all attributes. - Override the
`startEngine()` method to print &quot;Motorcycle engine started&quot;.

→ In the main method, create instances of `Car` and `Motorcycle` and demonstrate
up casting and down casting as follows: - Upcast each object to type `Vehicle` and call the
`startEngine()` method. - Downcast each object back to its original type and call the
subclass-specific methods (`getters/setters` for subclass-specific attributes, or overridden
methods).

→ Constraints: - Ensure proper encapsulation of attributes with getters and setters. -
Implement constructors and methods in each class. - Demonstrate both up casting and
down casting in the main method. */

package com.te.abstractClass2;

public abstract class Vehicle {

	private  String make;
	private String model;
	
	public Vehicle (String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	public void display() {
		System.out.println("Make :" +make);
		System.out.println("Model : " +model);
	}
	
	public abstract void startEngine() ;
		
	public void stopEngine() {
		System.out.println("Engine Stopped");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
