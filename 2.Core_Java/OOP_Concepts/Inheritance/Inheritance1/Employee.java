/* 	2.Create a `Person` class with attributes `name` and `age`, and then create an `Employee`
	class that inherits from `Person` and adds attributes such as `employeeId` and `department`.*/

package com.te.inheritance;

public class Employee extends Person {
	
	int empId;
	String department;
	
	public Employee(String name, int age, int empId, String department) {
		this.name = name;
		this.age = age;
		this.empId = empId;
		this.department = department;
	}
	
	public void display() {
		System.out.println("Name of the Student: "+name+ "\nAge of the Student :"+age+ "\nID of the Employee :"+empId+ "\nDepartment of the Employee: "+department);
	}
}
