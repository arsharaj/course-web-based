package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringSecondTest {

	@Test
	void test() {
		ReverseString reverse =  new ReverseString();
		assertEquals("avaJ", reverse.reverseString("Java"));
		assertEquals("neilA", reverse.reverseString("Alin"));
	}

}
