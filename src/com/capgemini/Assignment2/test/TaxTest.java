package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Tax;

class TaxTest {

	@Test
	void testTax() {
	assertEquals(15000.0,Tax.calculate(315000));
	assertEquals(202000.0,Tax.calculate(1000000));
	assertEquals(-1,Tax.calculate(-1000000));
	}

}
