/* `HourlyEmployee`: Represents an employee who is paid based on hours worked. -
Attributes: `hourlyRate` (double), `hoursWorked` (int) - Constructor: `HourlyEmployee(int id,
String name, double hourlyRate)`: Initializes `id`, `name`, and `hourlyRate`. - Override the
`calculateSalary()` method to calculate the salary based on the Formula: `salary = hourlyRate*hoursWorked`. */

package com.te.abstractClass1;

public class HourlyEmployee extends Employee{
	
	double hourlyRate;
	int hoursWorked;
	
	public HourlyEmployee(int id,String name, double hourlyRate, int hoursWorked) {
		super(id,name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;	
	}
	
	public void calculateSalary() {
		salary = hourlyRate * hoursWorked;
		System.out.println("Salary : " +salary);
	}	

}
