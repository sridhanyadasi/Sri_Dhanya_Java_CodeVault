/* 16.Create a program to concatenate two arrays of integers.  */

package com.te.arrays1;

import java.util.Arrays;

public class ConcatenateOf2Arrays {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4,5};  //right rotate
		int[] arr2 = {6, 7, 8, 9};
		int[] concatenatedArr = new int[arr1.length + arr2.length];
		
		for(int i=0 ; i<arr1.length ; i++) {
			concatenatedArr[i] = arr1[i];
		}
		
		for(int j=0 ; j<arr2.length ; j++) {
			concatenatedArr[arr1.length + j] = arr2[j];
		}
		
		System.out.println(Arrays.toString(concatenatedArr));

	}

}
