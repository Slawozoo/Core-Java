package com.classobjectmethod;

import java.util.Scanner;

public class ControlStatement {
	public void forLoop() {
		int i,j;
		String name = "APPLE";
		char[] ch = name.toCharArray();
		
		
		for(i = 0; i < ch.length ; i++) {
			for(j = ch.length; j > i; j--) {
				System.out.print(ch[i]);
				
			}
			
			System.out.print("\n");
		
		}
		
	}
	public void ifLoop() {
		int n = 25;
		if(n % 2 == 0) {
			System.out.println("The entered no is even");
		}
		else {
			System.out.println("The no. is odd");
		}
		
	}
	public void whileLoop() {
		int x= 15;
		while(x<20) {
			System.out.println(x);
			x++;
		}
				
	}
	public void doWhileLoop() {
		int x = 25;
		do {
			System.out.println(x);
			x--;
		}while(x>17);
		
		
		
	}
	public void forEachLoop() {
		String []cars = {"Bugatti","Lambo","Volkswagen","Honda","Hundai"};
		for(String str : cars) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		ControlStatement stmt = new ControlStatement();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the case to perform :");
		String swtch = scn.nextLine();
		switch (swtch) {
		case "for":
			stmt.forLoop();
			
			break;
		case "if":
			stmt.ifLoop();
			
			break;
		case "while":
			stmt.whileLoop();
			
			break;
		case "doWhile":
			stmt.doWhileLoop();
			
			break;
		case "forEach":
			stmt.forEachLoop();
			
			break;

		default:
			System.out.println("Incorrect choice!!!!!");
			break;
		}

	}

}
