

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Ejercicio1.Ejercicio1;
import Ejercicio2.Ejercicio2;

class Ejercicio2Test {

	@ParameterizedTest
	@CsvSource({"'',''"})
	void testLoginEmpty(String user, String password) {
		Ejercicio2 ejer2 = new Ejercicio2();
		boolean logged = ejer2.login(user, password);
		assertEquals(logged, false);
	}
	
	@ParameterizedTest
	@CsvSource({"111111111111111111111111111111111,111111111111111111111111111111111"})
	void testLoginLength(String user, String password) {
		Ejercicio2 ejer2 = new Ejercicio2();
		boolean logged = ejer2.login(user, password);
		assertEquals(logged, false);
	}
	
	@ParameterizedTest
	@CsvSource({"user1,pass1"})
	void testLoginWrong(String user, String password) {
		Ejercicio2 ejer2 = new Ejercicio2();
		boolean logged = ejer2.login(user, password);
		assertEquals(logged, false);
	}
	
	@ParameterizedTest
	@CsvSource({"'user','pass'"})
	void testLoginCorrect(String user, String password) {
		Ejercicio2 ejer2 = new Ejercicio2();
		boolean logged = ejer2.login(user, password);
		assertEquals(logged, true);
	}

}
