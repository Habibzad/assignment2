package com.meritamerica.assignment2;

public class CDOffering {
	
	private int term;
	private double interestRate;
	
	//Constructor
	CDOffering(int term, double interestRate){
		setTerm(term);
		setInterestRate(interestRate);
	}

	//Getters
	public int getTerm() {
		return term;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	//Setters
	public void setTerm(int term) {
		this.term = term;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	
}
