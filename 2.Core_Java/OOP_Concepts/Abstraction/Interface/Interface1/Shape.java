/* 1. Define an interface `Shape` with a default method `draw()` that prints &quot;Drawing a shape&quot;.
Implement this interface in a class `Circle` and override the `draw()` method to print
&quot;Drawing a circle&quot;.*/

package com.te.interface1;

public interface Shape {

	public default void draw() {     // Default methods have implementation in interface. So, definitely we should give body to default methods in interfaces.
		System.out.println("Drawing a Shape");
	}
}
