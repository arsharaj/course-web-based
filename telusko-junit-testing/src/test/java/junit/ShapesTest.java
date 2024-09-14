package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape = new Shapes();
	
	@Test
	void testComputeSquareArea() {
		assertEquals(576, shape.computeSquareArea(24));
		assertNotEquals(5736, shape.computeSquareArea(24), "Area is equal.");
		assertTrue(true);
		int[] expected = {2, 4, 6, 8};
		int[] actual = {4, 6, 8, 2};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5), "Area of circle is wrong.");
	}
	
	@Test
	void testComputeCircleAreaSupplier() {
		assertEquals(78.5, shape.computeCircleArea(5), () -> "Area of circle is wrong.");
	}

}
