/* 4. Define an interface `Animal` with default methods `eat()` and `sleep()`. Create another
interface `FlyingAnimal` that extends `Animal` and adds a default method `fly()`. Implement
both interfaces in a class `Bird` and provide implementations for all methods. */

package com.te.interface1;

public interface Animal {
	
	public default void eat() {
		System.out.println("Animal is Eating");
	}
	
	public default void sleep() {
		System.out.println("Animal is Sleeping");
	}
}
