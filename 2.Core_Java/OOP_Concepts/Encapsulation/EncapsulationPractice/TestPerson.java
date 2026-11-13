/* 1. Write a Java program to create a class called Person with private instance variables name, age and country.
  Provide public getter and setter methods to access and modify these variables. */

package com.te.encapsulationPractice;

public class TestPerson {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("Candy");
		person.setAge(20);
		person.setCountry("India");
		
		System.out.println("Name : " +person.getName()+ "\nAge :" +person.getAge()+ "\nCountry :" +person.getCountry());
	}

}
