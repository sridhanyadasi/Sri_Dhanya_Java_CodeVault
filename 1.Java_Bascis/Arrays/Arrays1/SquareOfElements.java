/* 8.Write a Java program that defines a method to take an integer array as a parameter and return the 
array which is square of all elements in that array.  */

package com.te.arrays;

import java.util.Arrays;

public class SquareOfElements {

	public int[] square(int arr[]) {
	
		int[] SquareArray = new int[arr.length] ;

		for (int i=0; i<arr.length; i++) {
			SquareArray[i] = arr[i]*arr[i];
			//SquareArray[i] = arr[i]*2; //double the array			
		}
		return SquareArray;
	}

	public static void main(String[] args) {

		SquareOfElements Mul = new SquareOfElements();
		
		int arr[] =  {2,4,3,5,6};
		
		int[] SquareArray = Mul.square(arr);
		
		System.out.println("Original Array : " +Arrays.toString(arr));
		
		System.out.println("Squares of all Elements : " +Arrays.toString(SquareArray));
	}

}
