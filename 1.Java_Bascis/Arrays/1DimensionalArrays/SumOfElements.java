/* 1.Write a Java program to calculate the sum of elements in an integer array. Implement a method
named calculateSum() that takes an integer array as input and returns the sum of the elements. The
program should display the sum. */

package com.te.oneDarrays;

public class SumOfElements {
	
	int sum ;
	public  int calculateSum(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {

		SumOfElements sum = new SumOfElements();
		int[] arr = {1,2,3,4,5};
		
		System.out.println("Sum : " +sum.calculateSum(arr));
	}
}
