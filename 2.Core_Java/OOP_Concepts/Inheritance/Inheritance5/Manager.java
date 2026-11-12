/* 9.Implement a Java program for an employee management system. Define a `Person` class
with attributes like `name`, `age`, and `gender`. Then, create subclasses `Manager` and
`Worker` that inherit from `Person` and add attributes specific to each role, such as
`department`, `salary`, and `hoursWorked`. Implement methods for calculating bonuses for
managers based on performance and overtime pay for workers. */


package com.te.inheritance4;

class Manager extends Person {
 String department;
 double salary;
 double performanceBonus;

 public Manager(String name, int age, String gender, String department, double salary) {
     super(name, age, gender);
     this.department = department;
     this.salary = salary;
 }

 public void calculateBonus(double performanceFactor) {
     performanceBonus = salary * performanceFactor;
 }

 
 public void display() {
     System.out.println("Department: " + department);
     System.out.println("Salary: " + salary);
     System.out.println("Performance Bonus: " + performanceBonus);
 }
}
