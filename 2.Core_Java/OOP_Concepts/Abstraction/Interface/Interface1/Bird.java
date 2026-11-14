/* 4. Define an interface `Animal` with default methods `eat()` and `sleep()`. Create another
interface `FlyingAnimal` that extends `Animal` and adds a default method `fly()`. Implement
both interfaces in a class `Bird` and provide implementations for all methods. */

package com.te.interface1;

public class Bird implements Animal, FlyingAnimal{

	
	public void sleep() {
		System.out.println("Bird is Sleeping.....");
	}
	
	public void eat() {
		System.out.println("Bird is Eating.....");
	}
	
	public void fly() {
		System.out.println("Bird is Flying.....");
	}
}
