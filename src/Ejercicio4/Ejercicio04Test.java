package Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Ejercicio1.Ejercicio1;

class Ejercicio04Test {

	@ParameterizedTest
	@CsvSource({"abcdefgh,1234abc1234"})
	void testChain(String value, String chain) {
		Ejercicio4 ejer4 = new Ejercicio4();
		String result = ejer4.checkChainValue(value, chain);
		assertEquals(result, "abc");
	}

}
