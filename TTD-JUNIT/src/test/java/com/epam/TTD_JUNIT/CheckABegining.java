package com.epam.TTD_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckABegining {

	MyTesting loophole;
	@BeforeEach
	void excecuteBefore() {
		loophole = new MyTesting();
	}
	@Test
	void test1() {
		assertEquals("BC", loophole.remove("AABC"));
	}
	@Test
	void testCase2() {
		assertEquals("BCDAA", loophole.remove("BCDAA"));
	}
	@Test
	void testCase3() {
		assertEquals("BCDA", loophole.remove("ABCDA"));
	}
	@Test
	void testCase4() {
		assertEquals("", loophole.remove("AA"));
	}
	@Test
	void testCase5() {
		assertEquals("", loophole.remove(""));
	}
	@Test
	void testCase6() {
		assertEquals("", loophole.remove("A"));
	}

}
