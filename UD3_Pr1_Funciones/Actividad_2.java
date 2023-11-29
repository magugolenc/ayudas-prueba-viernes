package UD3_Pr1_Funciones;

import java.util.Scanner;

public class Actividad_2 {

	public static void ContEntero(int n,int u) {
		int inicio=0;
		int fin=0;
		if(n==u) {
			System.out.println("Ambos numero son iguales");
			}
		else {
			if (n>u) {
				inicio=n;
				fin=u;
			}
			else {
				inicio=u;
				fin=n;
			}
		}
				for (int i = n + 1;i<u;i++) {
					System.out.println("Conteo de los numeros comprendidos entre: "+inicio+ " y "+fin+" = "+i);
					}
		}
	public static void main (String []args) {
		Scanner tc = new Scanner (System.in);
		boolean sonCero = true;
		System.out.println("Introduce un priemer numero entero");
		int num=tc.nextInt();
		System.out.println("Introduce un segundo numero entero");
		int num2=tc.nextInt();
		do {
		if (num==0 && num2==0) {
			System.out.println("Error, introduce un priemer numero entero diferente a 0");
				num=tc.nextInt();
			System.out.println("Error, introduce un segundo numero entero diferente a 0");
				num2=tc.nextInt();
		}
		else {
			sonCero=false;
		}
		} while(sonCero==true);
		ContEntero(num,num2);
	}
}

