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
        AccountHolder acc1_holder = new AccountHolder("John", "", "Doe", "555-00-8899");
        System.out.println("New Account:");
        System.out.println("acc1_holder=" + acc1_holder.getFirstName() + " " + acc1_holder.getLastName());
        System.out.println("-----------------------------------------------------\n");
        /*Add a checking account with an opening balance of $1,000 and
        a savings account with an opening balance of $10,000 to acc1*/
        System.out.println("acc1_holder, opening balance of $1,000 and $10,000");
        acc1_holder.addCheckingAccount(1000);
        acc1_holder.addSavingsAccount(10000);

        System.out.println("-----------------------------------------------------\n");

        /*Add another checking account with an opening balance of $5,000 and a
        savings account with an opening balance of $50,000 to acc1*/
        System.out.println("acc1_holder, opening balance of $5,000 and $50,000");
        acc1_holder.addCheckingAccount(5000);
        acc1_holder.addSavingsAccount(50000);
        
        System.out.println(
                "Current combined balance of " + acc1_holder.getFirstName() + " is: " + acc1_holder.getCombinedBalance());
        System.out.println("-----------------------------------------------------\n");

        /*Add a checking account with an opening balance of $50,000 and a
        savings account with an opening balance of $500,000 to acc1 */
        System.out.println("acc1_holder, opening balance of $50,000 and $500,000");
        acc1_holder.addCheckingAccount(50000);
        acc1_holder.addSavingsAccount(500000);
        
        System.out.println(
        		"Current combined balance of " + acc1_holder.getFirstName() + " is: " + acc1_holder.getCombinedBalance());
        System.out.println("-----------------------------------------------------\n");

        /*Add another checking account with an opening balance of $5,000 and a
        savings account with an opening balance of $50,000 to acc1*/
        System.out.println("acc1_holder, opening balance of $5,000 and $50,000");
        acc1_holder.addCheckingAccount(5000);
        acc1_holder.addSavingsAccount(50000);
        
        System.out.println(
        		"Current combined balance of " + acc1_holder.getFirstName() + " is: " + acc1_holder.getCombinedBalance());
        System.out.println("-----------------------------------------------------\n");

        /* Add the best CD offering as a CD account on acc1 */
        acc1_holder.addCDAccount(MeritBank.getBestCDOffering(1000), 1000);

        // Add acc1 to Merit Bank's list of account holders
        MeritBank.addAccountHolder(acc1_holder);

        // Instantiate a new AccountHolder (acc2)
        AccountHolder acc2_holder = new AccountHolder("Lisa", "J", "Thompson", "897-50-2212");
        System.out.println("acc2_holder=" + acc2_holder.getFirstName() + " " + acc2_holder.getLastName());
        System.out.println("-----------------------------------------------------\n");

        /*Add a checking account with an opening balance of $1,000 as well as a
        savings account with an opening balance of $10,000 to acc2 */
        System.out.println("acc2_holder, opening balance of $1,000 and $10,000");
        acc2_holder.addCheckingAccount(new CheckingAccount(1000));
        acc2_holder.addSavingsAccount(new SavingsAccount(10000));
        
        System.out.println("Current combined balance of " + acc1_holder.getFirstName() + " is: " + acc2_holder.getCombinedBalance());
        System.out.println("-----------------------------------------------------\n");

        /* Add the second best CD offering as a CD account on acc2 */
        acc2_holder.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);
        System.out.println("-----------------------------------------------------\n");

        /* Add acc1 to Merit Bank list of account holders */
        MeritBank.addAccountHolder(acc2_holder);

        /* Clear the CDs being offered by MeritBank */
        MeritBank.clearCDOfferings();

        /* Instantiate a new AccountHolder (acc3) */
        AccountHolder acc3_holder = new AccountHolder("James", "", "Wong", "154-00-2525");
        System.out.println("acc1_holder=" + acc3_holder.getFirstName() + " " + acc3_holder.getLastName());

        System.out.println("-----------------------------------------------------\n");

        /* Add a checking account with an opening balance of $1,000 and a
        savings account with an opening balance of $10,000 to acc3 */
        System.out.println("acc3_holder, opening balance of $1,000 and $10,000");
        acc3_holder.addCheckingAccount(1000);
        acc3_holder.addSavingsAccount(10000);
        System.out.println("acc3_holder, current combine balance=" + acc3_holder.getCombinedBalance());
        System.out.println("-----------------------------------------------------\n");

        /* Add acc3 to Merit Bank's list of account holders */
        MeritBank.addAccountHolder(acc3_holder);

        /* Get the total balance of all accounts held by Merit Bank's account holders */
        double bankTotalBalance = MeritBank.totalBalances();
        System.out
                .println("The total balance of all accounts held by Merit Bank's account holders is: " + bankTotalBalance);
        

    }
}