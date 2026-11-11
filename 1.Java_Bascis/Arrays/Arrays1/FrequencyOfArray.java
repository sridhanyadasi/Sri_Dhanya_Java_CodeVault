/* 12.Write a Java program to find the frequency of each element in an array of integers and print the 
elements along with their frequencies. */

package com.te.arrays;

import java.util.Arrays;

public class FrequencyOfArray {

	public static void main(String[] args) {

		int[] arr = {1,2,2,3,4,5,1,2,3,5,4,1,2,3};
		int[] frequency = new int[arr.length];
	
		for (int i=0; i<arr.length; i++) {
			frequency[arr[i]]++;
			
		}	
		
		System.out.println(Arrays.toString(frequency));
		for (int i=0; i<arr.length; i++) {
			if (frequency[i] > 0) {
			System.out.println("Frequency of an Array : " +i+" " +frequency[i]);
		}
		}		
	}
}






















//This loop goes through each element of arr and increments the value at that index in frequency.
//
//🔁 Iteration Example:
//
//i	arr[i]	frequency[arr[i]]++	Resulting frequency[]
//0	1	frequency[1] = 1	[0,1,0,0,0,0,...]
//1	2	frequency[2] = 1	[0,1,1,0,0,0,...]
//2	2	frequency[2] = 2	[0,1,2,0,0,0,...]
//3	3	frequency[3] = 1	[0,1,2,1,0,0,...]
//4	4	frequency[4] = 1	[0,1,2,1,1,0,...]
//5	5	frequency[5] = 1	[0,1,2,1,1,1,...]
//6	1	frequency[1] = 2	[0,2,2,1,1,1,...]
//7	2	frequency[2] = 3	[0,2,3,1,1,1,...]
//8	3	frequency[3] = 2	[0,2,3,2,1,1,...]
//9	5	frequency[5] = 2	[0,2,3,2,1,2,...]
//10	4	frequency[4] = 2	[0,2,3,2,2,2,...]
//11	1	frequency[1] = 3	[0,3,3,2,2,2,...]
//12	2	frequency[2] = 4	[0,3,4,2,2,2,...]
//13	3	frequency[3] = 3	[0,3,4,3,2,2,...]
//
//📦 Final frequency[]:
//
//makefile
//Copy
//Edit
//Index:      0 1 2 3 4 5 6 7 8 9 10 11 12 13
//frequency = [0 3 4 3 2 2 0 0 0 0  0  0  0  0]
//
