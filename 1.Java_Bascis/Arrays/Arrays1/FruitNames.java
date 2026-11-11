/* 3.Create a Java program to initialize an array of strings with names of fruits. Retrieve and print the
third fruit from the array. Also, replace the second fruit with "Banana" and print the modified array. */

package com.te.arrays;

import java.util.Arrays;

public class FruitNames {
	
	public static void main(String[] args) {
		
		String[] array = new String[] {"Mango" , "Apple", "Guava", "Orange", "Grapes" };
		
	//	System.out.println(Arrays.toString(array));
		System.out.println(array[2]);

		
		array[2] = "Banana";
		System.out.println("\nModified Array : " +Arrays.toString(array));
	}

}
