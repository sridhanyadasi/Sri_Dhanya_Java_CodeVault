/* 4. Employee Management System : You are tasked with designing an Employee
Management System for a company. Create an abstract class `Employee` with the following
specifications:
→ Attributes: - `id` (integer): Unique identifier for the employee. - `name` (String): Name of
the employee. - `salary` (double): Salary of the employee.

→ Constructors: - `Employee(int id, String name)`: Initializes `id` and `name`. The `salary`
attribute should be initialized to a default value. - `Employee(int id, String name, double
salary)`: Initializes all attributes.

→ Abstract Method: - `calculateSalary()`: Abstract method to be implemented by subclasses
to calculate the salary based on specific rules.

→ Non-Abstract Methods: - `displayDetails()`: Displays the details of the employee (id,
name, and salary). - `getters and setters` for all attributes.

→ Static Method: - `totalEmployees()`: Static method to track the total number of
employees across all instances of `Employee`.

→ Final Method: - `final void promote()`: A final method that cannot be overridden by
subclasses. This method should display a message indicating that the employee has been
promoted. Additionally, create two concrete subclasses of `Employee`:

→ `HourlyEmployee`: Represents an employee who is paid based on hours worked. -
Attributes: `hourlyRate` (double), `hoursWorked` (int) - Constructor: `HourlyEmployee(int id,
String name, double hourlyRate)`: Initializes `id`, `name`, and `hourlyRate`. - Override the
`calculateSalary()` method to calculate the salary based on the Formula: `salary = hourlyRate*hoursWorked`.

→ `SalariedEmployee`: Represents an employee who receives a fixed salary. - No additional
attributes. - Constructor: `SalariedEmployee(int id, String name, double salary)`: Initializes
`id`, `name`, and `salary`. - Override the `calculateSalary()` method to return the fixed salary
directly.

→ Constraints: - Ensure that attributes are properly encapsulated (private with getters and
setters). - Implement appropriate constructors and methods in each class. - Ensure that the
`calculateSalary()` method is overridden in both subclasses with correct implementations. -
Implement the `totalEmployees()` static method to keep track of the total number of
employees.  */

package com.te.abstractClass1;

public abstract class Employee {
	
	// 1.Attributes
	
	 int id;
	 String name;
	 double salary;
	
	// 2.Constructors 
	 
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		this.salary = 30000.00;
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// 3.Abstract Method
	
	public abstract void calculateSalary();
	
	// 4.Non-Abstract Methods
	
	public void display() {
		System.out.println("ID : " +id);
		System.out.println("Name :" +name);
		System.out.println("Salary :" +salary);
	}
	
	// Getters and Setters 
	
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
	
	
	//Static Method
	
	public static void totalEmployee() {
		System.out.println("Total Employees in the Company");
	}
	
	//Final Method
	
	public final void promote() {
		System.out.println("The Employee has beed Promoted");
	}
	
	
	
	

}
