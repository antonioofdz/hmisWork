

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Ejercicio1.Ejercicio1;

class Ejercicio1Test {

	@ParameterizedTest
	@CsvSource({"2,1","5,1","6,1"})
	void testTransformar(int input, int expected) {
		Ejercicio1 ejer1 = new Ejercicio1();
		int result = ejer1.transformar(input);
		assertEquals(result, expected);
	}

}
