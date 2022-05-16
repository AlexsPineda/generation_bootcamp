package com.ejercicios;

import java.util.Scanner;

public class CalculadoraGeometrica {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        Areas area = new Areas();
        Perimetro perimetro = new Perimetro();

        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("1. Perimetro y Area de triangulo");
            System.out.println("2. Perimetro y Area de cuadrado");
            System.out.println("3. Perimetro y Area de circulo");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Ingresa una base ");
                    double base = sn.nextDouble();

                    System.out.print("Ingresa una altura ");
                    double altura = sn.nextDouble();

                    System.out.println(area.areaTriangulo(base, altura));
                    System.out.println(perimetro.perimetroTriangulo(base, base, base));
                    salir = true;
                    break;
                case 2:
                    System.out.println("Ingresa un lado ");
                    double lado = sn.nextDouble();

                    System.out.println(area.areaCuadrado(lado));
                    System.out.println(perimetro.perimetroCuadrado(lado));
                    salir = true;
                    break;
                case 3:
                    System.out.println("Ingresa un radio ");
                    double radio = sn.nextDouble();

                    System.out.println(area.areaCirculo(radio));
                    System.out.println(perimetro.perimetroCirculo(radio));
                    salir = true;
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }

	}

}
