/* getBytes(String charsetName)
MethodName: getBytes
ReturnType: byte[]
Parameters: getBytes(String charsetName)
Explanation: Encodes this string into a sequence of bytes
using the specified charset. */

package com.te.PerdefinedStrings;

import java.util.Arrays;

public class GetByteCharSetName {

	public static void main(String[] args) {

		String str = "Sand";
		
		byte[] byteArray = str.getBytes();
		System.out.println(Arrays.toString(byteArray));
	}

}
