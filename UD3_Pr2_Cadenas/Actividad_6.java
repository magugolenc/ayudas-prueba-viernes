package UD3_Pr2_Cadenas;

import java.util.Scanner;

public class Actividad_6 {
    public static void main(String[] args) {
    	boolean acierto = false;
        // Primer jugador introduce la contraseña
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jugador 1, ingresa la contraseña: ");
        String contraseña = scanner.nextLine();

        // Segundo jugador intenta acertar la contraseña
        System.out.println("Jugador 2, adivina la contraseña.");
        System.out.println("Pistas: ");
        System.out.println("Número de caracteres: " + contraseña.length());
        System.out.println("Primera letra: " + contraseña.charAt(0));
        System.out.println("Última letra: " + contraseña.charAt(contraseña.length() - 1));

        System.out.print("Ingresa tu intento: ");
        String intento = scanner.nextLine();

      do {
        // Comprobar si el intento es correcto
        if (intento.equals(contraseña)) {
            System.out.println("Acertaste");
            acierto = true;
        } else {
            System.out.println("Fallaste.");
            if (intento.compareTo(contraseña)>0) {
            System.out.println("Su intento es: "+intento.compareTo(contraseña)+" mayor que la contraseña.");
            }
            else if(intento.compareTo(contraseña)<0) {
                System.out.println("Su intento es: "+intento.compareTo(contraseña)+" menor que la contraseña.");
            }
            System.out.print("Ingresa tu intento de nuevo: ");
            intento = scanner.nextLine();
            }
    }while(acierto != true);
    }
}
