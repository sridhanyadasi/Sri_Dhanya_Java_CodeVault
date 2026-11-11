/* 6.Write a program to check if two strings are anagrams. */

package com.te.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static boolean areAnagrams(String str1 , String str2) {
		
		char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String 1 :");
		String str1 = scan.next();
		
		System.out.println("Enter a String 2 :");
		String str2 = scan.next();
		
		System.out.println(areAnagrams(str1, str2));
		scan.close();
	}

}
