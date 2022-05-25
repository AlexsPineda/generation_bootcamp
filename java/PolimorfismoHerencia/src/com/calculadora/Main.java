package com.calculadora;

public class Main {

	public static void main(String[] args) {
		// Instanciar
		Calculadora cal = new Calculadora(5,8);

		cal.sumar();
		
		Calculadora cal2 = new Calculadora(1,2,3);
		cal2.sumar(5, 8, 3);
	}

}
