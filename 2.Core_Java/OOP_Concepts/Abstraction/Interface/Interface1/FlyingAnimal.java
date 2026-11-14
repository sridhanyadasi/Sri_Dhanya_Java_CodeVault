/* 4. Define an interface `Animal` with default methods `eat()` and `sleep()`. Create another
interface `FlyingAnimal` that extends `Animal` and adds a default method `fly()`. Implement
both interfaces in a class `Bird` and provide implementations for all methods.  */

package com.te.interface1;

public interface FlyingAnimal extends Animal , Interface1{
	
	public default void fly() {
		System.out.println("Animal is Flying ");
	}

	public static void jump() {
		System.out.println("Animal is Jumping");
	}
	
	public default void glow() {
		System.out.println("Anmal is glowing ");
	}
}
