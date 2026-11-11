/*  4.Write a Java program that passes an anonymous array to a method named passingAnonymously()
that called in main method. Implement a method named passingAnonymously() that takes an integer
array as a parameter and print the elements of the array. */

package com.te.oneDarrays;

import java.util.Arrays;

public class PassingAnonymousArray {

    // Method that accepts an array as parameter and prints elements

	public static void passingAnonymously(int[] arr) {
		
		System.out.println("Anonymous Array : ");
		for(int num : arr) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 , 5};
		
        // Passing the array to method
		passingAnonymously(arr);

	}
}
