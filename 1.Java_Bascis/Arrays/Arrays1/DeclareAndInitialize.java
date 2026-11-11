/*1.Write a Java program to declare an array of integers, initialize it with 
 values {1, 2, 3, 4, 5}, and print the array elements. */

package com.te.arrays;

public class DeclareAndInitialize { 

	public static void main(String[] args) {

		int[] array = new int[5] ;
		
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		System.out.println("Array Elements : " +array[0] +" " +array[1] +" " +array[2] +" " +array[3] +" " +array[4]);			
	
//        int[] arr =  {1,2,3, 4, 5}; //Direct Initialization
//		
//		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+ " " +arr[3]+ " "+arr[4]);
	
	}
}
