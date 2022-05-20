package com.perritos;

public class Perro {
	//Atributos o propiedades
	String nombre;
	int edad;
	String raza;
	String tamanio;
	
	//constructor
	public Perro(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	//Metodos
	
	public void ladrar() {
		System.out.println("El perro " + nombre + "hace guauf");
	}
	public int edadPerruna() {
		return edad * 7;
	}
	
	//Metodos estaticos
	//Nos permite 
	public static void mensaje() {
		System.out.println("Esta es una clase perro")
	}

}
