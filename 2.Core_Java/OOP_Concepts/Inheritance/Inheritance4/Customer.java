/* 7.Define a `Customer` class with attributes like `name`, `age`, and `creditScore`. Create a
subclass `LoanApplicant` that inherits from `Customer` and adds attributes like
`annualIncome` and `loanAmountRequested`. Implement a method to determine if a loan
applicant is eligible for a loan based on their credit score, income, and requested loan
amount.*/

package com.te.inheritance3;

public class Customer {
	
	String name;
	int age;
	int creditScore;
	
	public Customer(String name, int age, int creditScore) {
		super();
		this.name = name;
		this.age = age;
		this.creditScore = creditScore;
	}

}
