package com.generation.test;

import com.generation.model.Perro;

public class PruebaPerro {

	public static void main(String[] args) {
		Perro drako = new Perro("drako","chihuahua","pequeño",8,"gris-blanco");

		Perro hachi = new Perro("hachi","pastor ovejero","mediano",5,"blanco-negro");
		
		drako.setHumano("Azyu");
		hachi.setHumano("Alex");
		
		System.out.println(drako);
		System.out.println(hachi);
		
		drako.comer();
		
		System.out.println(Perro.buscarHumano(1));
		System.out.println(Perro.buscarHumano(2));
	
	}

}
