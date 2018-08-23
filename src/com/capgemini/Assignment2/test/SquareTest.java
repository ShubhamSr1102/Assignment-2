package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Square;

class SquareTest {

	@Test
	void testSquare() {
		assertEquals("5 * 1 = 5, Square: 25",Square.calculate(5));
		assertEquals("99 * 1 = 99, Square: 9801",Square.calculate(99));
		assertEquals("-5 * 1 = -5, Square: 25",Square.calculate(-5));
	}

}
