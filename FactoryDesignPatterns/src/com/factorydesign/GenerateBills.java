package com.factorydesign;

import java.util.Scanner;

public class GenerateBills {

	public static void main(String[] args) {
		
		PlanFactory planFactory = new PlanFactory();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter which plan you want to select: Government | Institutional | Domestic ");
		String selectPlan = scn.next();
		System.out.println("Enter the unit you want to send for calculation: ");
		int unit = scn.nextInt();
		
		Plan plan1 = planFactory.getPlan(selectPlan);
		plan1.getBills(unit);

	}

}
