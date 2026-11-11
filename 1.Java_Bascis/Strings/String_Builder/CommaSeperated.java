/* 4.Write a Java program using `StringBuilder` to create a comma-separated string from 
     an array of integers. For example, given the array `[1, 2, 3, 4, 5]`, the output should be `"1,2,3,4,5"`.
        Input: int[] numbers = {1, 2, 3, 4, 5};
        Output: String result = "1,2,3,4,5"; */

package com.te.stringBuilder;

public class CommaSeperated {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("1,2,3,4,5");
		
		System.out.println("Comma Seperated : " +str.replace(9, 9, " "));
		//StringBuilder int[] numbers = {1,2,3,4,5};		
	}
}
