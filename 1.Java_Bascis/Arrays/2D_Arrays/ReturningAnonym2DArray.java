/* 5.Write a Java program that calls a method named returningAnonymously() in main() method. 
Implement a return type method named returningAnonymously() which returns an anonymous integer 
2D array. Display the returned array in main() method.  */

package com.te.twoDarrays;

import java.util.Arrays;

public class ReturningAnonym2DArray {

	
	public static int[][] returningAnonymously(){
		return new int[][] { { 4,5,6} , { 2,3,4 } } ;
	}
	public static void main(String[] args) {

		int[][] arr = returningAnonymously();
		System.out.println("Returning Anonymous 2D Array :");
		
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
		

	}

}
