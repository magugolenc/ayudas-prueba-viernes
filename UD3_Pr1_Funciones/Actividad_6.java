package UD3_Pr1_Funciones;

import java.util.Scanner;

public class Actividad_6 {
public static void esVocal (String c) {
	boolean vocalSi = true;
	final String vocal = c.toLowerCase();
	if (c.equals("a") || c.equals("o") || c.equals("u") || c.equals("e") || c.equals("i")) {
		vocalSi = true;
	}
	else {
		vocalSi = false;
	}
	if (vocalSi==true) {
		System.out.println("El parametro introducido es vocal");
	}
	else {
		System.out.println("El parametro introducido no es vocal");
	}
	}
public static void main (String []args) {
	Scanner tc = new Scanner (System.in);
	System.out.println("Introduce un parametro.");
	esVocal(tc.next());
}
}

