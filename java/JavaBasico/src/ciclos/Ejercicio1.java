package ciclos;

import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		int numeroAdivinar = 0;
		int numero = 4;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Numero a adivinar");
			int num = teclado.nextInt();
			numeroAdivinar = num;
			if(numero == numeroAdivinar) {
				System.out.println("Numeros Iguales");
			}else {
				System.out.println("Numeros Diferentes");
			}	
		}while(!(numero == numeroAdivinar));
		System.out.println("Adivinaste con exito");


	}

}
