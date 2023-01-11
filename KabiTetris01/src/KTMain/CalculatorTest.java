package KTMain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		Calculator calOne = new Calculator();
		assertEquals(30, calOne.sum(10, 20));
	}

}
