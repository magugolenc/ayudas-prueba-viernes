package UD3_Pr2_Cadenas;

import java.util.Scanner;

public class Ahorcado {
public static void main (String []args) {
	Scanner tc = new Scanner(System.in);
	int volcado=0;
	boolean intentoAcertado=false;
	
	System.out.println("--------JUEGO DEL AHORCADO--------");
	System.out.println("¿Cuál será la palabra secreta?");
	String palabra = tc.nextLine();
	char [][] palabraCompleta = new char [palabra.length()][2];
	/*Volcamos la palabra en el array para poder compararlo luego y en la segunda columna ponemos un _ que sera el por defecto*/
	for (int i = 0; i < palabra.length(); i++) {
		palabraCompleta [i][0] = palabra.charAt(i);
		palabraCompleta [i][1] = '_';
	}
	System.out.println("¿Cuantos instentos desea?");
	int intentos=tc.nextInt();
	System.out.println("Introduce la letra.");
	char letra=tc.next().charAt(0);
	while (intentos>0 && volcado<=palabra.length()) {
		/*Comparamos la letra y en caso de ser cierta se volcara en array i 1, en caso de no ser igual a ninguna de las letras le descontara un intento*/
		intentoAcertado=false;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabraCompleta[i][0]==letra) {
				palabraCompleta[i][1]=letra;
				volcado++;
				intentoAcertado=true;
			}
		}/*Mostramos los intentos y el array donde en caso de no ser adivinada la letra mostrara un _*/
			System.out.println("Te quedan "+intentos+" intentos y tu palabra esta así: ");
		for (int i=0;i<palabra.length();i++) {
			System.out.print(palabraCompleta[i][1]+'\n');
		}
		if (intentoAcertado==false) {
			intentos--;
			System.out.println("Introduce otra letra.");
			letra=tc.next().charAt(0);
		}
		}
	/*Resultado*/
	if (volcado==palabra.length()) {
		System.out.println("Felicidades acertaste la palabra, que era: "+palabra+".");
	}
	else if(intentos==0){
		System.out.println("Se te acabaron los intentos, la palabra era: "+palabra+".");
	}
	}
}
