package com.classobjectmethod;

import java.util.Scanner;

public class CallByReference {
	public void swap(int[] swa) {
		//int num = 2580;
		swa[0]	= 2580;
		System.out.println("Value of a[0] inside swap function : "+swa[0]);
		
		
	}

	public static void main(String[] args) {
		CallByReference call = new CallByReference();
		int[] a = {077,1535};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		System.out.println("Before calling swap function, value of a[0] :"+ a[0]);
		call.swap(a);
		System.out.println("After calling swap function, value of a[0] :"+ a[0]);

	}

}
