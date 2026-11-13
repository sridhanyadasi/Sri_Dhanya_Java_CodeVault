package com.te.encapsulationPractice;

public class Candy {

	private int cost;
	private String color;
	
	public Candy(int cost, String color) {
		this.cost = cost;
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost= cost;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat() {
		System.out.println("Children's eating chocolates");
	}
}
