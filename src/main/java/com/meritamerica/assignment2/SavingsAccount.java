package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount{
	//Constructor
	SavingsAccount(double balance) {
		super(balance, 0.01); //Interest Rate: 0.1%
	}
	
	public SavingsAccount(double balance, double interestRate) {
		super(balance, interestRate);
	}
	
	public SavingsAccount(long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance, interestRate);
	}
}