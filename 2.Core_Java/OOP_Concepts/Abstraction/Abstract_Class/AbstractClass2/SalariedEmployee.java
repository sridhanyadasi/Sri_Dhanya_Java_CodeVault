/*  `SalariedEmployee`: Represents an employee who receives a fixed salary. - No additional
attributes. - Constructor: `SalariedEmployee(int id, String name, double salary)`: Initializes
`id`, `name`, and `salary`. - Override the `calculateSalary()` method to return the fixed salary
directly. */

package com.te.abstractClass1;

public class SalariedEmployee extends Employee{
	
	public SalariedEmployee(int id, String name , double salary) {
		super (id,name, salary);
		this.id = id;
		this.name = name;
        this.salary = salary;		
}
	
	public void calculateSalary() {
	
		System.out.println("Salary : " +salary);
	}
	
	

}
