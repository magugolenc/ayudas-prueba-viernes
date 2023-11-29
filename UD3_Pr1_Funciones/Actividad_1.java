package UD3_Pr1_Funciones;

import java.util.Scanner;

public class Actividad_1 {
public static void eco(int n) {
	for (int i = 0;i<n;i++) {
		System.out.println("Eco...");
	}
}
public static void main (String []args) {
	Scanner tc = new Scanner (System.in);
	System.out.println("¿Cuanto eco hay en tu cueva?");
	int numEco=tc.nextInt();
	eco(numEco);
}
}
