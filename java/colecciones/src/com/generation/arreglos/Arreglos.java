package com.generation.arreglos;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		//Matrices - Arreglos
		//Solo pueden tener un tipo de dato
		
		int[] arrNumeros = new int[5];
		
		arrNumeros[1] = 1;
		
		System.out.println(Arrays.toString(arrNumeros));
		System.out.println(arrNumeros[1]);

		for(int i=0; i<5; i++) {
			System.out.println(arrNumeros[i]);
		}
		//forEach
		int conteo= 0;
		for(int elemento : arrNumeros) {
			conteo++;
			System.out.println("elemento "+conteo +" = "+elemento);
		}
		
		//Arreglo que guarda objetos
		
		Persona persona1 = new Persona("alex", 33);
		Persona persona2 = new Persona("raul", 32);
		
		Persona arrPersonas[] = new Persona[3];
		
		arrPersonas[0] = persona1;
		arrPersonas[1] = persona2;
		arrPersonas[2] = new Persona("azyu", 27);
		
		//System.out.println(Arrays.toString(arrPersonas));
		
		for(Persona elemento : arrPersonas) {
			System.out.println(elemento.nombre +" - "+elemento.edad);
		}
		
	}

}
