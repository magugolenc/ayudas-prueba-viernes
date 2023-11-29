package UD3_Pr3_Tablas_Arrays;

import java.util.Scanner;

public class Actividad_9 {
	public static void comparaBoleto(int a[], int b[]) {
		int premio=a[0];
		String primitiva = String.valueOf(b[0]);
		int acierto=0;
		int fallo=0;
		String comparaGanador=String.valueOf(premio);
		for (int i=0;i<6;i++) {
			if (comparaGanador.charAt(i)==primitiva.charAt(i)) {
				acierto++;
			}
			else
				fallo++;
			}
			System.out.println("BoletoGanador = "+a[0]+" boleto = "+b[0]+" tiene "+acierto+" numeros iguales.");
		}
	public static void main (String[]args) {
		int boleto [] = new int [1];
		int boletoGanador [] = new int [1];
		boletoGanador[0]= 324567;
		System.out.println("Introduzca su primitiva para verificar si tiene premio.");
		Scanner tc=new Scanner(System.in);
		boleto[0]=tc.nextInt();
		while (boleto[0] < 1 || boleto[0] > 10000000) {
		System.out.println("Error, introduzca su primitiva de nuevo para verificar si tiene premio.");
		boleto[0]=tc.nextInt();
	}
	comparaBoleto(boletoGanador, boleto);
	}
}
