/* 20.Write a program to count the total number of duplicate elements in the  array and print the total 
count. 
Input:{1,2,3,4,4,2,3,5} Output:Total Count:3 */

package com.te.arrays1;

public class DuplicateArrayCount {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,4,2,3,5};
		int count =0;
		
		for (int i=0 ; i<arr.length ; i++) {
				for (int j= i+1 ; j<arr.length ; j++ ) {
					
					if (arr[i] == arr[j]) {
						arr[j] = 0;
						System.out.print(" "+arr[i]);
					}						
			}
		}
	
		System.out.println("\nRemove duplicates in an Array :");
		for (int i=0; i<arr.length; i++) {
			if (arr[i]!=0) {
				System.out.print(" "+arr[i]);
			}
			else {
				count++;
			}
			}
		System.out.println("\nCount :" +count);

		}

}
