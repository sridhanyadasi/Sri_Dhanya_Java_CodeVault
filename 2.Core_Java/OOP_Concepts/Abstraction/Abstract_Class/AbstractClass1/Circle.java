/* 1. Create an abstract class `Shape` with abstract methods `calculateArea()` and
`calculatePerimeter()`. Implement concrete subclasses such as `Circle`, `Rectangle`, and
`Triangle` that extend `Shape` and provide implementations for the abstract methods.In a
graphics application, the `Shape` hierarchy can be used to represent various geometric
shapes like circles, rectangles, and triangles, allowing users to calculate their areas and 
perimeters. */

package com.te.abstractClass;

public class Circle extends Shape{
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void calculateArea() {
		double pi = 3.14;

		double areaOfCircle = pi * radius * radius;
		System.out.println("Area of the Circle : " +areaOfCircle);
	}
	
	public void squareRadius() {
		System.out.println("Square of Radius");
	}
	
	public void calculatePerimeter() {
		double pi = 3.14;

		double areaOfPerimeter = 2 * pi * radius;
		System.out.println("Perimeter of Circle : " +areaOfPerimeter);
	}
}
