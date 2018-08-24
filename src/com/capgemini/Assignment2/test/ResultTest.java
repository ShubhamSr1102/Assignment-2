package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Result;

class ResultTest {

	@Test
	void testResult() {
		assertEquals("Passed",Result.grade(100,90,80));
		assertEquals("Promoted",Result.grade(100,90,40));
		assertEquals("Failed",Result.grade(50,40,80));
		assertEquals("Failed",Result.grade(50,40,30));
	}

}
