/* Task 2: Remove Element from Array
Write a Java program to remove an element from a specific index in an array.
Initial array: {5, 15, 25, 35, 45}
Remove element at index 3
Expected output: {5, 15, 25, 45} */

package com.te.oneDArrays1;

import java.util.Arrays;

public class RemoveElemInArray {
		
	public static void main(String[] args) {
		
		int index = 3;
		int[] arr = new int[] {5, 15, 25, 35, 45};
   	    
		int[] newArr = new int[arr.length - 1];

	    for (int i=0 , j=0; i<arr.length  ; i++) {
	    		
	    	if(i == index) {
	    		continue;   //skip the element at the given index
	    	}
	    	newArr[j++] = arr[i]; //Copy elem to new array
	    	  
	    }
		System.out.println("Add element 25 at index 2 : "  +Arrays.toString((newArr)));

	    }
	}

