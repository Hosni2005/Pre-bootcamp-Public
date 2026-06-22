package com.axsosacademy.bankaccount;

public class BankAccount {
private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    public BankAccount() {
    	checkingBalance =0 ;
    	savingsBalance = 0 ;
    	accounts++ ;
    }
    
    // GETTERS

    public double getcheckingBalance() {
	 return checkingBalance;
 }
 public double getsavingsBalance() {
	 return savingsBalance ;
 }
 public static int getaccounts() {
	 return accounts ;
 }
 public static double gettotalMoney() {
	 return totalMoney ;
 }
    
    // for checking, savings, accounts, and totalMoney
    
    // METHODS
    // deposit
 public void deposit(String accountType, double amount) {
	 
     switch (accountType) {
         case "checking":
             checkingBalance += amount;
             break;

         case "savings":
             savingsBalance += amount;
             break;

         default:
             System.out.println("Invalid account type");
             return;
     }

     totalMoney += amount;
 }

 
    
    // withdraw 
 public void withdraw(String accountType, double amount) {
	    switch (accountType) {
	        case "checking":
	            if (checkingBalance >= amount) {
	                checkingBalance -= amount;
	                totalMoney -= amount;
	            } else {
	                System.out.println("Insufficient checking funds");
	            }
	            break;
	        case "savings":
	            if (savingsBalance >= amount) {
	                savingsBalance -= amount;
	                totalMoney -= amount;
	            } else {
	                System.out.println("Insufficient savings funds");
	            }
	            break;
	        default:
	            System.out.println("Invalid account type");
	    }
	}
 public double getBalance() {

     return checkingBalance + savingsBalance;
 
 }
}
