package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount{
	//Constructor
	SavingsAccount(double balance) {
		super(balance, 0.01); //Interest Rate: 0.1%
	}
}