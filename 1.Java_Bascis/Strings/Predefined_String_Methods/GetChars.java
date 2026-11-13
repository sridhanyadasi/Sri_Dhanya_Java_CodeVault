/* getChars(int srcBegin, int srcEnd, char[] dst, int
dstBegin)
MethodName: getChars
ReturnType: void
Parameters: getChars(int srcBegin, int srcEnd, char[] dst,
int dstBegin)
Explanation: Copies characters from this string into the
destination char array. */

package com.te.PerdefinedStrings;

public class GetChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Satya ";

		char[] dst = new char[2]; // Enough to hold characters from index 1 to 2
        str.getChars(1, 3, dst, 0);
        
        System.out.println(dst);
	}

}
