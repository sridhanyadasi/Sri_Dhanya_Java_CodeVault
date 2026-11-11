/* 9.Write a Java program to find the maximum and minimum numbers in an array of integers. */

package com.te.arrays;

import java.util.Arrays;

public class MaximumAndMinimum {
	
	public static String reverseString(String word) {
		char[] ch = word.toCharArray();
		String reversed = " ";
		
		for(int i = ch.length-1 ; i>= 0; i--) {
			reversed += ch[i];
		}
		return reversed;
	}

	public static void main(String[] args) {

		
		int[] arr = {45,74,855,98,6};
		
		int[] square = new int[arr.length];
		for(int i=0 ; i<arr.length ; i++) {
			square[i] = arr[i] * arr[i];
		}
		System.out.println(Arrays.toString(square));
		
		System.out.println("Size of an array : " +arr.length);
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (arr[i] < arr[j] ) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Maximum Element in an Array : " +arr[arr.length-1]);
		System.out.println("Minimum Element in an Array : " +arr[0]);
		
		String str = "this is a test string";
		String[] words = str.split(" ");
		String s = " ";
		
		for(int i=0; i<words.length ; i++) {
			s += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1)+ " ";
		}
		System.out.println(s);
		
		String str1 = "This Is A Test String";
		String s1 = " ";
		
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			if(Character.isUpperCase(c)) {
				s1 += Character.toLowerCase(c);
			}
			else {
				s1 += Character.toUpperCase(c);
			}
		}
		System.out.println(s1);
		
		String string = "Java is a programming language";
		String[] sen = string.split(" ");
		String space = " ";
		
		for (String rev : sen) {
			String reversed = reverseString(rev);
			space += reversed;
		}
		System.out.println(space.trim());
	}

}
