package UD3_Pr1_Funciones;

import java.util.Scanner;

public class Actividad_7 {
public static void esPrimo (int a) {
	int numero = a;
	int contador = 0;
	for(int i = numero; i > 0; i--){
	    if(numero % i == 0 ){
	        contador++;
	    }
	}
	if(contador == 2){
	    System.out.println("El numero es primo.");
	}	
	else {
		System.out.println("El numero no es primo");
	}
	}
public static void main (String[]args) {
	Scanner tc = new Scanner (System.in);
	System.out.println("Introduce un numero entero mayor a 1.");
	int num=tc.nextInt();
	while (num<1) {
		System.out.println("Error, introduce un numero entero válido.");
		num=tc.nextInt();
	}
	esPrimo(num);
}
}
