/* 11.Create a method called `findMax` that accepts a variable number of integer arguments(varargs) 
and returns the maximum value among them. If no arguments are provided, the method should return 
`Integer.MIN_VALUE`.  */

package com.te.oneDarrays;

public class VarArgsFindMax {

	
	public static  int findMax(int...arr) {

		int max = arr[0];
		if (arr.length == 0) {
			return Integer.MIN_VALUE ;
		}
		
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}	
		return max;
	}
	public static void main(String[] args) {

		System.out.println("Max num of an Array is : " +findMax(10,20,30,40));
	}

}
