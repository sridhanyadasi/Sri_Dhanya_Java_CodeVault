/* isEmpty()
MethodName: isEmpty
ReturnType: boolean
Parameters: None
Explanation: Returns true if the string is empty,
otherwise returns false.*/

package com.te.PerdefinedStrings;

public class IsEmpty {

	public static void main(String[] args) {

		String s = "Sandy";
		String s1 = " ";
		String s2 = "";
		
		System.out.println("UnEmpty String : " +s.isEmpty());
		System.out.println("Empty String : " +s1.isBlank());
		System.out.println("Empty method : " +s2.isEmpty());  
		//IsEmpty and IsBlank method are same. If Empty String is there it will shows true
		//OtherWise it will shows false.
	}

}
