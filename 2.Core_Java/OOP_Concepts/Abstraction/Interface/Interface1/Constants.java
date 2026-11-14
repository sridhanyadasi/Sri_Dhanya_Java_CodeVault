/* 3. Define an interface `Constants` with variables `PI` (set to 3.14) and `GRAVITY` (set to
9.81).Access and print the values of these variables in a main method. ( By default variables
in interface are ‘public’, ‘static’ and ‘final’ )  */

package com.te.interface1;

public interface Constants {
	
	public static final double pi = 3.14;
	
	public static final double gravity = 9.81;
	
	public static void main(String[] args) {
		
		System.out.println("Value of Pi :" +pi);
		
		System.out.println("Value of Gravity :" +gravity);
	}

}
