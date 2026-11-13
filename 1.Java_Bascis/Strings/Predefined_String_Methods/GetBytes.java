/* getBytes()
MethodName: getBytes
ReturnType: byte[]
Parameters: None
Explanation: Encodes this string into a sequence of bytes
using the platform's default charset. */

package com.te.PerdefinedStrings;

import java.util.Arrays;

public class GetBytes {

	public static void main(String[] args) {

		String s = "Sri";
		
		byte[] byteArray= s.getBytes();
		System.out.println("GEt Bytes : " +Arrays.toString(byteArray));
	}

}
