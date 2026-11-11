/* 7.Write a Java program that copies the elements of an 2D array to another 2D array by following 
below scenarios and observe whether shallow copy occurs or deep copy occurs 
a) By copying each element 
b) By using Arrays.copyOf() 
c) By using clone() 
d) By directly assigning the array variable to another array  */

package com.te.twoDarrays;

import java.util.Arrays;

public class ShallowAndDeepCopiesOf2DArrays {

	public static void main(String[] args) {

		int arr1[][] = { { 6, 33} , { 28, 18 } } ;
		int arr2[][] = new int[arr1.length][arr1[0].length];
	
		
		// a) By copying each element 

		System.out.println("Original Array1 : " +Arrays.deepToString(arr1));
		System.out.println("Original Array2 : " +Arrays.deepToString(arr2));
		
        for (int i = 0; i < arr1.length; i++) {
            System.arraycopy(arr1[i], 0, arr2[i], 0, arr1[i].length);
        }
        
		arr1[0][1] = 3;
		arr2[1][0] = 4;
		
		System.out.println("\nCopying Each Element of Array1 : " +Arrays.deepToString(arr1));
		System.out.println("Copying Each Element of  Array2 : " +Arrays.deepToString(arr2));
		
		// b) By using Arrays.copyOf() 

		System.out.println("\nOriginal Array1 : " +Arrays.deepToString(arr1));
		System.out.println("Original Array2 : " +Arrays.deepToString(arr2));
		
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = Arrays.copyOf(arr1[i], arr1[i].length); 

        }
      
		arr1[0][1] = 30;		
		arr2[1][0] = 40;
		
		System.out.println("\nCopy of method Array1 : " +Arrays.deepToString(arr1));
		System.out.println("Copy of method  Array2 : " +Arrays.deepToString(arr2));
		
		// c) By using clone() 

		System.out.println("\nOriginal Array1 : " +Arrays.deepToString(arr1));
		System.out.println("Original Array2 : " +Arrays.deepToString(arr2));
		
        for (int i = 0; i < arr1.length; i++) {
        	arr2[i] = arr1[i].clone();
        }
      
		arr1[0][1] = 50;		
		arr2[1][0] = 70;
		
		System.out.println("\nClone  method of Array1 : " +Arrays.deepToString(arr1));
		System.out.println("Clone method of  Array2 : " +Arrays.deepToString(arr2));
		
		// d) By directly assigning the array variable to another array 
		
		System.out.println("\nOriginal Array1 : " +Arrays.deepToString(arr1));
		System.out.println("Original Array2 : " +Arrays.deepToString(arr2));
		
        for (int i = 0; i < arr1.length; i++) {
        	for (int j=0; j<arr1[i].length ; j++) {
        	arr2[i][j] = arr1[i][j];
        }
      }
      
		arr1[0][1] = 12;		
		arr2[1][0] = 10;
		
		System.out.println("\nCopy of method Array1 : " +Arrays.deepToString(arr1));
		System.out.println("Copy of method  Array2 : " +Arrays.deepToString(arr2));
		
		
		
	}

}
