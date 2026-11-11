/* 6.Create a Java program to initialize an array of doubles with values {1.1, 2.2, 3.3, 4.4, 5.5} and print 
each element in the array using an enhanced for loop(for each).  */

package com.te.arrays;

public class EnhancedForLoopPrintdoubleVal {

	public static void main(String[] args) {

		double[] arr = {1.1, 2.2, 3.3 , 4.4, 5.5 };
		
		System.out.println("Elements in an Array using Enhanced for loop : \n");
		
		for (double a : arr) {   //Enhanced for loop
			
			System.out.print(a +"  ");
		}
	

}
}
