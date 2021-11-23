package com.factorydesign;

public class PlanFactory {
	
	public Plan getPlan(String stringPlan) {
		if(stringPlan == null) {
			return null;
		}
		else if(stringPlan.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		}
		else if(stringPlan.equalsIgnoreCase("Institutional")) {
			return new InstitutionalPlan();
		}
		else if(stringPlan.equalsIgnoreCase("Government")) {
			return new GovernmentPlan();
		}
		return null;
	}

}
