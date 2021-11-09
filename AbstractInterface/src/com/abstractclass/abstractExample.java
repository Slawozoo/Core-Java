package com.abstractclass;

abstract class abstractExample {
	abstract int getRateOfInterest();
}

class SBI extends abstractExample {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends abstractExample {
	int getRateOfInterest() {
		return 8;
	}
}

class TestBank {
	public static void main(String args[]) {
		abstractExample abs;
		abs = new SBI();
		System.out.println("Rate of Interest is: " + abs.getRateOfInterest() + " %");
		abs = new PNB();
		System.out.println("Rate of Interest is: " + abs.getRateOfInterest() + " %");
	}

}
