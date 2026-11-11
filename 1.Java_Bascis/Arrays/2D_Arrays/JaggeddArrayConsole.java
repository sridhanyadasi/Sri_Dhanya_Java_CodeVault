/* 11.Write a Java program to read elements from the console for a jagged array and print the elements.*/

package com.te.twoDarrays;

import java.util.Scanner;

public class JaggeddArrayConsole {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter row size of the array : ");
		int rowsize = scan.nextInt();
		
		int[][] arr = new int[rowsize][];
		
		for (int i = 0; i < rowsize; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int columnsize = scan.nextInt();
            arr[i] = new int[columnsize]; // Allocate variable column sizes
        }
		
		System.out.println("Enter elements in an array : ");
		for(int i=0; i<rowsize ; i++) {
			for (int j=0; j<arr[i].length; j++) {
			  	arr[i][j] = scan.nextInt();
			}
		}
		

		for(int i=0; i<rowsize ; i++) {
			for (int j=0; j<arr[i].length ; j++) {

				System.out.print(" " +arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
