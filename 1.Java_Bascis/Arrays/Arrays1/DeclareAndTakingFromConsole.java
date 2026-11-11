/*  2.Write a Java program to declare an array of integers, taking size and elements
 from the console and print the array elements. */

package com.te.arrays;

import java.util.Scanner;

public class DeclareAndTakingFromConsole {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a size of the elements :");
		
		int size = scan.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i< size ; i++) {
			System.out.println("Enter the array elements " +(i+1));
			array[i] = scan.nextInt();
		}
		
		System.out.println("Array Elements : " );
		for (int i=0; i<size ; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nSize of the Array is : " +size);

		
//        int[] array = new int[] {1,2,3,4,5} ;
//		
//		System.out.println(array.length);
//		
//		System.out.print(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]);
		
		
	}

}
