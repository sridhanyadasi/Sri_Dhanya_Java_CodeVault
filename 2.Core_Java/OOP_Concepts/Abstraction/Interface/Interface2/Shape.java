/* 7. Create an interface `Shape` with a method `draw()`. Implement this interface in classes
`Circle`, `Rectangle`, and `Triangle`. Write a program that uses a single reference of type
`Shape` to call the `draw()` method on instances of these classes. Hint: Implement the
`Shape` interface in each class and override the `draw()` method. Shape obj = new Circle(); ,
Shape obj2 = new Rectangle(); , Shape obj3 = new Triangle() */

package com.te.interface2;

public interface Shape {
	
	public void draw();  // in interfaces didn't have implementation for abstract methods.  But, without using abstract keyword 
	                     // bcz by default jvm provide abstract keyword for the abstract methods in interfaces.

}
