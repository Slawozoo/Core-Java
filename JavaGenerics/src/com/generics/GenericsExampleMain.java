package com.generics;

import java.lang.reflect.Array;
import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class GenericsExampleMain {

	public static void main(String[] args) {
		
		GenericExampleClass<String> genericString = new GenericExampleClass<String>();
		genericString.list.add("This is 1st element");
		genericString.list.add("This is 2nd element");
		genericString.list.add("This is 3rd element");
		
		genericString.setValue(genericString.list);
		
		genericString.showList();
		System.out.print(" " );
		
		
		GenericExampleClass<Integer> genericInteger = new GenericExampleClass<Integer>();
		int n;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no of the list: ");
		n = scn.nextInt();
		Integer[] array = new Integer[n];
		for(int i =0; i<n;i++) {
			array[i] = scn.nextInt();
			genericInteger.list.add(array[i]);
		}
//		genericInteger.list.add(array[i]);
//		genericInteger.list.add();
//		genericInteger.list.add();
//		
		genericInteger.setValue(genericInteger.list);
		
		genericInteger.showList();
		System.out.print(" " );

	}

}
