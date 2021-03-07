package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{
	//Constructor
	CheckingAccount(double balance) {
		super(balance, 0.0001); //0.01%
	}
	
	public CheckingAccount(double balance, double interestRate) {
		super(balance, interestRate);
	}
	
	public CheckingAccount(long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance, interestRate);
	}
}