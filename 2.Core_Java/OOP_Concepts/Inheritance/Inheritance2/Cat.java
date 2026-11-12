/* 4.Define an `Animal` class with attributes like `name` and `sound`, and then create
subclasses like `Dog`, `Cat`, and `Bird` that inherit from `Animal` and define specific
behaviors or sounds for each animal.*/

package com.te.inheritance1;

public class Cat extends Animal{
	
	public Cat (String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public void display() {
		System.out.println("Name of the Animal is :"+name+ "\nMaking Sound : "+sound);
	}
}
