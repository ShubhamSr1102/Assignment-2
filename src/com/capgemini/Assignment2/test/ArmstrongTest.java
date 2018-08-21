package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Armstrong;

class ArmstrongTest {

	@Test
	void testArmstrong() {
		assertEquals(1,Armstrong.checkArmstrong(153));
		assertEquals(0,Armstrong.checkArmstrong(141));
		assertEquals(0,Armstrong.checkArmstrong(3101));
		assertEquals(0,Armstrong.checkArmstrong(0420));
		assertEquals(0,Armstrong.checkArmstrong(0x410));
	}

}
