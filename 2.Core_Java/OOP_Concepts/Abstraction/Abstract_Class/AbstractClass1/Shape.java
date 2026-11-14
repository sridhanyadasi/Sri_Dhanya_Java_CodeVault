/* 1. Create an abstract class `Shape` with abstract methods `calculateArea()` and
`calculatePerimeter()`. Implement concrete subclasses such as `Circle`, `Rectangle`, and
`Triangle` that extend `Shape` and provide implementations for the abstract methods.In a
graphics application, the `Shape` hierarchy can be used to represent various geometric
shapes like circles, rectangles, and triangles, allowing users to calculate their areas and 
perimeters. */

package com.te.abstractClass;

public abstract class Shape {

	public abstract void calculateArea() ;
	
	public abstract void calculatePerimeter() ;
		
}
