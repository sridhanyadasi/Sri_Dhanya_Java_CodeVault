/*9.Write a Java program by creating  a method called `multiply` that accepts a variable number of 
integer arguments(varargs)  and returns the product of all the integers.  */

package com.te.oneDarrays;

public class VarArgsMultiply {

	public static  int multiply(int...arr) {
		
		int mul = 1;

		for (int a : arr) {
			mul *= a;
		}
		
		return mul;

	}
	public static void main(String[] args) {
		
		System.out.println("Multiplication of Array : " +multiply(2, 4, 5,2));
		
	}

}
