/*  8.Write a Java program that declares integer array of five elements as final and follow below 
scenarios and observe the result. 
a) Modify the elements in the final array and display the array 
b) Modify the final array by assigning another array to it and display the array */

package com.te.oneDarrays;

import java.util.Arrays;

public class FinalArray {

	public static void main(String[] args) {

		int[] arr1 = new int[] {6, 18, 24, 28, 13};
		final int[]arr2 = new int[] {1, 5, 33, 6, 10};
		
		System.out.println("Original Array : " +Arrays.toString(arr1));
		System.out.println("Original Final Array : " +Arrays.toString(arr2));
	
		
		//a) Modify the elements in the final array and display the array 
		
		arr2[3] = 30;
		System.out.println("\nModified Array :" +Arrays.toString(arr2));
		
		//b) Modify the final array by assigning another array to it and display the array */

		arr1 = arr2;
		System.out.println("\nAssigning final array to another array : " +Arrays.toString(arr1));
		
		//arr2 = arr1; // we can't assign normal array to final array, but we assign values from final to normal
				
		}
}

