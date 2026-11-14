package com.te.abstractClass;


public class TestEmployee {

	public static void main(String[] args) {

		HourlyEmployee hourly = new HourlyEmployee();
		hourly.setHourlyRated(15.00);
		hourly.setHourlyWorked(20);
		hourly.calculateSalary();
		
		Employee hour = new HourlyEmployee();
		hour.setId(33);
		hour.calculateSalary();

		System.out.println("-------------------------------------------------");
		SalariedEmployee salaried = new SalariedEmployee();
		salaried.setFixedSalary(50000);
		salaried.calculateSalary();
		
		Employee salary = new SalariedEmployee();
		salary.calculateSalary();
	   
		
	
	}

}
