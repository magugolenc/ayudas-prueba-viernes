package UD3_Pr2_Cadenas;

import java.util.Scanner;

public class Actividad_5 {
	 public static void main(String[] args) {
	        // Pedir el nombre completo al usuario
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Por favor, ingresa tu nombre completo: ");
	        String nombreCompleto = scanner.nextLine();

	        // Eliminar vocales y mostrar el resultado
	        String nombreSinVocales = eliminarVocales(nombreCompleto);
	        System.out.println("Nombre sin vocales: " + nombreSinVocales);
	    }

	    public static String eliminarVocales(String nombreCompleto) {
	        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
	        StringBuilder nombreSinVocales = new StringBuilder();

	        for (char letra : nombreCompleto.toCharArray()) {
	            if (vocales.indexOf(letra) == -1) {
	                nombreSinVocales.append(letra);
	            }
	        }

	        return nombreSinVocales.toString();
	 }
}
