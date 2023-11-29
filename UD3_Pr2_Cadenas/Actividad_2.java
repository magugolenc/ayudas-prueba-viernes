package UD3_Pr2_Cadenas;

import java.util.Scanner;

public class Actividad_2 {
public static void main (String[]args) {
	Scanner tc=new Scanner(System.in);
	String fusion=" ";
	boolean finalizado = false;
	System.out.println("Introduce una frase completa palabra a palabra.");
	System.out.println("Introduce una palabra.");
	String letras = tc.next();
	do {
	fusion= fusion+" "+letras +" ";
	System.out.println("Introduce una palabra.");
	letras = tc.next();
	if (letras.equalsIgnoreCase("fin")) {
		finalizado=true;
	}
	} while (finalizado==false);
	System.out.println(fusion);
}	
}
