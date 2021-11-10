package com.staticfinal;

public final class FinalJavaExample {	//we cannot inherit final class
	public static final String country = "Nepal";
	
	public  void showCountry(String country) {
		System.out.println("Name of Country: "+this.country);
		System.out.println("Name of country entered: "+country);
		//this.country = country;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalJavaExample finalJava = new FinalJavaExample();
		finalJava.showCountry("India");
	}

}
