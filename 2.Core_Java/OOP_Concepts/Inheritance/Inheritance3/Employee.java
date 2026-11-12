/* 5.Create a `Person` class with attributes `name` and `age`. Then, create an `Employee` class
that inherits from `Person` and adds attributes like `employeeId`, `department`,
and `salary`. Finally, create a subclass `Manager` that inherits from `Employee` and adds
attributes like `teamSize` and `projectAssigned`. */


package com.te.inheritance2;

public class Employee extends Person {

	int id;
	String department;
	double salary;
	
	public void display() {
		System.out.println("Name :"+name+ "\nAge : " +age+"\nID :"+id+ "\nDepartment :"+department+ "\nSalary :"+salary);
	}

}
