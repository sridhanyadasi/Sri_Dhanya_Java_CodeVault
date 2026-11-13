/* getBytes(int srcBegin, int srcEnd, byte[] dst, int
dstBegin)
MethodName: getBytes
ReturnType: void
Parameters: getBytes(int srcBegin, int srcEnd, byte[] dst,
int dstBegin)
Explanation: Copies characters from this string into the
destination byte array. */

package com.te.PerdefinedStrings;

import java.util.Arrays;

public class GetBytesCopiesChar {

	public static void main(String[] args) {

	
		String str = "Satya";
		
		byte[] dst = new byte[10];  // You created a byte array of size 10
		
		str.getBytes(1, 3, dst, 0);
		// Copies characters at index 1 and 2: 'a' and 't' from "Satya"
		// into dst[0] and dst[1] as their byte values (ASCII)
		
		System.out.println(Arrays.toString(dst));
		// Prints the contents of the byte array

		/*
		 * You created dst = new byte[10]
		 * 
		 * When a byte array is created in Java, all values are initialized to 0 by
		 * default
		 * 
		 * Since you only copied 2 bytes, the remaining 8 are untouched and stay 0
		 */

	}

}	
