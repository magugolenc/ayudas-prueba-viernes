package UD3_Pr2_Cadenas;

import java.util.Scanner;

public class Actividad_3 {
public static void main (String []args) {
	Scanner tc = new Scanner(System.in);
	System.out.println("Introduzca una frase cualquiera.");
	String f = tc.nextLine();
	int mitad = f.length()/2;
	if (f.charAt(mitad)==(' ')) {
		System.out.println("Es un espacio.");
	}
	else {
		System.out.println("No es un espacio.");
}
}
}
