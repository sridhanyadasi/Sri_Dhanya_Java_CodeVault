/* 11.Develop a Java program to sort an array of characters in alphabetical order.  */

package com.te.arrays;

import java.util.Arrays;

public class SortCharArray {

	public static void main(String[] args) {
		
		char[] arr = {'j', 'h', 'o', 'e', 's', 'l'};
		
		System.out.println("Before Sorted Array : " +Arrays.toString(arr));
		
		for (char i=0; i<arr.length ; i++) {
			for (char j=0; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("\nSorted Character Array is : " +Arrays.toString(arr));
	}

}
