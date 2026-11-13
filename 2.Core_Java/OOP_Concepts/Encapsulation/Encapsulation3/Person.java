package com.te.Encapsulation2;

public class Person {

	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	
//	public int getAge() {
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public String toString(){
		return "Age : " +age;
	}
	
}