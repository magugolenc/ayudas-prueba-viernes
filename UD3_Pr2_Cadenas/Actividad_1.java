package UD3_Pr2_Cadenas;

import java.util.Scanner;

public class Actividad_1 {
public static void main (String []args) {
	Scanner tc=new Scanner(System.in);
	System.out.println("Introduce la primera palabra.");
	String primerapalabra=tc.next();
	System.out.println("Introduce la segunda palabra.");
	String segundapalabra=tc.next();
	if (primerapalabra.length()<segundapalabra.length()) {
		System.out.println("La segunda palabra introducida es más larga.");
	}
	else if (primerapalabra.length()>segundapalabra.length()) {
		System.out.println("La primera palabra introducida es más larga.");
	}
	else if (primerapalabra.length()==segundapalabra.length()){
		System.out.println("Ambas son igual de largas.");
	}
}
}
