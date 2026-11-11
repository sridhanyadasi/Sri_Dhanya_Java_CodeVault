/* 3.Write a Java program that declare an integer array in main method. Implement a void method
named manipulateData() that takes an integer array as parameter and double the values in the array
inside manipulateData(). Display the array in main method before calling and after calling
manipulateData() method and observe the result. */

package com.te.oneDarrays;

import java.util.Arrays;

public class DoubleArray {

	public void manipulateData(int[] arr) {
		System.out.println("After Doubling an Array :");
		for (int i=0; i<arr.length ; i++) {
		   System.out.print(" "+arr[i] *2);	
		}
	}
	
	public static void main(String[] args) {

		DoubleArray doubleArr = new DoubleArray();
		int[] arr = {2,4,5,6,7};
		System.out.println("Display Array Before Doubling : " +Arrays.toString(arr));
		
		doubleArr.manipulateData(arr);
	}
}
