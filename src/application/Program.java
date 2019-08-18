package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.00);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc = new Account(1001, "Alex", 0.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc02 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc02.withdraw(200.0);
		System.out.println(acc02.getBalance());
		
		Account acc03 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc03.withdraw(200.0);
		System.out.println(acc03.getBalance());
		
	}

}
