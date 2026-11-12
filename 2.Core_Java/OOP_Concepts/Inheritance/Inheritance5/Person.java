/* 9.Implement a Java program for an employee management system. Define a `Person` class
with attributes like `name`, `age`, and `gender`. Then, create subclasses `Manager` and
`Worker` that inherit from `Person` and add attributes specific to each role, such as
`department`, `salary`, and `hoursWorked`. Implement methods for calculating bonuses for
managers based on performance and overtime pay for workers. */

package com.te.inheritance4;

public class Person {
	
	String name;
	int age;
	String gender;
	
	public Person (String name, int age, String gender) {
		
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
}
