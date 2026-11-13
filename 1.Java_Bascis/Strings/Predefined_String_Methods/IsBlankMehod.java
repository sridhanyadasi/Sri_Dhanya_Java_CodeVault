/* isBlank()
MethodName: isBlank
ReturnType: boolean
Parameters: None
Explanation: Returns true if the string is empty or
contains only white spaces, otherwise returns false.
Introduced in Java 11. */

package com.te.PerdefinedStrings;

public class IsBlankMehod {

	public static void main(String[] args) {

		String s = "Sandy";
		String s1 = " ";
		String s2 = "";
		
		System.out.println("UnEmpty String : " +s.isBlank());
		System.out.println("Empty String : " +s1.isBlank());
		System.out.println("Empty method : " +s2.isEmpty());  
		//IsEmpty and IsBlank method are same. If Empty String is there it will shows true
		//OtherWise it will shows false.
		
	}

}
