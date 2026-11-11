/* 15.Develop a program to reverse the elements of an array.  */

package com.te.arrays1;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		
		System.out.println("Original Array :" +Arrays.toString(arr));
		
		System.out.println("\nReverse Array :");
		for (int i=arr.length-1 ; i>=0 ; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
