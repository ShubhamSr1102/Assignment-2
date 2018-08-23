package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.MultiDimArray;

class MultiDimArrayTest {

	@Test
	void testMultiDimArray() {
		assertEquals("Element found at index = 1,1\n",MultiDimArray.search((new int[][] {{100, 90, 80},
															  {95, 85, 75},
															  {88, 88, 88}}),85));
		assertEquals("Element found at index = 2,0\nElement found at index = 2,1\n",MultiDimArray.search((new int[][] {{100, 90, 80},
																						 							{95, 85, 75},
																						 							{88, 88, 98}}),88));
		assertEquals("Number not found",MultiDimArray.search((new int[][] {{100, 90, 80},
			  															   {95, 85, 75},
			  												    		   {68, 88, 78}}),8));
	}

}
