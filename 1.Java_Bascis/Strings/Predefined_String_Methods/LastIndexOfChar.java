/*lastIndexOf(int ch)
MethodName: lastIndexOf
ReturnType: int
Parameters: lastIndexOf(int ch)
Explanation: Returns the index of the last occurrence of
the specified character (ch). Returns -1 if the character is
not found.*/

package com.te.PerdefinedStrings;

public class LastIndexOfChar {

	public static void main(String[] args) {

		String s = "San";
		
		int a = s.lastIndexOf('a');
		int b = s.lastIndexOf('s');
		System.out.println("Index of 'a' (Found) : " +a);
		System.out.println("Index of 's' (not Found) : " +b);
		//Char is found it will returns 1 , if not found it will returns -1.
	}

}
