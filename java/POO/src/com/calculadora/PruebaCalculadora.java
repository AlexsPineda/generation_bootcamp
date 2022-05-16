package com.calculadora;

public class PruebaCalculadora {

	public static void main(String[] args) {
		System.out.println("Vamos a calcular");
		//Instanciar - crear un objeto de una clase
		Calculadora cal = new Calculadora();
		//metodo que no retorna un valor
		cal.sumarMensaje();
		//metodos con parametros
		int suma = cal.sumar(9, 9);
		System.out.println("la suma es "+suma);
		
		int resta = cal.restar(9, 9);
		System.out.println("la resta es "+resta);
		
		int multiplicacion = cal.multiplicar(9, 9);
		System.out.println(multiplicacion);
		
		double division = cal.division(9, 9);
		System.out.println(division);
		
		//Instanciar Area
		Areas calAreas = new Areas();
		
		calAreas.mensaje();
		
		System.out.println(calAreas.areaCuadrado(5));
		
		double areaT = calAreas.areaTriangulo(4, 8);
		System.out.println(areaT);

	}

}
