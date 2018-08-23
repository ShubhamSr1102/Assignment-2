package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Search;

class SearchTest {

	@Test
	void testSearch() {
		assertEquals(1,Search.findNumber(19));
	}

}
