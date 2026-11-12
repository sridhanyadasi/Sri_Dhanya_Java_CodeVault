/* 8.Develop a Java application for a bank account management system. Define a
`AccountHolder` class with attributes like `name`, `age`, and `accountNumber`. Then, create
subclasses `SavingsAccount` and `CurrentAccount` that inherit from `AccountHolder` and
add attributes like `balance` and `interestRate`. Implement methods for depositing and
withdrawing the amount. */

package com.te.inheritance3;

public class AccountHolder {
	
	String name;
	int age;
	String accountNumber;

	public AccountHolder (String name, int age, String accountNumber) {
		super();
		this.name = name;
		this.age = age;
		this.accountNumber = accountNumber;
	}
	
	
	public void displayAccountDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Account Number: " + accountNumber);
    }

	public void depositing() {
		System.out.println("This block used for Deposit/Credit the Money");
	}
	
	public void withdrawing() {
		System.out.println("This block used for WithDraw/Debit the Money");
	}
}
