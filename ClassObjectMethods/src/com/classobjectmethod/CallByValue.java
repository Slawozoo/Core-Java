package com.classobjectmethod;

import java.util.Scanner;

public class CallByValue {
	public void swap(int x, int y) {
		int num;
		num = x;
		x = y;
		y = num;
		System.out.println("Inside function, value of a & b :"+ x +" "+y);
		
	}
	
	
	public static void main(String[] args) {
		CallByValue call = new CallByValue();
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before calling swap function, value of a & b :"+ a +" "+b);
		call.swap(a,b);
		System.out.println("After calling swap function, value of a & b :"+ a +" "+b);

	}

}
