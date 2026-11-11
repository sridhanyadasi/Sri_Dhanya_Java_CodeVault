/* 17.Write a program to find the intersection of two arrays (i.e., common elements). */

package com.te.arrays1;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {

		int[] arr1 = {1,1,2,2,3,3,4};
		int[] arr2 = {1,2,2,3,4,6,8};
		int count = 0;
		
		System.out.println("Intersection of two Arrays : ");

			for (int i = 0; i < arr1.length; i++) {
	            if (i > 0 && arr1[i] == arr1[i - 1]) {
	                continue; // Skip duplicate elements in arr1
	            }
			
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    System.out.print(" " + arr1[i]);
	                    count++;
	                    break; // Move to next arr1 element after finding a match
	                }
	            }
			}
	        
	        System.out.println("\nCount: " + count);
	    }
	
}	
	
		


