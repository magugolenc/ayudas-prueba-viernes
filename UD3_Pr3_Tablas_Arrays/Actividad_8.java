package UD3_Pr3_Tablas_Arrays;

public class Actividad_8 {
	public static void main (String[]args) {
		int [] [] bidimen=new int [5][5];

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
			bidimen [i][j]=i+j;
			}
		}
		for(int p=0;p<5;p++) {
			for(int h=0;h<5;h++) {
				System.out.println("Bidimen ["+p+"] ["+h+"] = "+bidimen[p][h]+".");
			}
		}
	}
}
