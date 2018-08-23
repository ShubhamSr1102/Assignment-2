package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.Palindrome;

class PalindromeTest {

	@Test
	void tesPalindrome() {
		assertEquals("Palindrome String",Palindrome.check("121"));
		assertEquals("Palindrome String",Palindrome.check("level"));
		assertEquals("Not a Palindrome string",Palindrome.check("1212"));
		assertEquals("Not a Palindrome string",Palindrome.check("Shubham"));
	}

}
