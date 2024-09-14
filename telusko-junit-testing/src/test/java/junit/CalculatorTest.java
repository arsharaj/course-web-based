package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
	Calculator calc = new Calculator();
	
	@BeforeAll
	static void init() {
		System.out.println("Before each test");
	}

	@Test(timeout = 1)
	public void testFirst() {
		assertEquals(2, calc.divide(10, 5));
	}
	
	@Test
	public void testSecond() {
		assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
	}
	
	@Test
	public void testThird() {
		int[] unsorted = {7,4,3,2,4,56,4,2,2,5,6,7,4,3,2,4,6};
		assertTimeout(Duration.ofMillis(100), () -> calc.sortingArray(unsorted));
	}

}
