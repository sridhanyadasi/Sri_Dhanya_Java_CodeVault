package com.te.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

//	/* 6.Write a program to check if two strings are anagrams. */
//
//	public static boolean areAnagrams(String str1 , String str2) {
//		
//		char[] charArray1 = str1.toCharArray();
//		char[] charArray2 = str2.toCharArray();
//		
//		Arrays.sort(charArray1);
//		Arrays.sort(charArray2);
//		
//		return Arrays.equals(charArray1, charArray2);
//	}
	
	public static String reverseString(String word) {
		
		char[] ch = word.toCharArray();
		String reversed = " ";
		
		for(int i=ch.length-1; i>= 0; i--) {
			reversed += ch[i];
		}
		return reversed;
		
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string1   : ");
		String str3 = scan.next();
//		String str2 = scan.next();
//		
//		System.out.println(areAnagrams(str1, str2));
		
		/*3.Write a program to capitalized the first letter of each word in a sentence
	     Input  : this is a test string
	     Output :This Is A Test String.  */
		
		String str = "this is a test string";
		String[] words  = str.split(" ");
		String s = " ";
		
		for (int i=0; i<words.length ; i++) {
			
			s += Character.toUpperCase((words[i].charAt(0))) + words[i].substring(1) +" ";
		}	
		System.out.println(s);
	
		/*4.Write a program to read a sentence and replace lower case characters by 
		upper case and  vice-versa.
		      sentence is   : This Is A Test String.
		      After Case changed the string  is: tHIS iS a tEST sTRING */
		
		String str1 = "This Is A Test String";
        String s1 = " ";
        
        for(int i= 0; i<str1.length() ; i++) {
        	char c = str1.charAt(i);
        	if(Character.isUpperCase(c)) {
        		s1 += Character.toLowerCase(c);
        	}
        	else {
        		s1 += Character.toUpperCase(c);
        	}
        }
        System.out.println(s1);
        
        /* Palindrome */
        
        boolean isPalindrome = true;
        for(int i=0 ; i<str3.length(); i++) {
        	
        	if(str3.charAt(i) != str3.charAt(str3.length() - i - 1)) {
        		isPalindrome = false;
        		break;
        	}
        }
        if(isPalindrome ) {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("Not a palindrome ");
        }
        
        String string = "moon";
        String reversed = " ";
        for(int i= string.length()- 1 ; i>= 0; i--) {
       
        	reversed += string.charAt(i);
        }
    	System.out.print(reversed);
    	
    	
    	/* 5.Write a Java program to reverse each  word in a sentence.
        Input : String sentence = "Java Programming is fun"
        Output : String result = "avaJ gnimmargorP si nuf"  */

    	String string1 = "Java Prioramming is fun";
    	String[] word1 = string1.split(" ");
    	String space = " ";
    	
    	
    	for(String rev : word1) {
    		String reverse = reverseString(rev);
    		space += reverse;
    		
    	}
    	System.out.println("\n" +space.trim());
    	

	}

}
