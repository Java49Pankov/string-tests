package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testCharAt() {
		String testString = "Hello!";
		assertEquals('H', testString.charAt(0));
		assertEquals('l', testString.charAt(2));
		assertEquals('!', testString.charAt(5));
	}

	@Test
	void testCompareTo() {
		assertEquals(8, "9".compareTo("12345"));
		assertEquals(-4, "12345".compareTo("12349"));
		assertEquals(1, "123459".compareTo("12345"));
		assertEquals(0, "Hello".compareTo("Hello"));
		assertEquals('H' - 'h', "Hello".compareTo("hello"));
		assertTrue("Hello".compareTo("hello") < 0);
	}

	@Test
	void testСompareToIgnore() {
		assertEquals(8, "9".compareToIgnoreCase("12345"));
		assertEquals(-4, "12345".compareToIgnoreCase("12349"));
		assertEquals(1, "123459".compareToIgnoreCase("12345"));
		assertEquals(0, "Hello".compareToIgnoreCase("HelLo"));
		assertEquals(0, "Hello".compareToIgnoreCase("hello"));
	}

	@Test
	void testConcat() {
		String testString = "Hello ";
		String testString1 = "world";
		assertEquals("Hello world", testString.concat(testString1));
	}

	@Test
	void testStartWith() {
		String testString = "Hello ";
		assertTrue(testString.startsWith("Hel"));
		assertFalse(testString.startsWith("hel"));
	}

	@Test
	void testEndWith() {
		String testString = "Hello";
		assertTrue(testString.endsWith("lo"));
		assertFalse(testString.endsWith("Lo"));
	}

	@Test
	void testContains() {
		String testString = "Hello";
		assertTrue(testString.contains("H"));
		assertTrue(testString.contains("el"));
		assertFalse(testString.contains("Hi"));
		assertFalse(testString.contains("elo"));
		assertFalse(testString.contains("le"));
	}

	@Test
	void testIndexOf() {
		String testString = "Hello";
		assertEquals(0, testString.indexOf("He"));
		assertEquals(2, testString.indexOf("llo"));
		assertEquals(4, testString.indexOf("o"));
	}

	
	@Test
	void testLastIndexOf() {
		String testString = "HHellooo";
		assertEquals(1, testString.lastIndexOf("H"));
		assertEquals(4, testString.lastIndexOf("l"));
		assertEquals(7, testString.lastIndexOf("o"));
	}
}
