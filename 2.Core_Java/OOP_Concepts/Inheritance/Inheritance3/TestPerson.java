package com.te.inheritance2;

public class TestPerson {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "SanDy";
		employee.age = 11;
		employee.id = 3;
		employee.department = "dev";
		employee.salary = 300000;
		employee.read();
		employee.display();
		
		Manager manager = new Manager();
		manager.name = "SanDy";
		manager.age = 11;
		manager.id = 3;
		manager.department = "dev";
		manager.salary = 300000;
		manager.teamSize = 10;
		manager.projectAssigned = "Plastic";
		manager.read();
		manager.display();
		
	}

}
