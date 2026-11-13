/* 3. Write a Java program to create a class called Rectangle with private instance variables length and width.
Provide public getter and setter methods to access and modify these variables. */

package com.te.encapsulationPractice;

public class Rectangle {

	private int length ;
	private int width;

	int rectangle;
	public int getLength () {
		return length;
	}
	
	public int getWidth () {
		return width;
	}
	
	public void setLength (int length) {
		this.length = length;
	}
	
	public void setWidth (int width) {
		this.width = width;
	}
	
	public void display () {
		rectangle = length * width;
		System.out.println("Area :" +rectangle);
	}
	
	public int calculatePerimeter() {
		return 2 * (length * width);
	}
}
