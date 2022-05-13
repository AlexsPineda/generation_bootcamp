import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		float resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1) Suma   2) Resta   3) Multiplicaci n   4) Divisi n");
		System.out.print("Introduce el nmero de la operacion a realizar: ");
		int opc = teclado.nextInt();
		
		switch(opc) {
		case 1:
			System.out.println("Suma");
			System.out.print("Ingresa tu primer numero: ");
			float num1 = teclado.nextFloat();
			System.out.print("Ingresa tu segundo numero: ");
			float num2 = teclado.nextFloat();
			resultado = num1+num2;
			System.out.println("La suman es: " + resultado);
			break;
		case 2:
			System.out.println("Resta");
			System.out.print("Ingresa tu primer numero: ");
			float num3 = teclado.nextFloat();
			System.out.print("Ingresa tu segundo numero: ");
			float num4 = teclado.nextFloat();
			resultado = num3-num4;
			System.out.println("La resta es: " + resultado);
			break;
		case 3:
			System.out.println("Multiplicacion");
			System.out.print("Ingresa tu primer numero: ");
			float num5 = teclado.nextFloat();
			System.out.print("Ingresa tu segundo numero: ");
			float num6 = teclado.nextFloat();
			resultado = num5*num6;
			System.out.println("La multiplicacion es: " + resultado);
			break;
		case 4:
			System.out.println("Division");
			System.out.print("Ingresa tu primer numero: ");
			float num7 = teclado.nextFloat();
			System.out.print("Ingresa tu segundo numero: ");
			float num8 = teclado.nextFloat();
			resultado = num7/num8;
			System.out.println("La division es: " + resultado);
			break;
		default:
			System.out.println("Se ingreso una opcion incorrecta adios");
			break;
		}
		teclado.close();

	}

}
