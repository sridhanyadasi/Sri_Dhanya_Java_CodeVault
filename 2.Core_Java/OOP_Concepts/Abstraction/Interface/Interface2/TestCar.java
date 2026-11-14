/* Finally, in your main method, instantiate an object of the `Car` class and demonstrate the
usage of each behavior method (`move()`, `stop()`, `honk()`, `floatOnWater()`). */

package com.te.interface2;

public class TestCar {

	public static void main(String[] args) {

		Amphibious car = new Car();
		car.move();
		car.honk();
		car.floatOnWater();
		car.stop();
	}

}
