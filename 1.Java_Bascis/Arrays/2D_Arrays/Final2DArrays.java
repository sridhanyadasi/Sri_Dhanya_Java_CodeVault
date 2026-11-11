/* 8.Write a Java program that declares integer 2D array of few elements as final and follow below 
scenarios and observe the result. 
a) Modify the elements in the final array and display the array 
b) Modify the final array by assigning another array to it and display the array */

package com.te.twoDarrays;

import java.util.Arrays;

public class Final2DArrays {

	public static void main(String[] args) {

		final int arr1[][] = { { 6,7,8 }, {3,4,5} };
		int arr2[][] = { {2,3,6 }, {8,9,7} };
		
		// a) Modify the elements in the final array and display the array 
         arr1[1][2] = 33;
		System.out.println("Modify Final Array Elements : " +Arrays.deepToString(arr1));
		
		//b) Modify the final array by assigning another array to it and display the array 
		
		arr2[0][1] = arr1[1][1];  //Elements will be modified but not the complte arrays will modified
		
		arr1[0][1] = arr2[1][1];

		//arr1 = arr2;   //we can't convert normal to final
		arr2 = arr1;    // we convert final to normal array
		
		System.out.println(" \nFinal array to another Array1 : " +Arrays.deepToString(arr2));
		
		System.out.println(" \nFinal array to another Array : " +Arrays.deepToString(arr1));
		
		
	}

}
