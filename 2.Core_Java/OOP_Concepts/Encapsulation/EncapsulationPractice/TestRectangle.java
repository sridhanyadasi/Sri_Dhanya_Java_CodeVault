/* 3. Write a Java program to create a class called Rectangle with private instance variables length and width.
Provide public getter and setter methods to access and modify these variables. */
 

package com.te.encapsulationPractice;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		 rect.setLength(5);
		 rect.setWidth(4);
		 
		 System.out.println("Length :" +rect.getLength()+ "\nWidth :" +rect.getWidth());
		 rect.display();
		 System.out.println("Perimeter :" +rect.calculatePerimeter());
	}

}
