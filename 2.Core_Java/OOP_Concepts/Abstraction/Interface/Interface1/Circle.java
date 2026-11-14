/* 1. Define an interface `Shape` with a default method `draw()` that prints &quot;Drawing a shape&quot;.
Implement this interface in a class `Circle` and override the `draw()` method to print
&quot;Drawing a circle&quot;.*/

package com.te.interface1;

public class Circle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}

}
