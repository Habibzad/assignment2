package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		
		CDOffering oneYearTerm, twoYearsTerm, threeYearsTerm, fourYearsTerm, fiveYearsTerm; 
		
		oneYearTerm = new CDOffering(1, 0.018);     //1.8%
		twoYearsTerm = new CDOffering(2, 0.019);    //1.9%
		threeYearsTerm = new CDOffering(3, 0.018);  //2.0%
		fourYearsTerm = new CDOffering(5, 0.018);   //2.5%
		fiveYearsTerm = new CDOffering(10, 0.018);  //2.2% ?????
		
		AccountHolder ah1 = new AccountHolder("Lisa", "", "Jphnson", "888-52-0052");
	}
}