package com.factorydesign;

public class GovernmentPlan implements Plan{

	@Override
	public int getRate() {
		int rate = 4;
		System.out.println("Rate for government plan: "+rate);
		
		return rate;
	}

	@Override
	public void getBills(int unit) {
		int totalBill = unit* getRate();
		System.out.println("Total bill for government plan is : "+totalBill);
		
		
	}
}
