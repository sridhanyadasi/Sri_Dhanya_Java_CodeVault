/* 8.Develop a Java application for a bank account management system. Define a
`AccountHolder` class with attributes like `name`, `age`, and `accountNumber`. Then, create
subclasses `SavingsAccount` and `CurrentAccount` that inherit from `AccountHolder` and
add attributes like `balance` and `interestRate`. Implement methods for depositing and
withdrawing the amount. */

package com.te.inheritance3;

public class CurrentAccount extends AccountHolder {
	double balance;
    double overDraftLimit;

    public CurrentAccount(String name, int age, String accountNumber, double balance, double overDraftLimit) {
       
    	super (name,age, accountNumber);
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;
	}
    
    public String toString() {
		return "\nName : " +name+ "\nAge : "+age+ "\nAccount Number : "+accountNumber+ "\nBalance : "+balance+ "\nOer Draft Limit : "+overDraftLimit;
	}
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + "\n New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance + overDraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + "\n Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds (including overdraft).");
        }
    }
}
