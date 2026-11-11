/* 4.Write a Java program that passes an anonymous 2D array to a method named 
passingAnonymously() that called in main method. Implement a method named 
passingAnonymously() that takes an integer 2D array as a parameter and print the elements of the 
array.  */

package com.te.twoDarrays;

import java.util.Arrays;

public class PassingAnonymous2Darray {

	public static void passingAnonymously(int[][] arr) {
		
		for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
	}
	public static void main(String[] args) {

		System.out.println("Passing Anonymous Array : ");
		passingAnonymously(new int[][] { { 1,2,3 } , {4,5,6} });
	}

}
