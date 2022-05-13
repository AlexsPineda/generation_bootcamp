import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
//		Scanner escaner = new Scanner(System.in);
//		System.out.println("Escribe un numero:");
//		int numero = escaner.nextInt();
//		System.out.println(numero);
		float peso, altura, masa;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el peso: ");
        peso = teclado.nextFloat();

        System.out.print("Introduzca la altura: ");
        altura = teclado.nextFloat();
        
        System.out.println(peso);
        System.out.println(altura);
        
        masa = peso / (altura*altura);
        
        System.out.println(masa);
        
        if(masa>= 18.5f && masa <= 25f) {
        	System.out.print("Your weigh ratio is good");
        }else {
        	System.out.print("Your health is not good");
        }
        teclado.close();

	}

}
