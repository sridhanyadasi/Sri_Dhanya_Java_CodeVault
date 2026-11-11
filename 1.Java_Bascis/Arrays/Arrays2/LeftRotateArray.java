/* 21.Write a program to left rotate the elements of an array. 
Ex:{1,5,10,15,20} Input:1(no. of rotations) Output:{5,10,15,20,1} */

package com.te.arrays1;

import java.util.Arrays;

public class LeftRotateArray {

	public static void main(String[] args) {

		int[] arr = {1,5,10,15,20};
		int rotations = 1;

		for (int j=0; j<rotations ; j++) {
		  int temp = arr[0] ;
		for (int i=0; i<arr.length-1; i++) {
		
			arr[i] = arr[i+1]; 
		}
		arr[ (arr.length)-1] = temp;
}		
		System.out.println("Left rotation of asn Array : " +Arrays.toString(arr));
		
}

}
