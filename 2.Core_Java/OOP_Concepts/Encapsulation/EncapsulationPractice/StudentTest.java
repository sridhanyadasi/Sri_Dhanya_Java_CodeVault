package com.te.encapsulationPractice;

public class StudentTest {

	public static void main(String[] args) {


		Student std = new Student();
		
		std.setId(33);
		std.setName("Candy");
		std.setGrades('A');
		
		System.out.println("ID : "+std.getId()+ "\nName : " +std.getName()+ "\nGrade :" +std.getGrades());
		std.addGrade();
	}

}
