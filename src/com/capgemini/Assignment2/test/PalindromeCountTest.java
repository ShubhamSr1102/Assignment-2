package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.PalindromeCount;

class PalindromeCountTest {

	@Test
	void testPalindromeCount() {
		assertArrayEquals(new String[]{"lololol", "lolol", "lol", "l", null, null, null, null, null, null},PalindromeCount.findPalindromes(new String[] {"l", "lo", "lol", "lolo", "lolol", "lololo", "lololol", "awef", "wafe", "waef"}));
	}

}
