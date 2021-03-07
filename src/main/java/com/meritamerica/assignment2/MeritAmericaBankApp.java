package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
	    
	    CDOffering[] CDOfferings = new CDOffering[5];
		CDOfferings[0] = new CDOffering(1, 1.8 / 100);
		CDOfferings[1] = new CDOffering(2, 1.9 / 100);
		CDOfferings[2] = new CDOffering(3, 2.0 / 100);
		CDOfferings[3] = new CDOffering(5, 2.5 / 100);
		CDOfferings[4] = new CDOffering(10, 2.2 / 100);
		MeritBank.setCDOfferings(CDOfferings);
	    
	 // Instantiate a new AccountHolder (acc1)
	 		AccountHolder acc1_holder = new AccountHolder("AHAONE", "SIMSONS", "", "123456789");

	 		System.out.println("acc1_holder=" + acc1_holder.getFirstName() + " " + acc1_holder.getLastName() + " ("
	 				+ acc1_holder.getSSN() + ")");
	 		System.out.println("=====================================================");
	 		// Add a checking account with an opening balance of $1,000 as well as
	 		// a savings account with an opening balance of $10,000 to acc1
	 		System.out.println("acc1_holder, opening balance of $1,000 and $10,000");
	 		try {
	 			CheckingAccount acc1_checking1 = acc1_holder.addCheckingAccount(1000);
	 			SavingsAccount acc1_saving1 = acc1_holder.addSavingsAccount(10000);
		 		if (acc1_checking1 != null && acc1_saving1 != null) {
		 			System.out.println(
		 					"acc1_holder, acc1_checking1=" + acc1_checking1.getAccountNumber() + " " + acc1_checking1.getBalance());
		 			System.out.println(
		 					"acc1_holder, acc1_saving1=" + acc1_saving1.getAccountNumber() + " " + acc1_saving1.getBalance());
		 		}
		 		System.out.println(
		 				acc1_holder.getFirstName() + " has a current combined balance=" + acc1_holder.getCombinedBalance());
            }catch (NullPointerException e) {
            	System.out.println("Exception occured:");
            }
	 		
	 		
	 		System.out.println("=====================================================");

	 		// Add a checking account with an opening balance of $5,000 as well as a
	 		// savings account with an opening balance of $50,000 to acc1
	 		System.out.println("acc1_holder, opening balance of $5,000 and $50,000");
	 		CheckingAccount acc1_checking2 = acc1_holder.addCheckingAccount(5000);
	 		SavingsAccount acc1_saving2 = acc1_holder.addSavingsAccount(50000);
	 		if (acc1_checking2 != null && acc1_saving2 != null) {
	 			System.out.println(
	 					"acc1_holder, acc1_check2=" + acc1_checking2.getAccountNumber() + " " + acc1_checking2.getBalance());
	 			System.out.println(
	 					"acc1_holder, acc1_saving2=" + acc1_saving2.getAccountNumber() + " " + acc1_saving2.getBalance());
	 		}
	 		System.out.println(
	 				acc1_holder.getFirstName() + " has a current combined balance=" + acc1_holder.getCombinedBalance());
	 		System.out.println("=====================================================");

	 		// Add a checking account with an opening balance of $50,000 as well as a
	 		// savings account with an opening balance of $500,000 to acc1
	 		System.out.println("acc1_holder, opening balance of $50,000 and $500,000");
	 		CheckingAccount acc1_checking3 = acc1_holder.addCheckingAccount(50000);
	 		SavingsAccount acc1_saving3 = acc1_holder.addSavingsAccount(500000);
	 		if (acc1_checking3 != null && acc1_saving3 != null) {
	 			System.out.println(
	 					"acc1_holder, acc1_check3=" + acc1_checking3.getAccountNumber() + " " + acc1_checking3.getBalance());
	 			System.out.println(
	 					"acc1_holder, acc1_saving3=" + acc1_saving3.getAccountNumber() + " " + acc1_saving3.getBalance());
	 		}
	 		System.out.println(
	 				acc1_holder.getFirstName() + " has a current combined balance=" + acc1_holder.getCombinedBalance());
	 		System.out.println("=====================================================");

	 		// Add a checking account with an opening balance of $5,000 as well as a
	 		// savings account with an opening balance of $50,000 to acc1
	 		System.out.println("acc1_holder, opening balance of $5,000 and $50,000");
	 		CheckingAccount acc1_checking4 = acc1_holder.addCheckingAccount(5000);
	 		SavingsAccount acc1_saving4 = acc1_holder.addSavingsAccount(50000);
	 		if (acc1_checking4 != null && acc1_saving4 != null) {
	 			System.out.println(
	 					"acc1_holder, acc1_check4=" + acc1_checking4.getAccountNumber() + " " + acc1_checking4.getBalance());
	 			System.out.println(
	 					"acc1_holder, acc1_saving4=" + acc1_saving4.getAccountNumber() + " " + acc1_saving4.getBalance());
	 		}
	 		System.out.println(
	 				acc1_holder.getFirstName() + " has a current combined balance=" + acc1_holder.getCombinedBalance());
	 		System.out.println("=====================================================");

	 		// Add the best CD offering as a CD account on acc1
	 		CDOffering bestOffer = MeritBank.getBestCDOffering(acc1_holder.getCombinedBalance());
	 		System.out.println("acc1_holder, has best term?=" + (bestOffer != null));
	 		if (bestOffer != null) {
	 			CDAccount acc1_cdacct = new CDAccount(bestOffer, acc1_holder.getCombinedBalance());
	 			acc1_holder.addCDAccount(acc1_cdacct);
	 			System.out.println("acc1_holder, best term=" + acc1_cdacct.getTerm());
	 		}
	 		System.out.println("=====================================================");

	 		// Add acc1 to Merit Bank's list of account holders
	 		MeritBank.addAccountHolder(acc1_holder);

	 		// Instantiate a new AccountHolder (acc2)
	 		AccountHolder acc2_holder = new AccountHolder("acc2", "assignment2", "", "Y123456789");
	 		System.out.println("acc2_holder=" + acc2_holder.getFirstName() + " " + acc2_holder.getLastName() + " ("
	 				+ acc2_holder.getSSN() + ")");
	 		System.out.println("=====================================================");

	 		// Add a checking account with an opening balance of $1,000 as well as a
	 		// savings account with an opening balance of $10,000 to acc2
	 		System.out.println("acc2_holder, opening balance of $1,000 and $10,000");
	 		CheckingAccount acc2_check1 = acc2_holder.addCheckingAccount(1000);
	 		SavingsAccount acc2_saving1 = acc2_holder.addSavingsAccount(10000);
	 		if (acc2_check1 != null && acc2_saving1 != null) {
	 			System.out
	 					.println("acc2_holder, acc2_check1=" + acc2_check1.getAccountNumber() + " " + acc2_check1.getBalance());
	 			System.out.println(
	 					"acc2_holder, acc2_saving1=" + acc2_saving1.getAccountNumber() + " " + acc2_saving1.getBalance());
	 		}
	 		System.out.println("acc2_holder, current combine balance=" + acc2_holder.getCombinedBalance());
	 		System.out.println("=====================================================");

	 		// Add the second best CD offering as a CD account on acc2
	 		CDOffering secondBestOffer = MeritBank.getSecondBestCDOffering(acc2_holder.getCombinedBalance());
	 		System.out.println("acc2_holder, has 2nd best term?=" + (secondBestOffer != null));
	 		if (secondBestOffer != null) {
	 			CDAccount acc2_cdacct = new CDAccount(secondBestOffer, acc2_holder.getCombinedBalance());
	 			acc2_holder.addCDAccount(acc2_cdacct);
	 			System.out.println("acc2_holder, 2nd best term=" + acc2_cdacct.getTerm());
	 		}
	 		System.out.println("=====================================================");

	 		// Add acc1 to Merit Bank list of account holders
	 		MeritBank.addAccountHolder(acc2_holder);

	 		// Clear the CDs being offered by MeritBank
	 		MeritBank.clearCDOfferings();

	 		// Instantiate a new AccountHolder (acc3)
	 		AccountHolder acc3_holder = new AccountHolder("acc3", "assignment2", "", "Z123456789");
	 		System.out.println("acc3_holder=" + acc3_holder.getFirstName() + " " + acc3_holder.getLastName() + " ("
	 				+ acc3_holder.getSSN() + ")");
	 		System.out.println("=====================================================");

	 		// Add the second best CD offering as a CD account on acc3
	 		CDOffering secondBestOffer2 = MeritBank.getSecondBestCDOffering(acc3_holder.getCombinedBalance());
	 		System.out.println("acc2_holder, has 2nd best term?=" + (secondBestOffer2 != null));
	 		if (secondBestOffer2 != null) {
	 			CDAccount acc3_cdacct = new CDAccount(secondBestOffer2, acc3_holder.getCombinedBalance());
	 			acc2_holder.addCDAccount(acc3_cdacct);
	 			System.out.println("acc2_holder, 2nd best term=" + secondBestOffer2.getTerm());
	 		}
	 		;

	 		System.out.println("=====================================================");

	 		// Add a checking account with an opening balance of $1,000 as well as a
	 		// savings account with an opening balance of $10,000 to acc3
	 		System.out.println("acc3_holder, opening balance of $1,000 and $10,000");
	 		CheckingAccount acc3_check1 = acc3_holder.addCheckingAccount(1000);
	 		SavingsAccount acc3_saving1 = acc3_holder.addSavingsAccount(10000);
	 		if (acc3_check1 != null && acc3_saving1 != null) {
	 			System.out
	 					.println("acc3_holder, acc3_check1=" + acc3_check1.getAccountNumber() + " " + acc3_check1.getBalance());
	 			System.out.println(
	 					"acc3_holder, acc3_saving1=" + acc3_saving1.getAccountNumber() + " " + acc3_saving1.getBalance());
	 		}
	 		System.out.println("acc3_holder, current combine balance=" + acc3_holder.getCombinedBalance());
	 		System.out.println("=====================================================");

	 		// Add acc3 to Merit Bank's list of account holders
	 		MeritBank.addAccountHolder(acc3_holder);

	 		// Get the total balance of all accounts held by Merit Bank's account holders
	 		double bankTotalBalance = MeritBank.totalBalances();
	 		System.out
	 				.println("The total balance of all accounts held by Merit Bank's account holders= " + bankTotalBalance);
	 		System.out.println("=====================================================");

	  }
}