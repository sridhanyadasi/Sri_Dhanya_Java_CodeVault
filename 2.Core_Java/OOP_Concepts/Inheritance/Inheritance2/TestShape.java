package com.te.inheritance1;

public class TestShape {

	public static void main(String[] args) {
		
		Circle circle = new Circle("Red", 5, 3.14 );
		circle.getArea();
		
		Rectangle rectangle = new Rectangle();
		rectangle.length = 5;
		rectangle.width = 4;
		rectangle.color = "Black";
		rectangle.display();
		
		Triangle triangle = new Triangle();
		triangle.base = 5;
		triangle.height = 7;
		triangle.color = "Blue";
		triangle.display();
	}

}
