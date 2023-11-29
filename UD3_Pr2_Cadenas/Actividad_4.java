package UD3_Pr2_Cadenas;

import java.util.Scanner;

public class Actividad_4 {
public static void main (String []args) {
	Scanner tc = new Scanner(System.in);
	int espacios = 0;
	System.out.println("Introduzca una frase cualquiera.");
	String f = tc.nextLine();
for (int i = 0; i<f.length();i++) {
	if (f.charAt(i)==(' ')) {
		espacios++;
	}
}
System.out.println("La frase: "+ f);
System.out.println("Tiene "+espacios+" nº de espacios.");
}
}
