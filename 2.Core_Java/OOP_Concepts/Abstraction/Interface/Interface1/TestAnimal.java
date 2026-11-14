package com.te.interface1;

public class TestAnimal {

	public static void main(String[] args) {

		FlyingAnimal bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
		bird.glow();
		FlyingAnimal.jump();
	}

}
