/* 5.Write a Java program to reverse each  word in a sentence.
       Input : String sentence = "Java Programming is fun"
       Output : String result = "avaJ gnimmargorP si nuf"  */

package com.te.strings;

public class ReverseWords {

	public static void main(String[] args) {

		String str = "Java Programming is fun" ;
		String[] words = str.split(" ");
		String s = " ";
		
        for (String word : words) {
    		String reversedWord = reverseString(word);
    		 s += reversedWord;
        }
        System.out.println(s.trim());
	}

	public static String reverseString(String word) {
		
		char[] chars = word.toCharArray();
        String reversed = " ";
        
		for (int i=chars.length-1 ; i>=0 ; i--) {

			reversed += chars[i];
		}
		return reversed;
		}

}
