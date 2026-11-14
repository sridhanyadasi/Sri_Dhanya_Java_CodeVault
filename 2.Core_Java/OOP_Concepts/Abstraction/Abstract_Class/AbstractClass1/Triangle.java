/* 1. Create an abstract class `Shape` with abstract methods `calculateArea()` and
`calculatePerimeter()`. Implement concrete subclasses such as `Circle`, `Rectangle`, and
`Triangle` that extend `Shape` and provide implementations for the abstract methods.In a
graphics application, the `Shape` hierarchy can be used to represent various geometric
shapes like circles, rectangles, and triangles, allowing users to calculate their areas and 
perimeters. */

package com.te.abstractClass;

public class Triangle extends Shape{
	
	private int base;
	private int height;
	private int a;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public void calculateArea() {
		
		int areaOfTriangle = (base * height )/2;
		System.out.println("Area of Triangle : " +areaOfTriangle);
	}
	
	public void calculatePerimeter() {
		
		int areaOfPerimeter = a + a + a;
		System.out.println(" Perimeter of Triangle  :" +areaOfPerimeter);
	}

}
