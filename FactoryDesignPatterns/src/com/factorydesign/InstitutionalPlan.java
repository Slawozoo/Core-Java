package com.factorydesign;

public class InstitutionalPlan implements Plan{

	@Override
	public int getRate() {
		int rate = 6;
		System.out.println("Rate for institutional plan: "+rate);
		
		return rate;
	}

	@Override
	public void getBills(int unit) {
		int totalBill = unit* getRate();
		System.out.println("Total bill for institution plan is : "+totalBill);
	}

}
