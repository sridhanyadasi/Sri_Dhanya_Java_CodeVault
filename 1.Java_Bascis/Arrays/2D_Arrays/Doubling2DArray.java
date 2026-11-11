/*  2.Write a Java program to double the elements in an integer 2D array. Implement a method named 
doubleValues() that takes an integer 2D array as parameter and returns an array containing the 
doubled elements. The program should display the doubled elements in the array.  */

package com.te.twoDarrays;

public class Doubling2DArray {

	public int[][] doubleValues(int[][] arr) {
		
		int[][] doubleArr = new int[arr.length][];
		for (int i=0; i<arr.length ; i++) {
			doubleArr[i] = new int[arr[i].length];
			for (int j=0; j<arr[i].length ; j++) {
			
				doubleArr[i][j] = arr[i][j]*2;
			}
		}
		return doubleArr;
	}
	public static void main(String[] args) {

		int arr[][] = { { 2,3 } , { 4,5 } } ;
		
		Doubling2DArray doubleV = new Doubling2DArray();
		
		int doubleArr[][] = doubleV.doubleValues(arr);

		System.out.println("Doubling an 2 D Array : ");
		
		for (int i=0; i<doubleArr.length ; i++) {
			for (int j=0; j<doubleArr[i].length ; j++) {
				System.out.print(" " +doubleArr[i][j]);
			}
		}
	}

}
