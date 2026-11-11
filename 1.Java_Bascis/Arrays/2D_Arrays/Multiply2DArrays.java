/*  9.Write a Java program by creating  a method called `multiply` that accepts a variable number of 
integer arguments as 2D array and returns the product of all the integers.  */

package com.te.twoDarrays;


public class Multiply2DArrays {

	public static int multiply(int[][] arr){
		int mul = 1;
		
		for (int i=0; i<arr.length ; i++) {
			for(int j=0; j<arr[i].length ; j++) {
			mul *= arr[i][j];
		}
    }
		return mul;			
}
	public static void main(String[] args) {


		int[][] arr = { {1,2,3 } , {1,2,3 } } ;
		
		System.out.println("Multiplication of an 2D Array : " +(multiply(arr)));
	}

}
