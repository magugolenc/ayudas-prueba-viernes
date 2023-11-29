package UD3_Pr3_Tablas_Arrays;

import java.util.Scanner;

public class Actividad_1 {
public static void main (String []args) {
	int introducido []=new int[5];
	Scanner tc=new Scanner(System.in);
	boolean maxIntroducidos = false;
	int maxArray=0;
	do {
	if (maxArray<5){
	System.out.println("Introduzca numeros enteros para asignarlos como valor.");
	 float valor=tc.nextInt();
	 introducido [maxArray]= (int) valor;
	 maxArray++;
	}
	else {
		maxIntroducidos = true;
	}
	} while (maxIntroducidos == false);
	for (int i = 0;i<5;i++) {
		System.out.println("Su array "+i+" es "+introducido[i]);	
	}
	
}
}
