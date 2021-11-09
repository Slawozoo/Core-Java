package com.innerclass;

public class InnerSteller {
	String inner = "I am from outer class";
	
	
	public class InnerClass{
		String str = "I am from inner class";
		public void displayString() {
			System.out.println(str);
		}
	}
	public void display() {
		System.out.println(inner);
	}
}
