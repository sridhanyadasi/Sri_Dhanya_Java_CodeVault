/* 1.Write a Java program to calculate the sum of elements in an integer 2D array. Implement a method 
named calculateSum() that takes an integer 2d array as input and returns the sum of the elements. 
The program should display the sum. */

package com.te.twoDarrays;

public class SumOfElem2D {

	public int calculateSum(int arr[][]) {
		
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length ; j++) {
			
				sum += arr[i][j];
			}
		}	
	return sum;
	}
	
	public static void main(String[] args) {
		
		int arr[][] = new int[][] { {1,2,3} , {4,5,6} };

		SumOfElem2D sum = new SumOfElem2D();
		
		System.out.println("Sum of the elements : " +sum.calculateSum(arr));
	}

}









/*
 * arr.length gives the total number of rows in the 2D array.
 * 
 * arr[i].length gives the number of columns in the specific row i
 */
