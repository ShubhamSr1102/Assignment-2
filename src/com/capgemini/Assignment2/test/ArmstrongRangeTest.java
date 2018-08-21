package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.ArmstrongRange;

class ArmstrongRangeTest {

	@Test
	void testArmstrongRange() {
		assertArrayEquals(new int[] {153, 370, 371, 407, 0, 0, 0, 0, 0, 0}, ArmstrongRange.findAllArmstrongNumbers(100, 1000));
		assertArrayEquals(new int[] {153, 370, 371, 407, 0, 0, 0, 0, 0, 0}, ArmstrongRange.findAllArmstrongNumbers(100, 500));
		assertArrayEquals(new int[] {153, 0, 0, 0, 0, 0, 0, 0, 0, 0}, ArmstrongRange.findAllArmstrongNumbers(100, 200));
		assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, ArmstrongRange.findAllArmstrongNumbers(10, 100));
	}

}
