 /*  2. Create an abstract class `Employee` with properties like `id`, `name`, and `salary`, and
abstract methods like `calculateSalary()`.Implement concrete subclasses such as
`HourlyEmployee` and `SalariedEmployee` that extend `Employee` and provide
implementations for `calculateSalary()`. In a payroll system, the `Employee` hierarchy can
represent different types of employees (hourly workers, salaried employees), each with its
own method of calculating salary based on hours worked or fixed salary. */

package com.te.abstractClass;

public class SalariedEmployee extends Employee{
	
	private double fixedSalary;
	
	public double getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}
	
    public void calculateSalary() {

    	salary = fixedSalary;
		System.out.println("Salaried Employee recieves salary on month end : " +salary);
	}

}
