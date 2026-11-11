/* 3.Write a Java program using `StringBuffer` to replace all occurrences of a substring 
       within a string. For example, replace all occurrences of "cat" with "dog" in the string 
       "catapult cat".
         Input:
     String str = "catapult cat";
     String oldSubstr = "cat";
     String newSubstr = "dog";
         Output: String result = "dogapult dog"; */

package com.te.stringBuffer;

public class OccurancesOfSubStrng {

	public static void main(String[] args) {

		 String str = "catapult cat";
	     String oldSubstr = "cat";
	     String newSubstr = "dog";
	     
		 StringBuffer str1 = new StringBuffer(str.replace(oldSubstr, newSubstr));
				
		 System.out.println("Replace of cat with dog : "+str1 );
		 //System.out.println("Replace of cat with dog : " +str.replace(0, 3, "dog"));
		 //System.out.println(str.replace(8, 14, "dog"));
	}

}
