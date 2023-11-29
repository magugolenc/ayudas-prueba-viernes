package UD3_Pr3_Tablas_Arrays;

import java.util.Scanner;

/*Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. 
*Cada clase está compuesta por 5 alumnos. 
*Se pide leer las notas de cada uno de los alumnos en el primer trimestre, luego, las del segundo, y luego, las del tercero. 
*Debemos mostrar, al final, la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición pos (que se lee por teclado). 
*(Podéis hacerlo usando 3 vectores -uno por trimestre-, o usando una matriz bidimensional en la que las filas sean los trimestres y las columnas los alumnos).*/
public class Actividad_7 {
/*
public static double[][] mediaAlumno(double [][] notas) {
	double media=0;
	double [][]mediaCal=new double [5][1];
	int i=0;
	int k=0;
	int j=0;
	boolean medias = false;
	while(medias=true) {
		medias=false;
		j=0;
		k=0;
		while (j<3) {
		media=media + notas[i][j];
		j++;
		}
		mediaCal[i][k]=media/3;
		if (i<5) {
		i++;
		k++;
		}
		else {
			medias=true;
		}
	}
	return mediaCal;
}
*/
public static void main (String []args) {
	double [] mediaCal=new double[5];
	int alumno=0;
	int n=0;
	double media=0;
	boolean medias = false;
	double [][]notas=new double[5][3];
	notas [0][0]= 3.5;
	notas [0][1]= 7.4;
	notas [0][2]= 8.3;
	notas [1][0]= 7.4;
	notas [1][1]= 9;
	notas [1][2]= 2.3;
	notas [2][0]= 6.4;
	notas [2][1]= 7.7;
	notas [2][2]= 8.9;
	notas [3][0]= 4.9;
	notas [3][1]= 3.95;
	notas [3][2]= 1.75;
	notas [4][0]= 8.55;
	notas [4][1]= 7.3;
	notas [4][2]= 6.65;
	/*Calculamos la media de cada alumno*/
	
	double cal=0;
	double sumaTri=0;
	for(int h=0;h<3;h++) {
		cal=0;
		sumaTri=0;
		for (int toni=0;toni<5;toni++) {
		cal=cal + notas[toni][h];
		}
	sumaTri=cal/5;
	System.out.println("La media de la clase del trimestre "+(h+1)+" es:");
	System.out.println(sumaTri);
	System.out.println();
	}
for (int i = 0; i<5;i++) {
		System.out.println("Las notas del alumno "+(i+1)+" son: ");
		for(int j = 0; j<3;j++) {
			System.out.println("Trimestre: "+(j+1)+" nota: "+notas[i][j]);
		}
	}
Scanner sc=new Scanner(System.in);
System.out.println("¿De que alumno desea sacar la media?");
int selecAlu=sc.nextInt();
for (int p=0;p<3;p++) {
		media=media + notas[selecAlu][p];
		}
double mediaTrimestreAl=media/3;
System.out.println("La media del alumno "+selecAlu+" es:");
System.out.println(mediaTrimestreAl);
}
}

