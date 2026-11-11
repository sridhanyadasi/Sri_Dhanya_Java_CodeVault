/*3.Write a program to capitalized the first letter of each word in a sentence
     Input  : this is a test string
     Output :This Is A Test String.  */

package com.te.strings;

public class CapitalizedOf1stLetter {

	public static void main(String[] args) {

		String str = "this is a test string";  // 39 .with the help of replace method also we should use
		String[] words = str.split(" ");
		String s =" ";
		
		for (int i=0; i<words.length ; i++) {
			
            s += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " ";	
            }
		
		System.out.println(s.trim());

		}
}



/*
 * for (String word : words) { result += Character.toUpperCase(word.charAt(0)) +
 * word.substring(1) + " "; }
 */



