package com.innerclass;

public class OuterInnerDeclaration {
	void outerMethod() {
		System.out.println("inside outerMethod");

		// Class 2
		// Inner class
		// It is local to outerMethod()
		class InnerClass {

			// Method defined inside inner class
			void innerMethod() {

				// called
				System.out.println("inside innerMethod");
			}
		}

		// Creating object of inenr class
		InnerClass y = new InnerClass();

		// Calling over method defined inside it
		y.innerMethod();
	}

}
