/*  22.Write a program to right rotate the elements of an array.
Ex: {1,5,10,15,20} Input:1(no. of rotations) Output:{20,1,5,10,15} */

package com.te.arrays1;

import java.util.Arrays;

public class RightRotation {

	public static void main(String[] args) {

		int arr[] = {1,5,10,15,20};
	    int rotations = 1;
	    
	   for (int i=0; i<rotations ; i++) {
		   int temp = arr[arr.length-1];
		   for (int j=arr.length-1; j>0; j--) {
			arr[j] = arr[j - 1];   
		   }
		   arr[0] = temp;
	   }
	   System.out.println("Right Roatation  of an Array :" +Arrays.toString(arr));
	}

}
