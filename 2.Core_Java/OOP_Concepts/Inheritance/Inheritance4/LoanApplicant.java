/* 7.Define a `Customer` class with attributes like `name`, `age`, and `creditScore`. Create a
subclass `LoanApplicant` that inherits from `Customer` and adds attributes like
`annualIncome` and `loanAmountRequested`. Implement a method to determine if a loan
applicant is eligible for a loan based on their credit score, income, and requested loan
amount.*/

package com.te.inheritance3;

public class LoanApplicant extends Customer {
	
	int annualIncome;
	int loanAmountRequested;
	
	public LoanApplicant(String name, int age, int creditScore, int annualIncome, int loanAmountRequested) {
		super(name, age, creditScore);
		this.annualIncome = annualIncome;
		this.loanAmountRequested = loanAmountRequested;	
	}

	public String toString() {
		
		return "\nName: "+name+ "\nAge: "+age+ "\nCredit Score : "+creditScore+ "\nAnnual Income : "+annualIncome+ "\nLoan Amount Requested : "+loanAmountRequested;		
	}
	
	public void eligibleForLoan() {
		
		if(creditScore >= 100) {
			
			System.out.println("You are Eligible for Loan if Credit score will be equal or more than 100");
		}
		
		else if(annualIncome <= 15000) {
			
		   System.out.println("You are Eligible for loan If Annual Income will be lessthan 15000");
		
		}
		
		else if (loanAmountRequested <= 100000) {
			
			System.out.println("You are Eligible for loan when you Requested below one lakh rupees");
		
		}
		
		else {
			
			System.out.println("Not Eligible for Loan, You are out of our Requirements");
		}
		
	}
}
