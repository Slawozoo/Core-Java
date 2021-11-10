package com.generics;

public class GenericsBoxExample<T> {
	   private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }

	   public static void main(String[] args) {
		   GenericsBoxExample<Integer> integerBox = new GenericsBoxExample<Integer>();
		   GenericsBoxExample<String> stringBox = new GenericsBoxExample<String>();
	    
	      integerBox.add(new Integer(10));
	      stringBox.add(new String("Hello World from string"));

//	      System.out.printf("Integer Value :%d\n\n", integerBox.get());
	      System.out.print("Integer Value :"+integerBox.get()+"\n");
	      System.out.printf("String Value :%s\n", stringBox.get());
	   }
	}
