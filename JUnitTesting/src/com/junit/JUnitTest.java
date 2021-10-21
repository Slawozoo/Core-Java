package com.junit;

public class JUnitTest {
	public int add(int a, int b) {
		return a+b;
	}
	//odd or even
	public String check(int n) {
		if(n%2 == 0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
}
