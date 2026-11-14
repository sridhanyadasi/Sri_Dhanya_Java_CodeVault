/*  2. Create an abstract class `Employee` with properties like `id`, `name`, and `salary`, and
abstract methods like `calculateSalary()`.Implement concrete subclasses such as
`HourlyEmployee` and `SalariedEmployee` that extend `Employee` and provide
implementations for `calculateSalary()`. In a payroll system, the `Employee` hierarchy can
represent different types of employees (hourly workers, salaried employees), each with its
own method of calculating salary based on hours worked or fixed salary. */ 

package com.te.abstractClass;

public class HourlyEmployee extends Employee{
	
	private double hourlyRated;
	private int hourlyWorked;
	
	public double getHourlyRated() {
		return hourlyRated;
	}
	public void setHourlyRated(double hourlyRated) {
		this.hourlyRated = hourlyRated;
	}
	public int getHourlyWorked() {
		return hourlyWorked;
	}
	public void setHourlyWorked(int hourlyWorked) {
		this.hourlyWorked = hourlyWorked;
	}
	
	public void calculateSalary() {
		
	    salary = hourlyRated * hourlyWorked;
		System.out.println("Hourly Employee Salary : " +salary);
	}

}
