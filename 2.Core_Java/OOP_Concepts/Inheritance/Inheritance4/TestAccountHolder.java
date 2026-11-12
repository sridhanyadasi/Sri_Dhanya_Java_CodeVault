package com.te.inheritance3;

public class TestAccountHolder {

	public static void main(String[] args) {

		SavingsAccount savingsAccount = new SavingsAccount("Slicey", 21, "W0042638393SH", 250000,"15%IR");
		
		//System.out.println(savingsAccount);
		
		CurrentAccount currentAccount = new CurrentAccount("Snicey", 22, "W0049038393KJ", 564000,2000); 
	
		//System.out.println(currentAccount);
		
		System.out.println("Savings Account Details:");
        savingsAccount.displayAccountDetails();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(2000);

        System.out.println("\nCurrent Account Details:");
        currentAccount.displayAccountDetails();
        currentAccount.deposit(2000);
        currentAccount.withdraw(5000);
		
	}

}
