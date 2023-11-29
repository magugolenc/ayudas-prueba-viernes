package UD3_Pr1_Funciones;

import java.util.Scanner;

public class Actividad_3 {
public static double area (int radio, int altura) {
	int r = radio;
	int h = altura;
		double areaTotal = (2 * 3.1416 * r * (h + r));
	return areaTotal;
}
public static double volumen(int radio, int altura) {
	int r = radio;
	int h = altura;
		double volumen = 3.1416 * (r * r) * h;
	return volumen;
}
public static void main (String [] args) {
	Scanner tc = new Scanner (System.in);
	System.out.println("Introduce el radio.");
	int radio = tc.nextInt();
	while (radio == 0) {
		System.out.println("Error, introduce un numero que no se el 0 para el radio.");
		radio = tc.nextInt();
	}
	System.out.println("Introduce la altura.");
	int altura = tc.nextInt();
	while (altura == 0) {
		System.out.println("Error, introduce un numero que no se el 0 para la altura.");
		altura = tc.nextInt();
	}
	System.out.println("¿Que desea calcular?");
	System.out.println("1.Area - 2.Volumen"+'\n');
	int calculo = tc.nextInt();
	switch (calculo) {
	case 1:
		System.out.println("El area de su cilindro es: "+area(radio, altura)+".");
	break;
	case 2:
		System.out.println("El volumen de su cilindro es: "+volumen(radio, altura)+".");
	}
}
}
