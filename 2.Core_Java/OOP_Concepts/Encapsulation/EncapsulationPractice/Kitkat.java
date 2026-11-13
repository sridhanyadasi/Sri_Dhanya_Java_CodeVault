package com.te.encapsulationPractice;

public class Kitkat extends Candy {

	private String name;
	
	public Kitkat(int cost , String color, String name) {
		super(cost, color);
		this.name = name;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
