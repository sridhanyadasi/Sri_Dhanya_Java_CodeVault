/* 7. Create an interface `Shape` with a method `draw()`. Implement this interface in classes
`Circle`, `Rectangle`, and `Triangle`. Write a program that uses a single reference of type
`Shape` to call the `draw()` method on instances of these classes. Hint: Implement the
`Shape` interface in each class and override the `draw()` method. Shape obj = new Circle(); ,
Shape obj2 = new Rectangle(); , Shape obj3 = new Triangle() */

package com.te.interface2;

public class TestShape {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		circle.draw();
		
		Shape rect = new Rectangle();
		rect.draw();
		
		Shape tri = new Triangle();
		tri.draw();
		

	}

}
