package com.abstractclass;

import java.util.Scanner;

public class abstractMain {
	public static void main(String []args) {
		abstractPersonMethod absPerson = new abstractPersonMethod();
		Scanner scn = new Scanner(System.in);
		int n;
//		int id;
//		String name;
//		String address;
//		String job;
		
		System.out.print("Enter the no. of data to entered: ");
		n = scn.nextInt();
		abstractPersonMethod[] abs = new abstractPersonMethod[n];
		
			System.out.print("Enter id: ");
			absPerson.setId(scn.nextInt());
			
			
			System.out.print("\nEnter name: ");
			absPerson.setName(scn.next());
			
			System.out.print("\nEnter address: ");
			absPerson.setAddress(scn.next());
			System.out.print("\nEnter job of person: ");
			absPerson.setJob(scn.next());
			
		
		System.out.println("Id: \tName: \tAddress: \tJob: ");
		
			System.out.print(absPerson.getId()+"\t");
			
			System.out.print(absPerson.getName()+"\t");
			
			System.out.print(absPerson.getAddress()+"\t\t");
			
			System.out.print(absPerson.getJob()+"\n");
		
		//System.out.print(absPerson);
	}

}
