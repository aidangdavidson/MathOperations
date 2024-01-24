package model;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author aidan - agdavidson
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
class TestAddition {

	@Test
	void test() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.add(2, 3));
		
		assertTrue(calculator.add(5, 3) == 8);
		
		assertNotEquals(5, calculator.add(5, 3));
	}

}
