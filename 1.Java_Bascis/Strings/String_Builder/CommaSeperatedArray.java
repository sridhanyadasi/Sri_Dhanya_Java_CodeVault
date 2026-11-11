/*  4.Write a Java program using `StringBuilder` to create a comma-separated string from 
     an array of integers. For example, given the array `[1, 2, 3, 4, 5]`, the output should be `"1,2,3,4,5"`.
        Input: int[] numbers = {1, 2, 3, 4, 5};
        Output: String result = "1,2,3,4,5"; */

package com.te.stringBuilder;

public class CommaSeperatedArray {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		
		StringBuilder str = new StringBuilder();
		
		for (int i=0; i< numbers.length ; i++) {
			
			str.append(numbers[i]);
			if(i<numbers.length - 1 ) {
				str.append(", ");
			}
		}
//		System.out.println("last index " +str.lastIndexOf(" "));
//		System.out.println("first index " +str.indexOf("1"));
		System.out.println("Comma Seperated : " +str.toString());
   }
}
