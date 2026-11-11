/* 2.Write a Java program using `StringBuffer` to check if a given string is a palindrome.
      A palindrome is a word that reads the same backward as forward.
      Input: String str = "madam";
  	 Output: boolean result = true;  */

package com.te.stringBuffer;

import java.util.Scanner;

public class Palindrome {

	public static boolean reverse (String str) {
	
		StringBuffer reversed = new StringBuffer(str).reverse();
		
		return str.equals(reversed.toString());  //toString : it converts reversed to regular string
		/*
		 * if (str == str.reverse()) { return true; } else { return false; }
		 */
}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		//StringBuffer str = scan.next();
		String str = scan.next();
		
		System.out.println("IsPalindrome : " +reverse(str));
		
		
	}

}
