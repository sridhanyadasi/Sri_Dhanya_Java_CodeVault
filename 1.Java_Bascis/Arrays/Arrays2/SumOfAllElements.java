/* 13.Write a program to calculate the sum of all elements in an array of integers.  */

package com.te.arrays1;

public class SumOfAllElements {

	public static void main(String[] args) {
		
		int sum = 0;

		int arr[] = {2,5,6,1};
		
		for (int i=0; i<arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of all elements in an Array : " +sum);
	}

}
