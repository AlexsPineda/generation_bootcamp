package com.perritos;

public class PruebaPerro {

	public static void main(String[] args) {
		//Instanciar
		Perro perro1 = new Perro("huellas", 1);
		
		//Cambiar sus atributos
		perro1.nombre = "patitas";
		perro1.edad = 3;
		perro1.raza = "husky";
		perro1.tamanio = "mediano";
		
		perro1.ladrar();
		
		int edadP = perro1.edadPerruna();
		System.out.println(edadP);

		//metodo estatico
		Perro.mensaje();
		
		
		Perro perro2 = new Perro("coco", 2);
		
		perro2.nombre = "Drako";
		perro2.edad = 8;
		perro2.tamanio = "pequeño";
		perro2.raza = "chihuahua";
		
		perro2.ladrar();
		int edadP2 = perro2.edadPerruna();
		System.out.println(edadP2);
	}

}
