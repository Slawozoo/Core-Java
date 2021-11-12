package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorLambdaExpression {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();	
		//FilterCollection.. class have product class and we can access id name and price from that class

		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}

	}
}
