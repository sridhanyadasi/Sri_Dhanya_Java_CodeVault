/* 4.Write a Java program that declares and initialize an array of characters and
 prints the length of the array.*/

package com.te.arrays;

import java.util.Arrays;

public class CharactersArray {

	public static void main(String[] args) {
		
		char[] arr = {'C', 'A', 'N', 'D', 'Y' };
		
		char[] arr1 = new char[] {'d', 's'};
		
		String[] str = {"sri" , "candy" , "san"};
		System.out.println(Arrays.toString(str));
		
//		int s = 10;
//		List<Object> sd = new ArrayList<>();
		
		System.out.println("Length of the Characters is : " +arr.length + " " +arr1.length);
		System.out.println(arr1);
		
		for(char a : arr)
		System.out.print(a+" ");		
	}
}