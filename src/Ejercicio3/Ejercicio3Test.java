package Ejercicio3;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class Ejercicio3Test {

	private Ejercicio3 ejer3 = new Ejercicio3();

	@ParameterizedTest
	@ValueSource(ints = -3)
	public void testNegativeValue(int value) {
		String result = ejer3.numberToAsterisk(value);
		assertEquals(result, "Error");
	}
	
	@ParameterizedTest
	@ValueSource(ints = 3)
	public void testLessThanFive(int value) {
		String result = ejer3.numberToAsterisk(value);
		assertEquals(result, "*****");
	}
	
	@ParameterizedTest
	@ValueSource(ints = 7)
	public void testLessThanTwelve(int value) {
		String result = ejer3.numberToAsterisk(value);
		assertEquals(result, "*******");
	}
	
	@ParameterizedTest
	@ValueSource(ints = 15)
	public void testFiveTeen(int value) {
		String result = ejer3.numberToAsterisk(value);
		assertEquals(result, "***********");
	}
	
}
