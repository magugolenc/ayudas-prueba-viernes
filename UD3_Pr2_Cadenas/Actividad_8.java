package UD3_Pr2_Cadenas;

import java.util.Scanner;

public class Actividad_8 {
public static void javalin (String f) {
	String javalines="[Javalín, javalón, javalén, len, len]";
	boolean javalandes=false;
	if (f.compareTo(javalines)==0) {
		javalandes=true;
	}
	else {
		javalandes=false;
	}
	if (javalandes=true) {
		String borrarInicio=f.replace("Javalín, javalón", "").trim();
		String borrarFin=f.replace("javalen, len , len", "").trim();
		System.out.println("La traducción de su frase es: "+borrarInicio);
	}
	else {
		System.out.println("Su mensaje no esta en javalandes.");
	}
}
public static void main (String []args) {
	Scanner tc=new Scanner(System.in);
	System.out.println("Introduzca su frase en javalandes.");
	String javalanf=tc.nextLine();
	javalin(javalanf);
}
}
