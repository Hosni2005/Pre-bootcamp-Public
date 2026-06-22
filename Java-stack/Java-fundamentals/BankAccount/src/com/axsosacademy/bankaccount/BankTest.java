package com.axsosacademy.bankaccount;

public class BankTest {
	    public static void main(String[] args){
	        // Create 3 bank accounts
	        BankAccount acc1 = new BankAccount();
	        BankAccount acc2 = new BankAccount();
	        BankAccount acc3 = new BankAccount();
	        // Deposit Test
	        // - deposit some money into each bank account's checking or savings account and display the balance each time
	        // - each deposit should increase the amount of totalMoney
	        acc1.deposit("checking", 100000);
	        acc1.deposit("savings", 150000);
	        acc2.deposit("checking", 80000);
	        acc2.deposit("savings", 50000);
	        acc3.deposit("checking", 10000);
	        acc3.deposit("savings", 5000);
	        System.out.println("Account 1 Balance :" + acc1.getBalance());
	        System.out.println("Account 2 Balance :" + acc2.getBalance());
	        System.out.println("Account 3 Balance :" + acc3.getBalance());
	        
	        
	        
	        
	        acc1.withdraw("checking", 5000);
	        acc1.withdraw("savings", 500);
	        acc2.withdraw("checking", 4800);
	        acc2.withdraw("savings", 500);
	        acc3.withdraw("checking", 1100);
	        acc3.withdraw("savings", 500);
	        System.out.println("Account 1 Balance :" + acc1.getBalance());
	        System.out.println("Account 2 Balance :" + acc2.getBalance());
	        System.out.println("Account 3 Balance :" + acc3.getBalance());
	        
	        System.out.println("Total Accounts: " + BankAccount.getaccounts());
	        System.out.println("Total Money: " + BankAccount.gettotalMoney());
	        
	        
	        
	    }
	    
}
