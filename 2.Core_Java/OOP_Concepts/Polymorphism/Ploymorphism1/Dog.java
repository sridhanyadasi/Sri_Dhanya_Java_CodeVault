/* 3. Create a base class Animal with a method makeSound(). Create subclasses Dog, Cat, and Cow that
override the makeSound() method. Write a program to demonstrate runtime polymorphism by
creating instances of these subclasses using the Animal type and calling the makeSound() method.
Animal myDog = new Dog(); Animal myCat = new Cat(); Animal myCow = new Cow(); */


package com.te.polymorphism;

public class Dog extends Animal{


	public void makeSound() {
		System.out.println("Dog is making Sound like Boww Boww...");
	}
}
