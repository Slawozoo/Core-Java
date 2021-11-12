package com.lambdaexpression;

public class LambdaTest {
	@FunctionalInterface
	interface MathOperation {
		int operation(int a, int b);
	}

	@FunctionalInterface
	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	public static void main(String[] args) {
		LambdaTest test = new LambdaTest();
		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;
		// without type declaration
		MathOperation subtraction = (a, b) -> a - b; // not need to declare type of variable

		// with return statement along with curly braces
		MathOperation division = (a, b) -> {
			return a / b;
		};
		// without return statement
		MathOperation multiplication = (int a, int b) -> a * b;

		System.out.println("10 + 5 = " + test.operate(10, 5, addition));
		System.out.println("10 - 5 = " + test.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + test.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + test.operate(10, 5, division));
		
		//without parenthesis
	      GreetingService greetService1 = messages ->
	      System.out.println("Hello " + messages);
			
	      //with parenthesis
	      GreetingService greetService2 =  (message) ->
	      {
	    	  System.out.println("Hello " + message) ;
	      };	//using curly braces
			
	      GreetingService greet=(name)->{  
	            System.out.println("Hello, "+name);  
	        };  
	        greet.sayMessage("Sonoo");  
	      
	      greetService1.sayMessage("World");
	      greetService2.sayMessage("Java");

	}

}
