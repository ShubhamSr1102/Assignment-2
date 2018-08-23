package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.NameSearch;

class NameSearchTest {

	@Test
	void testNameSearch() {
		assertEquals("Name found with number of occurences: 2",NameSearch.search("Dave"));
		assertEquals("Name found with number of occurences: 2",NameSearch.search("dave"));
		assertEquals("Name found with number of occurences: 1",NameSearch.search("Agati"));
		assertEquals("Name not found",NameSearch.search("Shubham"));
	}

}
