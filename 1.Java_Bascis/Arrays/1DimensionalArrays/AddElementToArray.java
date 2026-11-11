/* Write a Java program to add an element at a specific position in an array.
Initial array: {10, 20, 30, 40, 50}
Add element 25 at index 2
Expected output: {10, 20, 25, 30, 40, 50} */

package com.te.oneDArrays1;

import java.util.Arrays;

public class AddElementToArray {
		
	public static void main(String[] args) {
		
		int index = 2;
		int[] arr = new int[] {10 , 20 , 30 , 40 , 50};
   	    int elem = 25;
   	    
		int[] newArr = new int[arr.length + 1];

	    for (int i=0; i<arr.length  ; i++) {
	    		
	    	  newArr[i] = arr[i];
	    	  }
	    
	    newArr[index] = elem;
	    for (int i= index ; i<arr.length; i++) {
	    	newArr[i+1] = arr[i];
	    }
		System.out.println("Add element 25 at index 2 : "  +Arrays.toString((newArr)));

	    }
	}

