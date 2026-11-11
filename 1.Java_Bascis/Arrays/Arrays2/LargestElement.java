/* 14.Create a program to find the largest element in an array of integers.  */

package com.te.arrays1;

public class LargestElement {

	public static void main(String[] args) {

		int[] arr = {3,55,7,8,68,74};
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}		
		System.out.println("Largest Element in an Array : " +arr[arr.length-1]);
	}
}
