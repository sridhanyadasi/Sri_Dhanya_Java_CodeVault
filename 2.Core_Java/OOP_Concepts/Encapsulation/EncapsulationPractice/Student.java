/* 7. Write a Java program to create a class called Student with private instance variables 
student_id, student_name, and grades. Provide public getter and setter methods to access and
modify the student_id and student_name variables. However, provide a method called addGrade()
 that allows adding a grade to the grades variable while performing additional validation. */

package com.te.encapsulationPractice;

public class Student {

	private int id;
	private String name;
	private char grades;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrades() {
		return grades;
	}
	public void setGrades(char grades) {
		this.grades = grades;
	}
	
	public void addGrade() {
		if (grades == 'A') {
			System.out.println("Excellent");
		}
		else if(grades == 'B') {
			System.out.println("Good");
		}
		else if(grades == 'C') {
			System.out.println("Average");
		}
		else if(grades == 'D') {
			System.out.println("Below Average");
		}
		else {
			System.out.println("Fail");
		}
	}
}
