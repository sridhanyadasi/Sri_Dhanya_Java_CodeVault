/* 1. Create a class `MathOperations` with overloaded methods `multiply()` to multiply two, three, and
four integers. Write a program to demonstrate the usage of these methods.
Hint: Define multiple methods with the same name but different parameter lists. */

package com.te.polymorphism;

public class MathOperations {

	      int a;
	      int b;
	      
		public int mul(int a,int b ) {
			int c =a*b;
			return c;
		}
		
		//overloaded method
		public void mul(int a, int b, int c) {

			System.out.println("Mul of 3 integres are : " +(a*b*c));
		}
		
		//overloaded method
		public int mul(int a, int b, int c, int d) {
			return a*b*c*d;
			
		}
		
	}
