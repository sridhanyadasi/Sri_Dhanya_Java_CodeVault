/* 2.Write a program to concatenate multiple strings in Java. */

package com.te.strings;

public class ConcatenationOfStr {
		
	public static void main(String[] args) {


		String str = "Sandy";
		String str1 = "Dhanya";
		
		System.out.println(str.concat(str1));

		str = str+"Paapaa";

		System.out.println("Concatenation of Strings : " +str+str1);
		
		String str2 = "Candy";
		String str3 = "Sri";
		String str4 = "Dhanya";		
//		String[] string = {str , str1, str2, str3};
//		for(String st : string) {
//			System.out.println(st.toLowerCase());
//			System.out.println(st.toUpperCase());
//		}
				
		System.out.println("\nConcatenation of multiple strings : " +str2+" "+str3+" "+str4);
	
//		StringBuffer buf = new StringBuffer();
//		buf.reverse();
	}

}
