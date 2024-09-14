package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {
	
	/* - This annotation is applied over methods to mark method as test.
	 * - org.junit.jupiter.api package
	 * - Visibility of @Test annotated method can be public, protected, default.
	 */
	@Test
	public void test() {
		ReverseString reverse = new ReverseString();
		assertEquals("avaJ", reverse.reverseString("Java"));
	}

}
