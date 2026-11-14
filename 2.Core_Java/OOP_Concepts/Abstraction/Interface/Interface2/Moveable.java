/*  6. Your task is to design a set of interfaces to represent these behaviors and the amphibious
capability. Each interface should define one specific behavior.

- Interface 1: `Moveable` - Define a method `void move()` representing the ability to move.

- Interface 2: `Stoppable` - Define a method `void stop()` representing the ability to stop.

- Interface 3: `Honkable` - Define a method `void honk()` representing the ability to honk.

- Interface 4: `Amphibious` - This interface should extend `Moveable` and `Stoppable`. -
Additionally, define a method `void floatOnWater()` representing the ability to float on
water.

Now, consider a class `Car` that represents a specific vehicle type. Design the `Car` class to
implement the necessary interfaces to exhibit the behaviors of moving, stopping, and
honking. Ensure that the `Car` class provides appropriate implementations for all the
methods defined in the interfaces it implements.

Finally, in your main method, instantiate an object of the `Car` class and demonstrate the
usage of each behavior method (`move()`, `stop()`, `honk()`, `floatOnWater()`).  */


package com.te.interface2;

public interface Moveable {
	
	public void move();

}
