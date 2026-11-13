/* 7. Add a write-only attribute `password` to a `User` class. Provide a setter method to set the
password, but do not provide a getter method.
Hint: Only create a setter method for the `password` attribute. */

package com.te.encapsulation1;

public class TestPassword {

	public static void main(String[] args) {

		User user = new User();
		user.setPassword(25123);

	}

}
