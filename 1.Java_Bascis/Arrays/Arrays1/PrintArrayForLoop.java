/* 5.Develop a Java program that initializes an array of integers with values {10, 20, 30, 40, 50} and prints 
each element in the array using a for loop. */

package com.te.arrays;

public class PrintArrayForLoop {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30 , 40, 50};
		
		System.out.println("Elements in an Array :\n");
		
		for (int i=0; i<5 ; i++) {  // Using for loop
			int result = arr[i] * arr[i];
			System.out.print(result + " ");
		}
	}

}
