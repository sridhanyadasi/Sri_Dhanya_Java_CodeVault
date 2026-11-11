/* 19.Develop a program to check if an array of characters forms a palindrome (reads the same 
forwards and backwards). */

package com.te.arrays1;

public class PalindromeArray {

	public static void main(String[] args) {

		char[] arr = {'m', 'o', 'o', 'n'};
		boolean isPalindrome = true;
		
		for (int i=0; i<arr.length ; i++) {			
			if (arr[i] != arr[arr.length - 1 -i]) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
		System.out.println("Enter Array is a Palindrome");	
		}
		else{
			System.out.println("Enter Array is not a palindrome");
		}
		
	}

}
