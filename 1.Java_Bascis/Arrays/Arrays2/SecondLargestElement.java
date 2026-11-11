/* 24.Write a Program to find the second largest number from the given array.
Ex: int a[] = {6,7,8,9,5,9}*/

package com.te.arrays1;

import java.util.Arrays;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		
		int a[] = {6,7,8,9,5,9};
		
		for (int i=0; i<a.length ; i++) {
			 for (int j=0; j<a.length ; j++) {
				 if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				 }
			 }
		}
		System.out.println("Sorted Array : " +Arrays.toString(a));
		System.out.println("Second Largest Element in an Array : " +a[a.length-2]);
	}

}
