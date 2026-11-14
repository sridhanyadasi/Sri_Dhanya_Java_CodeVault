package com.te.abstractClass1;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee hour = new HourlyEmployee(33, "Sri", 40.5, 15);
		
		//System.out.println(hour.hourlyrate);
		hour.display();

		hour.setId(05);
		hour.setName("Sri Dhanya");
		hour.setSalary(40000);
		System.out.println("ID :" +hour.getId()+ "\tName :" +hour.getName()+ "\tSalary :" +hour.getSalary());
		hour.calculateSalary();
		Employee.totalEmployee();
		hour.promote();
		
		Employee salary = new SalariedEmployee(10, "San", 50000);
		salary.calculateSalary();

	}

}
