package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.DateFormat;

class DateFormatTest {

	@Test
	void testDateFormat() {
		assertEquals("11/February/1996",DateFormat.changeFormat("11,02,1996"));
		assertEquals("04/April/1998",DateFormat.changeFormat("04,04,1998"));
		assertEquals("Wrong Date",DateFormat.changeFormat("11,22,1996"));
		assertEquals("01/October/1989",DateFormat.changeFormat("01,10,1989"));
	}

}
