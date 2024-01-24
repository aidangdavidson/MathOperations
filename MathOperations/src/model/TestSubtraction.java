package model;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author aidan - agdavidson
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
class TestSubtraction {

	@Test
	void test() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.subtract(5, 3));
		
		assertTrue(calculator.subtract(5, 3) == 2);
		
		assertNotEquals(5, calculator.subtract(5, 3));
	}
	

}
