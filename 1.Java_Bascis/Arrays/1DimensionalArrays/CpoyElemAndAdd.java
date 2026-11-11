/* Simulate increasing array size and copy elements.
Initial array: {1, 2, 3}
Add element 4 at the end
Expected output: {1, 2, 3, 4} */

package com.te.oneDArrays1;

import java.util.Arrays;

public class CpoyElemAndAdd {

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3};
		int element = 4;
		int index = 3;
		int[] newArr = new int[arr.length+1];
		
		for (int i=0; i<arr.length ; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[index] =element;
		
		for (int i=index; i<arr.length ; i++) {
			newArr[i+1] = arr[i];
		}
		System.out.println("Cpoy of element : " +Arrays.toString(newArr));
	}

}
