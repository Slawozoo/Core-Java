package com.generics;

public class TestGenericsMain {

	public static void main(String[] args) {
		// instance of Integer type
		TestGenerics<Integer> iObj = new TestGenerics<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		TestGenerics<String> sObj = new TestGenerics<String>("Test for generics");
		System.out.println(sObj.getObject());
	}

}
