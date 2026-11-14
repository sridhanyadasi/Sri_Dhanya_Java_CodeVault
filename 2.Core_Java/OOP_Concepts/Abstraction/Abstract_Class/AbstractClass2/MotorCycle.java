/* 3. Create an abstract class `Vehicle` with properties like `make`, `model`, and abstract
methods like `start()` and `stop()`.Implement concrete subclasses such as `Car`,
`Motorcycle`, and `Truck` that extend `Vehicle` and provide implementations for `start()`
and `stop()`.In a transportation management system, the `Vehicle` hierarchy can represent
different types of vehicles (cars, motorcycles, trucks), each with its own methods for starting
and stopping engines. */

package com.te.abstractClass1;

public class MotorCycle extends Vehicle {

	public void start() {

		System.out.println("MotorCycle Engine was Started");
	}

	public void stop() {

		System.out.println("MotorCycle Engine was Stopped");
	}

}
