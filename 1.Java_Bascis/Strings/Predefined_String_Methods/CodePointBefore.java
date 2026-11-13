/* codePointBefore(int index)
MethodName: codePointBefore
ReturnType: int
Parameters: codePointBefore(int index)
Explanation: Returns the Unicode code point of the
character before the specified index. */

package com.te.PerdefinedStrings;

public class CodePointBefore {

	public static void main(String[] args) {

		String str = "Sri";
		
		System.out.println(str.codePointBefore(2));
		// Returns the Unicode code point of the character before index 2, which is 'r'

	}

}
