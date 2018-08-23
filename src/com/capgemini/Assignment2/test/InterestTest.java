package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Interest;

class InterestTest {

	@Test
	void testInterest() {
		assertEquals(10.0,Interest.simple(100,5,2),0.1);
		assertEquals(10.25,Interest.compound(100,5,2),0.1);
		assertEquals(70.0,Interest.simple(500,7,2),0.1);
		assertEquals(72.45,Interest.compound(500,7,2),0.1);
	}

}
