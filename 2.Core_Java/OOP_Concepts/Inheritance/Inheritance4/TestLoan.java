package com.te.inheritance3;

public class TestLoan {

	public static void main(String[] args) {

		LoanApplicant loanApplicant = new LoanApplicant("Smiley", 20, 50,16000, 70000);
		
		System.out.println(loanApplicant);
		
		loanApplicant.eligibleForLoan();
	}

}
