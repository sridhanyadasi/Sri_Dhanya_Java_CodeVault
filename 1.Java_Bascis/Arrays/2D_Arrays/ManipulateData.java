/* 3.Write a Java program that declare an integer 2D array in main method. Implement a method named 
manipulateData() that takes an integer 2D array as parameter and double the values in the array inside 
manipulateData(). Display the array in main method as well as in manipuateData() method and 
observe the result.  */

package com.te.twoDarrays;

public class ManipulateData {

	public static void manipulateData(int arr[][]) {
		for (int i=0; i<arr.length ; i++) {
			for (int j=0; j<arr[i].length ; j++) {
				System.out.print(" "+arr[i][j] * 2);
			}
		}
	}
	public static void main(String[] args) {

		int arr[][] = { {1,2,3} , {3,4,5} };
		
		System.out.println("Double the values in an array : ");
		manipulateData(arr);
		
	}

}
