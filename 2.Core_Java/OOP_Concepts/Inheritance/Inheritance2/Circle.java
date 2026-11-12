/* 3.Create a `Shape` class with common properties like `color` and methods like
`getArea()`. Then, create subclasses like `Circle`, `Rectangle`, and `Triangle` that
inherit from `Shape` and implement specific methods to calculate their respective areas.*/

package com.te.inheritance1;

public class Circle extends Shape {
	 
	int radius;
	double pi;
	
	public Circle(String color, int radius , double pi) {
		this.color = color;
		this.radius = radius;
		this.pi = pi;
	}
	
	public void getArea() {
		double areaOfCircle = pi * radius * radius;
		System.out.println("Color of the circle is : "+color+"\nRadius of the circle :" +radius+ "\nPi value :"+pi+ "\nArea of the Circle :"+areaOfCircle);
	}
}
