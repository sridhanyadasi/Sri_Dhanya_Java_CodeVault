/* 7. Add a write-only attribute `password` to a `User` class. Provide a setter method to set the
password, but do not provide a getter method.
Hint: Only create a setter method for the `password` attribute. */

package com.te.encapsulation1;

public class User {
	
	private int password;
	
	public void setPassword (int password) {
		this.password = password;
		
		if (password == 123) {
			System.out.println("Access Granted");
		}
		else {
			System.out.println("Access Denied");
		}
	}


}
