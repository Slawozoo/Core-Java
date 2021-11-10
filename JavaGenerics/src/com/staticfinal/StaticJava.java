package com.staticfinal;

public class StaticJava {
	static int x = 100;
	public static void addInteger(int a, int b) {
		x = a+b;
		System.out.println("Result :"+x);
	}
	public void display() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
	
		StaticJava stat = new  StaticJava();
		System.out.println("X: "+StaticJava.x); 	//accessing static variable
		StaticJava.addInteger(75, 15);	//accessing static methods
		stat.display();	//accessing non static methods with the help of object of class
		

	}

}
