/* 3.Create a `Shape` class with common properties like `color` and methods like
`getArea()`. Then, create subclasses like `Circle`, `Rectangle`, and `Triangle` that
inherit from `Shape` and implement specific methods to calculate their respective areas.*/

package com.te.inheritance1;

public class Triangle extends Shape {
	
	int base;
	int height;
	
	public void display() {
		float areaOfTriangle =(float)(base * height)/2;
		System.out.println("Color of the Tritangle : " +color+ "\nBase : "+base+ "\nHeight :"+height+ "\nArea of the Triangle :" +areaOfTriangle );
	}
}
