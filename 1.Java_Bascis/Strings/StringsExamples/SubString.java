/*  7.Write a program to extract a substring from a given string.
     Input :
     Input the string : this is test string
     Input the position to start extraction :9
     Input the length of substring :4
     Output :
     The substring retrieve from the string is : "" test ""  */

package com.te.strings;

public class SubString {

	public static void main(String[] args) {

		String str = "This is test string";
		
		for(int i=0 ; i<str.length(); i++) {
			System.out.println(str);
		}
		String sub1 = str.substring(8, 12);
				
		System.out.println(sub1);
		System.out.println("Length of the sub String : " +sub1.length());
		
//		String s1 = "abc";
//		String s2 = "abc";  //literal String
//		System.out.println(s1 == s2);
//		String str1 =new String( "abc");
//		String str3 = new String("abc");
//		System.out.println(s1 == str1);
//		System.out.println(str1 == str3);
//		System.out.println(str1.equals(str3));

	}

}
