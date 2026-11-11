/* 1.Write a program to check if a string is a palindrome.  */

package com.te.strings;

import java.util.Scanner;

public class StrPalindromeOrNot {

	public static void main(String[] args) {
		
		boolean isPalindrome = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = scan.next();
	
		str = str.toLowerCase();
		str = str.toUpperCase();
		
		System.out.println("String length is "+str.length());
		
		for (int i=0; i<str.length(); i++) {
			
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;	
        }
}
		if(isPalindrome) {
			System.out.println("\nString is palindorme");
		}
		else {
			System.out.println("\nString is not a palindrome");
		}
	

	}
}
