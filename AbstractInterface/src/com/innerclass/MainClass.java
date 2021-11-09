package com.innerclass;

public class MainClass {

	public static void main(String[] args) {
		InnerSteller in = new InnerSteller();
		in.display();
		
		InnerSteller.InnerClass inner = in.new InnerClass();
		inner.displayString();
		
		
		OuterInnerDeclaration out = new OuterInnerDeclaration();
		out.outerMethod();
	}

}
