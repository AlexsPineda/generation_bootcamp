package CuentaBanco;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestCuentaBanco {
//	@Test
//	
//	public void depositoTest() {
//		CuentaBanco deposito = new CuentaBanco();
//		assertEquals(true, deposito.depositar(5000.0,99.0));
//	}
//	
//	public void retiroTest() {
//		CuentaBanco retiro = new CuentaBanco();
//		assertEquals(true, retiro.retirar(4444.44,4444.88));
//	}
		
	@Test
	public void testMultiple() {
		CuentaBanco cuenta = new CuentaBanco();
		assertAll(
			"Encabezado",
			() -> assertEquals(true, cuenta.depositar(5000.0,150),"Probando Depositar"),
			() -> assertEquals(true, cuenta.retirar(4444.44,4444.22),"Probando Retirar"),
			() -> assertEquals(true, cuenta.activar("Activ"),"Probando activar")
		);
	}
}
