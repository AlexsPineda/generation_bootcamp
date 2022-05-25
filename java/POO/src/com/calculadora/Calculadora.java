package com.calculadora;

public class Calculadora {
	//metodo que no regrsa nada VOID
	public void sumarMensaje() {
		System.out.println("vamos a realizar operaciones ");
	}
	//METODO que retorna datos 
	public String mensaje() {
		String mensaje = "Voy a sumar 2 numeros";
		return mensaje;
	}
	public int prueba() {
		return 2;
	}
	//Operaciones
	public int sumar(int a, int b) {
		return a + b;
	}
	public int restar(int a, int b) {
		return a - b ;
		
	}
	public int multiplicar (int a, int b) {
		return a * b;
	}
	public double division(double a, double b) {
		return a / b;
//		if() {
//			
//		}else {
//			
//		}
	}

}
