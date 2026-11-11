/* 2.Write a Java program to calculate the sum and average of elements in an integer array. Implement
a method named calculateSumAndAverage() that takes an integer array as parameter and returns an
array containing the sum and average of the elements. The program should display the sum and
average of the elements in the array. */

package com.te.oneDarrays;

public class AverageAndSum {

	int sum ;

	public int calculateSumAndAverage(int[] arr) {
		
		for (int i=0; i<arr.length ; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum of an Array : " +sum);
		return sum/arr.length;
	}
	
	public static void main(String[] args) {

		AverageAndSum avg = new AverageAndSum();
		int arr[] = {1,2,3};
		System.out.println("\nAverage of an Array : " +avg.calculateSumAndAverage(arr));
		
	}

}
