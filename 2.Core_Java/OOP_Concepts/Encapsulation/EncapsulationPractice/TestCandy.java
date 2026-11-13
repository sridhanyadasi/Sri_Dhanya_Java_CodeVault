package com.te.encapsulationPractice;

public class TestCandy {

	public static void main(String[] args) {
		
		Kitkat kitkat = new Kitkat(120,"Chocolate color",  "Kitkat" );
		Candy kit = new Kitkat(220,"Chocolate color",  "Kitkat" );
		
		kit.setColor("Black");
		
		System.out.println("cost :" +kit.getCost()+ "Color:" +kit.getColor());
		System.out.println("name :" +kitkat.getName());
		kit.eat();
	}
}
