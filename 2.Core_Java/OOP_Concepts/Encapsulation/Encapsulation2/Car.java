/* 6. Create a `Car` class to have a read-only attribute `VIN` (Vehicle Identification Number). Provide a
constructor to set the `VIN` when an instance of the `Car` class is created and do not provide a setter
method for `VIN`.

Hint: Initialize the `VIN` attribute in the constructor and provide only a getter method.

In this context, "read-only" means that once the VIN is set through the constructor, its value cannot be
changed. The absence of a setter method ensures the immutability of the VIN attribute.

Even though the VIN is set via the constructor, it is still considered read-only because this setting is a
one-time operation performed at object creation and not modifiable thereafter.

The class can be considered to have a read-only VIN attribute because the VIN is immutable after the
object is instantiated.  */

package com.te.encapsulation1;

public class Car {
	
	private int VIN;
	
	public Car (int VIN) {
		this.VIN = VIN;
	}
	
	public int getVIN() {
		return VIN;
	}
	
}
