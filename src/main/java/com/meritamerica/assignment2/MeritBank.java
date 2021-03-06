package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	private static CDOffering[] cdOfferings = new CDOffering[5];
	private static AccountHolder[] accountHolders = new AccountHolder[10];
	private static int accountIndex = 0;

  static void addAccountHolder(AccountHolder accountHolder) {
    accountHolders[accountIndex] = accountHolder;
    accountIndex++;
  }

  static AccountHolder[] getAccountHolders() {
	  return accountHolders;
  }

  static CDOffering[] getCDOfferings() {
	  return cdOfferings;
  }

  static CDOffering getBestCDOffering(double depositAmount) {
	  double max = 0;
	  int cdNum = 0;
	  for(int i = 0; i < cdOfferings.length; i++) {
		  double value = futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm());
		  if(value >= max) {
			  max = value;
			  cdNum = i;
		  }
	  }
	  return cdOfferings[cdNum];
  }

  static CDOffering getSecondBestCDOffering(double depositAmount) {
	  double max = 0;
	  int cdNum = 0;
	  int lastCDNum = 0;
	  for(int i = 0; i < cdOfferings.length; i++) {
		  double value = futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm());
		  if(value >= max) {
			  max = value;
			  lastCDNum = cdNum;
			  cdNum = i;
		  }
	  }
	  return cdOfferings[lastCDNum];
  }

  static void clearCDOfferings() {
	  cdOfferings = null;
  }

  static void setCDOfferings(CDOffering[] offerings) {
	  cdOfferings = offerings;
  }

  static long getNextAccountNumber() {
	  return (long)((Math.random() * 15) + 5);	// TODO
  }

  static double totalBalances() {
	  int count = 0;
	    int total = 0;
	    while(accountHolders[count] != null) {
	    	total += accountHolders[count].getCombinedBalance();
	    	count++;
	    }
	    return total;
  }

  static double futureValue(double presentValue, double interestRate, int term) {
	  return presentValue * Math.pow(1 + interestRate, term);
  }
}