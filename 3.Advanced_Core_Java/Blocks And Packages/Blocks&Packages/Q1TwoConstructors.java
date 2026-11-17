/* 1.Write a program where an instance block initializes common instance variables (e.g.,
default values for an object's fields). Demonstrate how the instance block executes before the
constructor and is invoked every time an object is created. Include at least two constructors in
your program. */


package com.te.BlocksAndPackages;

public class Q1TwoConstructors {
	
	String name;
	int age;
	
	public Q1TwoConstructors() {
		System.out.println("It's an default constructor");
	}
	
	public Q1TwoConstructors(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public static void main(String[] args) {
		Q1TwoConstructors construc = new Q1TwoConstructors();
		Q1TwoConstructors construc1 = new Q1TwoConstructors("Sri", 10);
    	System.out.println("Name : " +construc1.name+ "\nAge :" +construc1.age);
		
	}

}
