/* codePointCount(int beginIndex, int endIndex)
MethodName: codePointCount
ReturnType: int
Parameters: codePointCount(int beginIndex, int
endIndex)
Explanation: Returns the number of Unicode code
points in the specified range. */

package com.te.PerdefinedStrings;

public class CodePointCount {
	
	public static void main(String[] args) {
		
		String str = "Satya";
		
		System.out.println("Count : " +str.codePointCount(1, 4));
		
		/*
		 * Index: 0 1 2 3 4 
		 *        S a t y a   So substring from index 1 to 4 = "aty"
		 */


	}

}
