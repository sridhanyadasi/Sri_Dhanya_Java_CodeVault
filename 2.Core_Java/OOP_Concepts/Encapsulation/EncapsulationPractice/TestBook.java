package com.te.encapsulationPractice;

public class TestBook {

	public static void main(String[] args) {

		Book book = new Book();
		
		book.setTitle("Titus");
		book.setAuthor("Paul");
		book.setPrice(35.0);
		book.applyDiscount(10);

		System.out.println("Title :"+book.getTitle()+ "\nAuthor: "+book.getAuthor()+ "\nPrice :$"+book.getPrice());
	}

}
