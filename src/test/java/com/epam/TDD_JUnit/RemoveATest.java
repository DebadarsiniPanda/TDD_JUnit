package com.epam.TDD_JUnit;

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {

	/** TODO LIST
	   * ABCD => BCD
	   * AACD=> CD
	   * BACD => BCD
	   * BBAA => BBAA
	   * AABAA => BAA
	   * BCD => BCD
	   * AA => ''
	   * A => ''
	   * '' => ''
	   * **/
	
	
	RemoveA removeA;
	@BeforeEach
	void setUp() {
		removeA = new RemoveA();
	}

	@Test
	void testRemove4() {
		assertEquals("BCD",removeA.remove("ABCD"));
	}
	
	@Test
	void testRemove1() {
		assertEquals("CD",removeA.remove("AACD"));
	}
	
	@Test
	void testRemove2() {
		assertEquals("BCD",removeA.remove("BACD"));
	}
	
	@Test
	void testRemove3() {
		assertEquals("",removeA.remove(""));
	}
	
	@Test
	void testRemove5() {
		assertEquals("",removeA.remove("A"));
	}
	
	@Test
	void testRemove6() {
		assertEquals("B",removeA.remove("B"));
	}
	
	@Test
	void testRemove7() {
		assertEquals("",removeA.remove("AA"));
	}
	
	@Test
	void testRemove8() {
		assertEquals("B",removeA.remove("BA"));
	}
	
	@Test
	void testRemove9() {
		assertEquals("B",removeA.remove("AB"));
	}
	
	@Test
	void testRemove10() {
		assertEquals("BC",removeA.remove("BC"));
	}
	
	@Test
	void testRemove11() {
		assertEquals("BAA",removeA.remove("AABAA"));
	}
	
	@Test
	void testRemove12() {
		assertEquals("BBAA",removeA.remove("BBAA"));
	}
	

}