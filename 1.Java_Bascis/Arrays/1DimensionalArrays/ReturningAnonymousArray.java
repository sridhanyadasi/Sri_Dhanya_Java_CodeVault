/* 5 .Write a Java program that calls a method named returningAnonymously() in main() method. 
Implement a return type method named returningAnonymously() which returns an anonymous integer 
array. Display the returned array in main() method. */

package com.te.oneDarrays;

import java.util.Arrays;

public class ReturningAnonymousArray {

	public int[] returningAnonymously() {
		return new int[] {3,4,5,6,8};
	}
	public static void main(String[] args) {

		 ReturningAnonymousArray obj = new ReturningAnonymousArray();

	        // Call the method and display the returned array
	        System.out.println("Returning Anonymous Array: " + Arrays.toString(obj.returningAnonymously()));
		//System.out.println("Returning Anonymous Array :" +Arrays.toString(new int[] {3,4,5,6,8}));
	}

}
