/* 5. Write a Java program that illustrates the concept of package hierarchy. Create multiple
packages and classes as follows:
1. Create a package named `com.te.university`.

2. Inside the `university` package, create two sub-packages: `com.te.university.students` and
`com.te.university.staff`.
3. Inside the `com.te.university.students` package, create a class named `Student` with fields
such as `name`, `rollNumber`, and `grade`. Include appropriate methods to set and get these
fields.
4. Inside the `com.te.university.staff` package, create a class named `StaffMember` with
fields such as `name`, `employeeID`, and `position`. Include appropriate methods to set and
get these fields.
5. Finally, create a `Main` class in the com.te.university package. */




package com.te.university.studnets;

public class Student {

	String name;
	int rollNum;
	char grade;

	public Student (String name, int rollNum, char grade) {
		this.name = name ;
		this.rollNum = rollNum;
		this.grade = grade;
	}
	
	public void read() {
		System.out.println("Name :" +name + "\nRoll Number :" +rollNum+ "\nGrade :" +grade);
	}
	public static void main(String[] args) {

		Student student = new Student("Reeta", 51, 'A');
		student.read();
	}

}
