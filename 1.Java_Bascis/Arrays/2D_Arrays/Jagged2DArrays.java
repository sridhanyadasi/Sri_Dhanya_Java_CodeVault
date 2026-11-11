/*  10.Write a Java program to declare and initialise a jagged array and print the elements. */

package com.te.twoDarrays;

public class Jagged2DArrays {
	
	public static void main(String[] args) {
		
		int array[][] = new int[3][];
		
		array[0] = new int[] {1,2,3};
		array[1] = new int[] {4,5,6,7};
		array[2] = new int[] {6,9,5};
		
		for(int i=0; i<array.length;i++) {
			
			for(int j= 0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}

