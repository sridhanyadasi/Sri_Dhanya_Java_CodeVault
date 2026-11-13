/* 3. Create a base class Animal with a method makeSound(). Create subclasses Dog, Cat, and Cow that
override the makeSound() method. Write a program to demonstrate runtime polymorphism by
creating instances of these subclasses using the Animal type and calling the makeSound() method.
Animal myDog = new Dog(); Animal myCat = new Cat(); Animal myCow = new Cow();  */

package com.te.polymorphism;

public class Cat extends Animal{


	 protected void makeSound() {
		System.out.println("Cat is making Sound like Meoww Meoww...");
	}
}
