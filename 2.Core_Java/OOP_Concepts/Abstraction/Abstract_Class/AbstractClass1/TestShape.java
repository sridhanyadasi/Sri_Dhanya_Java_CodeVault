package com.te.abstractClass;

public class TestShape {

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		circle1.setRadius(5);
		circle1.calculateArea();
		circle1.calculatePerimeter();
		
		Shape circle = new Circle(); // data variables & methods from will get hide but methods from parent class will be overridden
		//circle.setRadius(5);
		circle.calculateArea();
		circle.calculatePerimeter();
		//circle.squareRadius();
		
		
		Rectangle rect = new Rectangle();
		rect.setLength(5);
	    rect.setWidth(4);
		rect.calculateArea();
		rect.calculatePerimeter();
		Shape rectangle = new Rectangle();
		
		rectangle.calculateArea();
		rectangle.calculatePerimeter();
		
		Shape triangle = new Triangle();
		

		triangle.calculateArea();
		triangle.calculatePerimeter();
	}

}
