package com.te.encapsulationPractice;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee();
		
		emp.setId(33);
		emp.setName("Sandy");
		emp.setSalary(30000);
		
		System.out.println("Id :" +emp.getId()+ "\nName : " +emp.getName()+  "\nFormatted Salary: " +emp.getFormattedSalary());
		
	}

}
