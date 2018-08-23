package com.capgemini.Assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Assignment2.WordRev;

class WordRevTest {

	@Test
	void testWordRevTest() {
		assertEquals("olleH ssenkrad ym dlo ,dneirf I evah emoc ot klat ot uoy niaga ",WordRev.reverseString("Hello darkness my old friend, I have come to talk to you again"));
		assertEquals("mahbuhS avatsavirS ",WordRev.reverseString("Shubham Srivastava"));
	}

}
