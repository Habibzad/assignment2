package com.meritamerica.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MeritBank {
    private static ArrayList<CDOffering> cdOfferings = new ArrayList<CDOffering>();
    private static ArrayList<AccountHolder> accountHolders = new ArrayList<AccountHolder>();
    private static long getAccountNumber = 100000;
    public static double accountLimit = 250000.0;

    static void addAccountHolder(AccountHolder accountHolder) {
    	accountHolders.add(accountHolder);
    }

    static AccountHolder[] getAccountHolders() {
    	AccountHolder[] accounts = accountHolders.toArray(new AccountHolder[accountHolders.size()]);
        return accounts;
    }

    static CDOffering[] getCDOfferings() {
    	CDOffering[] accounts = cdOfferings.toArray(new CDOffering[cdOfferings.size()]);
        return accounts;
    }

    static CDOffering getBestCDOffering(double depositAmount) {
    	System.out.println("cdOfferings.size()=" + cdOfferings.size());
        if (cdOfferings.size() <= 0) {
            return null;
        }
        ArrayList<Double> offerAmounts = new ArrayList<Double>();
        for (int i = 0; i < cdOfferings.size(); i++) {
            offerAmounts.add(depositAmount * cdOfferings.get(i).getInterestRate());
        }
        int bestIndex = getMax(offerAmounts, -1);
        return cdOfferings.get(bestIndex);
    }

    static CDOffering getSecondBestCDOffering(double depositAmount) {
    	System.out.println("cdOfferings.size()=" + cdOfferings.size());

        if (cdOfferings.size() <= 0) {
            return null;
        }
        ArrayList<Double> offerAmounts = new ArrayList<Double>();
        for (int i = 0; i < cdOfferings.size(); i++) {
            offerAmounts.add(depositAmount * cdOfferings.get(i).getInterestRate());
        }
        int bestIndex = getMax(offerAmounts, -1);
        double bestOffer = (double) offerAmounts.get(bestIndex);
        int secondIndex = getMax(offerAmounts, bestOffer);

        return cdOfferings.get(secondIndex);
    }

    static void clearCDOfferings() {
    	cdOfferings.clear();
    }

    static void setCDOfferings(CDOffering[] offerings) {
    	for (CDOffering offering : offerings)
            cdOfferings.add(offering);
    }

    static long getNextAccountNumber() {
    	getAccountNumber += 1;
        return getAccountNumber;
    }

    static double totalBalances() {
    	double totalBalances = 0;
        for (AccountHolder accountHolder : accountHolders) {
            totalBalances += accountHolder.getCombinedBalance();
        }
        return totalBalances;
    }

    static double futureValue(double presentValue, double interestRate, int term) {
    	double futureBalanace = 0;
        futureBalanace = presentValue * Math.pow(1 + interestRate, term);
        return futureBalanace;
    }
    
    public static int getMax(ArrayList<Double> valueList, double valueCompare) {
        double maxValue = valueList.get(0);
        int maxIndex = 0;
        for (int i = 1; i < valueList.size(); i++) {
            boolean isMax = false;
            double value = valueList.get(i);
            if (valueCompare < 0) {
                isMax = value > maxValue;
            } else {
                isMax = (value > maxValue) && (value < valueCompare);
            }

            if (isMax) {
                maxValue = value;
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}