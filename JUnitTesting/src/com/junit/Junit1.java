package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit1 {

	//@Test
	void test() {
		JUnitTest test = new JUnitTest();
		int sum = test.add(5, 4);
		String check = test.check(53313);
		
		assertEquals(9, sum);
		assertEquals("even", check);
		
		
	}

}
