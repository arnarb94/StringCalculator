package StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(0, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(0, Calculator.add("1,2");
	}

	@Test
	public void testMultipleNumbers() {
		assertEquals(6, Calculator.add("1,2,3");
	}

	@Test(expectedExceptions=Exceptions.class)
	public void negativeNumber() {
		Calculator("-1);
	}

	@Test
	public void numberOver1000() {
		assertEquals(Calculator.add("500,1,1001"), 501);
	}
}
