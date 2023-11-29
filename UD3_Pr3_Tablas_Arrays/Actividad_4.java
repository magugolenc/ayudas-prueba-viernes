package UD3_Pr3_Tablas_Arrays;

import java.util.Scanner;

public class Actividad_4 {

public static void main (String []args) {
	boolean acierto = false;
	int sumaAciertos=0;
	int sumaIntentos=0;
	Scanner tc = new Scanner (System.in);
	/* Dar valor al máximo arrays introducidos mediante el teclado. */
	System.out.println("Introduce la longitud de la clave");
		int largoClave = tc.nextInt();
	int [] claveSecreta = new int[largoClave];
	int [] intentoSecreta = new int[largoClave];
	/* Generar la clave secreta */
	for (int i = 0;i<largoClave;i++) {
		claveSecreta [i] = (int) (Math.random()* 5) + 1;
		System.out.println("Digito ["+i+"]: "+ claveSecreta[i]);
	}
	/* Dar valor al array x con el valor introducido por teclado. */
	do {
	/* Cada vez que se reinicia el while se le da el valor por defecto true a acierto, si no no acabara nunca. */
	acierto=true;
	for (int j = 0;j < largoClave;j++) {
		System.out.println("Intente acertar.");
			int intento = tc.nextInt();
			intentoSecreta[j] = intento;
	}
	/* Comparación de arrays. */
	for (int k = 0;k < largoClave;k++) {
		if (intentoSecreta[k] < claveSecreta [k]) {
			System.out.println("El numero: "+intentoSecreta[k]+" introducido en la posicion "+k+" es menor que el de la clave.");
		acierto=false;
		}
		else if (intentoSecreta[k] > claveSecreta [k]) {
			System.out.println("El numero: "+intentoSecreta[k]+" introducido en la posicion "+k+" es mayor que el de la clave.");
		acierto=false;
		}
		else {
			System.out.println("El numero: "+intentoSecreta[k]+" introducido en la posicion "+k+" es correcro.");
		}
	}
	sumaIntentos++;
	} while (acierto!= true);
System.out.println("Enhorabuena has conseguido adivinar la clave secreta, has tardado "+sumaIntentos+" intentos.");
}
}
