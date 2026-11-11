/* 10.Write a Java program by creating a method called `average` that accepts one fixed integer 
argument and a variable number of integer arguments(varargs), and returns the average of all the 
integers including the fixed argument.  */

package com.te.oneDarrays;

public class VarArgsAvg {

	
	public static int average( int...arr) {
		
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		System.out.println("Sum : " +sum);
		return sum/arr.length;
	}
	public static void main(String[] args) {

		System.out.println("Average of all the integers :" +average(1,2,3));
	}

}
