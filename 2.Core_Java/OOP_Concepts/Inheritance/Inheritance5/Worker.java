/* 9.Implement a Java program for an employee management system. Define a `Person` class
with attributes like `name`, `age`, and `gender`. Then, create subclasses `Manager` and
`Worker` that inherit from `Person` and add attributes specific to each role, such as
`department`, `salary`, and `hoursWorked`. Implement methods for calculating bonuses for
managers based on performance and overtime pay for workers. */

package com.te.inheritance4;

class Worker extends Person {
	 double salary;
	 int hoursWorked;
	 double overtimePay;

	 public Worker(String name, int age, String gender, double salary, int hoursWorked) {
	     super(name, age, gender);
	     this.salary = salary;
	     this.hoursWorked = hoursWorked;
	 }

	 public void calculateOvertimePay(double overtimeRate) {
	     overtimePay = hoursWorked * overtimeRate;
	 }

	 public void display() {
	     System.out.println("Salary: " + salary);
	     System.out.println("Hours Worked: " + hoursWorked);
	     System.out.println("Overtime Pay: " + overtimePay);
	 }
	}