/*4.Write a program to read a sentence and replace lower case characters by 
upper case and  vice-versa.
      sentence is   : This Is A Test String.
      After Case changed the string  is: tHIS iS a tEST sTRING */

package com.te.strings;

public class FirsttLettersWillBeSmall {

	public static void main(String[] args) {

		String str = "This Is A Test String";
		String s = " ";
		
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            if (Character.isUpperCase(ch)) {
		                s += Character.toLowerCase(ch);
		            } else {
		                s += Character.toUpperCase(ch);
		            }
		        }
		        System.out.println(s);
		    }
	}


