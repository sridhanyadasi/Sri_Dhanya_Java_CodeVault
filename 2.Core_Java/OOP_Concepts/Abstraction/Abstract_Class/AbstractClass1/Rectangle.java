/* 1. Create an abstract class `Shape` with abstract methods `calculateArea()` and
`calculatePerimeter()`. Implement concrete subclasses such as `Circle`, `Rectangle`, and
`Triangle` that extend `Shape` and provide implementations for the abstract methods.In a
graphics application, the `Shape` hierarchy can be used to represent various geometric
shapes like circles, rectangles, and triangles, allowing users to calculate their areas and 
perimeters. */

package com.te.abstractClass;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void calculateArea() {
		
		int areaOfRectangle = length * width;
		System.out.println("Area of the Rectangle : " +areaOfRectangle);
	}
	
	public void calculatePerimeter() {
		
		int areaOfPerimeter = 2 * length * width;
		System.out.println("Perimeter of Rectangle : " +areaOfPerimeter);
	}

}
