package com.ejercicios;

public class Perimetro {
	 public double perimetroTriangulo(double ladoUno, double ladoDos, double ladoTres) {
	        return ladoUno + ladoDos + ladoTres;
	    }

	    public double perimetroCuadrado(double lado) {
	        return lado * 4;
	    }

	    public double perimetroCirculo(double radio) {
	        return 2 * Math.PI * radio;
	    }

}
