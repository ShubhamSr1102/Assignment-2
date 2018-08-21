package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Calculator;

class CalculatorTest {

	@Test
	void testCalculator() {
		assertEquals(15, Calculator.sum(10,5));
		assertEquals(5, Calculator.difference(10,5));
		assertEquals(50, Calculator.product(10,5));
		assertEquals(2.0, Calculator.division(10,5));
	}

}
