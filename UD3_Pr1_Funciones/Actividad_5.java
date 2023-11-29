package UD3_Pr1_Funciones;

import java.util.Scanner;

public class Actividad_5 {
public static void elMayor (int a, int b, int c) {
	int num1 = a;
	int num2 = b;
	int num3 = c;
	if (num1>num2) {
		num1=a;
		num2=b;
	}
	else {
		num1=b;
		num2=a;
	}
	if (num1==num3) {
		System.out.println("Todos son iguales");
	}
	else if(num1>num3){
		System.out.println("El mayor es: "+num1);
	}
	else {
		System.out.println("El mayor es "+num3);
	}
	
	
}
public static void main (String []args) {
		Scanner tc = new Scanner (System.in);
		System.out.println("Introduce un numero.");
		int num1=tc.nextInt();
		System.out.println("Introduce un segundo.");
		int num2=tc.nextInt();
		System.out.println("Introduce un tercer numero para compararlos.");
		int num3=tc.nextInt();
		elMayor(num1,num2,num3);
	}
}
