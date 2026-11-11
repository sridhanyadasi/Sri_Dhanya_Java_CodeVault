/* 6.Write a Java program that declares an integer array of five elements and print the corresponding 
class name of the declared array. */

package com.te.oneDarrays;

import java.util.Arrays;

public class CorrespondingDeclareArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		System.out.println("Corresponding Declared Array :" +Arrays.toString(arr));
		System.out.println("\nCorresponding Declared Array class name:" +arr);

	}

}
