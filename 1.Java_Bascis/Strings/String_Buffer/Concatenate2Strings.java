/* 1.Write a Java program using `StringBuffer` to concatenate two strings "Hello" and
    "World" and then reverse the concatenated string.
      Input:
  String str1 = "Hello";
  String str2 = "World";
  	  Output: String result = "dlroWolleH";  */

package com.te.stringBuffer;

public class Concatenate2Strings {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		
		StringBuffer str = new StringBuffer(str1.concat(str2));
		
		System.out.println("Reverse of the concatenated string :" +str.reverse());
	}
	
	
}
/*
	
	 * public static void reversedStr( String wordReverse ) {
	 * 
	 * char[] charArray = wordReverse.toCharArray(); String reversed = " ";
	 * 
	 * for (int i= charArray.length ; i >= 0; i--) { reversed += charArray[i]; }
	 * System.out.println("String reversed : " +reversed); }
	 
	public static void main(String[] args) {

		StringBuffer  str1 = new StringBuffer( "Hello" );
		StringBuffer str2 =  new StringBuffer("World");
		
		StringBuffer concatenation = str1.append(str2);
		System.out.println("Reverse of the concatenated string :" +concatenation.reverse() );
		
	}

}*/
