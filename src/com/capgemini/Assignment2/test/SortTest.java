package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Sort;

class SortTest {

	@Test
	void testSort() {
		assertArrayEquals(new int [] {1, 5, 6, 7, 12, 14, 19, 23, 26, 35, 37, 47, 52, 78, 86},Sort.sortArray());
	}

}
