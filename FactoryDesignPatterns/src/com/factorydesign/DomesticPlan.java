package com.factorydesign;

public class DomesticPlan implements Plan{

	@Override
	public int getRate() {
		int rate = 5;
		System.out.println("Rate for domestic plan: "+rate);
		return rate;
	}

	@Override
	public void getBills(int unit) {
		int totalBill = unit* getRate();
		System.out.println("Total bill for domestic plan is : "+totalBill);
		
	}
}
