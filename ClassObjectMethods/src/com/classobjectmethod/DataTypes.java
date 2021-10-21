package com.classobjectmethod;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		//	Basic data types
		int a;
		char ch;
		String name;
		long ln;
		double db;
		short sh;
		float f;
		
		//input taken from user for data variables 
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter name : ");
		name = scn.nextLine();
		System.out.print("Enter an integer :");
		a = scn.nextInt();
		System.out.print("Enter a character :");
		ch = scn.next().charAt(0);
		
		System.out.print("Enter long no. :");
		ln = scn.nextLong();
		System.out.print("Enter Double no. :");
		db = scn.nextDouble();
		System.out.print("Enter short no. : ");
		sh = scn.nextShort();
		System.out.print("Enter floating value :");
		f = scn.nextFloat();
		
		//Typecasting
		int in = (int)ln;
		System.out.println("Name Integer Char    Long    Double    Short    Float    Typecasting value");
		System.out.println(name+"	"+a+" 	"+ch+" 	"+ln+" 	"+db+"	 "+sh+"	 "+f+"	 "+ln);
		
	}
}
