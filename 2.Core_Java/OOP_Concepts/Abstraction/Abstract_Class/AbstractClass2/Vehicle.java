/* 3. Create an abstract class `Vehicle` with properties like `make`, `model`, and abstract
methods like `start()` and `stop()`.Implement concrete subclasses such as `Car`,
`Motorcycle`, and `Truck` that extend `Vehicle` and provide implementations for `start()`
and `stop()`.In a transportation management system, the `Vehicle` hierarchy can represent
different types of vehicles (cars, motorcycles, trucks), each with its own methods for starting
and stopping engines. */

package com.te.abstractClass1;

public abstract class Vehicle {
	
	private String make;
	private String model;
	
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
	
	public abstract void start();
	
	public abstract void stop();
	

}
