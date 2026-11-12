/* 8.Develop a Java application for a bank account management system. Define a
`AccountHolder` class with attributes like `name`, `age`, and `accountNumber`. Then, create
subclasses `SavingsAccount` and `CurrentAccount` that inherit from `AccountHolder` and
add attributes like `balance` and `interestRate`. Implement methods for depositing and
withdrawing the amount. */

package com.te.inheritance3;

public class SavingsAccount extends AccountHolder{
	
	double balance;
	String interestRate;
	
	public SavingsAccount (String name, int age, String accountNumber ,double balance , String interestRate ) {
		
		super(name, age, accountNumber);
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String toString() {
		return "\nName : " +name+ "\nAge : "+age+ "\nAccount Number : "+accountNumber+ "\nBalance : "+balance+ "\nInterest Rate : "+interestRate;
	}
	public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + "\n New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + "\n Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
