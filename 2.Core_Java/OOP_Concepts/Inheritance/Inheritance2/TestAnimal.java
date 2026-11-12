package com.te.inheritance1;

public class TestAnimal {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Dog", "Bowww Bowww");
		dog.sounds();
		dog.display();
		
		Cat cat = new Cat("Cat", "Meowww");
		cat.sounds();
		cat.display();
		
		Bird bird = new Bird("Cuckoo", "cu-cooo  cu-cooo");
		bird.sounds();
		bird.display();
	}

}
