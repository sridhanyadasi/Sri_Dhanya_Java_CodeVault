/* 3.Create a `Shape` class with common properties like `color` and methods like
`getArea()`. Then, create subclasses like `Circle`, `Rectangle`, and `Triangle` that
inherit from `Shape` and implement specific methods to calculate their respective areas.*/

package com.te.inheritance1;

public class Rectangle extends Shape {
	
	int length; 
	int width;
	
	public void display() {
		int areaOfRectangle = length * width;
		System.out.println("Color of the Reactangle : " +color+ "\nLength : "+length+ "\nWidth :"+width+ "\nArea of the Rectangle :" +areaOfRectangle );
	}

}
