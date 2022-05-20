package com.generation.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		
		System.out.println("\tList --- ArrayList");
		//List  - ArrayList
		//picoparentesis
		List<String> miArray = new ArrayList<String>();
		//agrega elementos .add
		miArray.add("Azyu");
		miArray.add("alex");
		miArray.add("miguel");
		miArray.add(0,"mari");
		
		//remueve el elemento .remove
		String elemento = miArray.remove(1);
		System.out.println(miArray);
		
		//.size muestra el numero de elementos
		System.out.println(miArray.size());
		System.out.println(elemento);
		
		imprimir(miArray);
		
		//int ==> Integer
		//boolean ==> Boolean
		
		
		
		List<Integer>miArray2 = new ArrayList<Integer>(); 
		
		miArray2.add(34);
		miArray2.add(878678);
		
		imprimir(miArray2);
		
		System.out.println("\t Set --- HashSet");
		Set<String>miSet = new HashSet<String>();
		
		miSet.add("Azyu");
		miSet.add("Azyu");
		miSet.add("Paco");
		miSet.add("Azyu");
		miSet.add("Alex");
		
		System.out.println(miSet);
		
		imprimir(miSet);
		//Map --- HasMap
		//<key/llave, value/valor>
		System.out.println("\t Map --- HashMap");
		Map<String, Integer>miMap = new HashMap<String, Integer>();
		
		miMap.put("Valor 1", 33);
		miMap.put("Valor 2", 27);
		miMap.put("Valor 3", 40);
		
		System.out.println(miMap.values());//regresa todos los valores
		System.out.println(miMap.keySet());//todas las llaves
		
		
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
		}
	}
	
	
	
	
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion) {
			System.out.println("el elemento = "+elemento);
		}
	}
}
