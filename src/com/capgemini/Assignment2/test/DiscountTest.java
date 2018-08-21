package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Discount;

class DiscountTest {

	@Test
	void testDiscount() {
		assertEquals(65.0, Discount.calcDiscount(100));
		assertEquals(32.5, Discount.calcDiscount(50));
		assertEquals(65.0, Discount.calcDiscount('d'));
		assertEquals(41.6, Discount.calcDiscount(0100));
	}

}
