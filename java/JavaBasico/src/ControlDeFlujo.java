import java.util.Scanner;

public class ControlDeFlujo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cual es tu edad?");
		int edad = sc.nextInt();
		
		if(edad >= 18) {
			if(edad >=50) {
				System.out.println("Eres adulto mayor");
			}else {
				System.out.println("Eres mayor de edad");
			}
	}else {
		System.out.println("Eres menor de edad");
		}
		
		String mensaje = (edad>= 18) ? ("eres mayor de edad x2") : ("eres menor de edad x2");
		System.out.println(mensaje);
		
		System.out.println("En que dia estamos");
		sc.nextLine();
		String dia = sc.nextLine();
		sc.close();
		
		switch(dia.toLowerCase()) {
		case "viernes":
			System.out.println("chelas");
			break;
		case "lunes":
			System.out.println("5 min. mas");
			break;
		case "martes":
			System.out.println("no te cases ni te embarques");
			break;
		case "miercoles":
			System.out.println("ombligo de semana");
			break;
		case "jueves":
			System.out.println("casi viernes");
			break;	
		default:
			System.out.println("dia no valido");
			break;
		}
	}

}
