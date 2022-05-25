package testGradle;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

	@Test
	@DisplayName("Método para comprobar suma")
	public void sumaTest() {
		Calculadora sumaCal = new Calculadora();
		assertEquals(2, sumaCal.suma(1, 1),"El resultado esperado era 2");
	}
	@Test
	@DisplayName("Método para comprobar assertion")
	public void assertionTes() {
		//boolean valorBoolean = true;
		//assertTrue(valorBoolean);
		
		assertAll(
		"Encabezado",
		() -> assertEquals(2,1+1,""),
		() -> assertTrue(true,"Deberia ser true")
		);
	}
}
