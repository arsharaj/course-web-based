package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Test Driven Development - Write test then code
 */

class ReverseStringThirdTest {
	ReverseString reverse = new ReverseString();

	@Test
	void testReverseStringOneWord() {
		assertEquals("avaJ", reverse.reverseString("Java"));
	}

	@Test
	void testReverseStringMultipleWords() {
		assertEquals("ysae si avaJ", reverse.reverseString("Java is easy"));
	}

}
