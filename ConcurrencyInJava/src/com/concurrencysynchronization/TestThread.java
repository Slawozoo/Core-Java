package com.concurrencysynchronization;

import java.util.Scanner;

public class TestThread {

	public static void main(String[] args) {
		PrintDemo PD = new PrintDemo();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter name of thread-1: ");
		String name = scn.next();
		System.out.print("Enter name of thread-2: ");
		String name2 = scn.next();
		
		ThreadDemo T1 = new ThreadDemo(name, PD);	//string and class object
		T1.start();
		ThreadDemo T2 = new ThreadDemo(name2, PD);
		T2.start();

		// wait for threads to end
		try {
			T1.join();
			T2.join();
		} 
		catch (Exception e) {
			System.out.println("Interrupted");
		}

	}

}
