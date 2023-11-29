package UD3_Pr1_Funciones;

import java.util.Scanner;

public class Actividad_4 {
public static void elMayor (int a, int b) {
	int num1 = a;
	int num2 = b;
	if (num1>num2) {
		num1=a;
		num2=b;
			System.out.println("El mayor es "+num1);
	}
	else if (num1==num2) {
			System.out.println("Ambos son iguales.");
	}
	else {
		num1=b;
		num2=a;
			System.out.println("El mayor es "+num1);
	}
}
public static void main (String []args) {
	Scanner tc = new Scanner (System.in);
	System.out.println("Introduce un numero.");
	int num1=tc.nextInt();
	System.out.println("Introduce un segundo numero para compararlos.");
	int num2=tc.nextInt();
	elMayor(num1,num2);
}
}
