/* equalsIgnoreCase(String anotherString)
MethodName: equalsIgnoreCase
ReturnType: boolean
Parameters: equalsIgnoreCase(String anotherString)
Explanation: Returns true if this string is equal to the
specified string, ignoring case differences.  */

package com.te.PerdefinedStrings;

public class EqualIgnoranceCase_2Strings {

	public static void main(String[] args) {

		String str1 = "Candy";  // str2 = "Candy" = true
		String str2 = "Dhanya"; 
		
		System.out.println("Equal Ignorance Case : " +str1.equals(str2));
		//It is written that two strings are equal = true and not equal = false. 
	}

}
