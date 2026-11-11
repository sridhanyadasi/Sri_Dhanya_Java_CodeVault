/* 7.Write a Java program that copies the elements of an array to another array by following below 
scenarios and observe whether shallow copy occurs or deep copy occurs 
a) By copying each element 
b) By using Arrays.copyOf() 
c) By using clone() 
d) By directly assigning the array variable to another array  */

package com.te.oneDarrays;

import java.util.Arrays;

public class ShalloAndDeepCopies {

	public static void main(String[] args) {

		int[] arr1 = new int[]{1,2,3,4,5};
		int[] arr2 = new int[arr1.length];
		
		System.out.println("Original Array1 : " +Arrays.toString(arr1));
		System.out.println("copied Array2 : " +Arrays.toString(arr2));
	
		// a) By copying each element
		
		for (int i=0; i<arr1.length ; i++) {
			//arr1[i] = arr2[i];
			arr2[i] = arr1[i];
		}
		
		System.out.println("\nOriginal Array1 : " +Arrays.toString(arr1));
		System.out.println("copied Array2 : " +Arrays.toString(arr2));
		
		arr1[2] = 9;
		arr2[3] = 10;   
		//deep copy	
		System.out.println("\nAfter copied each element of Array1 : " +Arrays.toString(arr1));
		System.out.println("After copied each element of Array2 : " +Arrays.toString(arr2));
		
		
		// b) By using Arrays.copyOf() 
		
		System.out.println("\nOriginal Array1 : " +Arrays.toString(arr1));
		System.out.println("copied Array2 : " +Arrays.toString(arr2));
		
		arr2 = Arrays.copyOf(arr1, arr1.length);
		
		arr2[4] = 7;
		arr1[0] = 33;   //deep copy
		
		System.out.println("\nAfter copied Array1 with copyOf method  : " +Arrays.toString(arr1));
		System.out.println("After copied Array2 with copyOf method : " +Arrays.toString(arr2));
		
		 System.out.println("\nOriginal array reference: " + arr1);  // both references are different
	        System.out.println("Shallow copy reference: " + arr2);
		   
		// c) By using clone() 		
		
		System.out.println("\nOriginal Array1 : " +Arrays.toString(arr1));
		System.out.println("copied Array2 : " +Arrays.toString(arr2));
		   
		arr2 = arr1.clone();
		
		arr1[3] = 18;
		arr2[2] = 28;   //deep copy
		
		System.out.println("\nAfter copied Array1 with clone method  : " +Arrays.toString(arr1));
		System.out.println("After copied Array2 with clone method : " +Arrays.toString(arr2));
	
		
		// d) By directly assigning the array variable to another array 
				
		 System.out.println("\nOriginal Array1 : " +Arrays.toString(arr1));
		 System.out.println("copied Array2 : " +Arrays.toString(arr2));
		   
		 arr1 = arr2; arr2 = arr1; arr1[0] = 3; arr2[3] = 2; //Shallow copy copy
		 
		 System.out.println("\nAfter Copied of Array1 directly assigned: " +Arrays.toString(arr1));
		 System.out.println("After Copied of Array2 directly assigned : "+Arrays.toString(arr2));	
		 
		 System.out.println("\nOriginal array reference: " + arr1);  // both the references are same
	        System.out.println("Shallow copy reference: " + arr2);
	}
}
