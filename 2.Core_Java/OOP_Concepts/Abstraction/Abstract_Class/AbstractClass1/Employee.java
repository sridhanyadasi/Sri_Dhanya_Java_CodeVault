/*  2. Create an abstract class `Employee` with properties like `id`, `name`, and `salary`, and
abstract methods like `calculateSalary()`.Implement concrete subclasses such as
`HourlyEmployee` and `SalariedEmployee` that extend `Employee` and provide
implementations for `calculateSalary()`. In a payroll system, the `Employee` hierarchy can
represent different types of employees (hourly workers, salaried employees), each with its
own method of calculating salary based on hours worked or fixed salary. */

package com.te.abstractClass;

public abstract class Employee {
	
	private int id;
	private String name;
    public double salary;
	
	public abstract  void calculateSalary();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}
