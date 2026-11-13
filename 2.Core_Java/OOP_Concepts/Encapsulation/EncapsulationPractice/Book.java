/* 8. Write a Java program to create a class called “Book” with private instance variables title,
author, and price. Provide public getter and setter methods to access and modify these variables.
Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.*/

package com.te.encapsulationPractice;

public class Book {

	private String title;
	private String author;
	private double price;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void applyDiscount(double percentage) {
		
		if(percentage >0 && percentage <= 100) {
			this.price = price - price * (percentage/100);
		}
	}
}
