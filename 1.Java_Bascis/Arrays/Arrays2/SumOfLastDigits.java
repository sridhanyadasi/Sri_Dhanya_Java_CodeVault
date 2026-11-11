/*23.Write a Program to add the last digits of all the elements in a given array. */

package com.te.arrays1;

public class SumOfLastDigits {

	public static void main(String[] args) {

		int[] arr = {12,23,34,45,56};
		int sum =0;
		
		for (int i=0; i<arr.length ; i++) {
			sum += arr[i] % 10;
			//sum += arr[i] / 10; //first digits sum
		}
		System.out.println("Sum of last Digits : " +sum);
	}

}
