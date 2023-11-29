package UD3_Pr2_Cadenas;

public class Actividad_9 {
public static void main(String[] args) {
	int num = 5000;
        StringBuilder alabiAlixar = new StringBuilder("Alabí Alixar");
        System.out.println("El StringBuilder es: " + alabiAlixar);

        System.out.println("Capacidad inicial = " + alabiAlixar.capacity());
        System.out.println("Longitud inicial = " + alabiAlixar.length());

        alabiAlixar.replace(0, alabiAlixar.length(), "Chicharrones de Chiclana");
        System.out.println(alabiAlixar.replace(0, alabiAlixar.length(), "Chicharrones de Chiclana"));

        System.out.println(alabiAlixar.replace(0, alabiAlixar.length(), "Hay " + num + " Chicharrones"));

        System.out.println(alabiAlixar.append(" en Chiclana"));
        
        System.out.println(alabiAlixar.substring(alabiAlixar.length() - 4));

        System.out.println("Capacidad final = " + alabiAlixar.capacity());
        System.out.println("Longitud final = " + alabiAlixar.length());
        
        System.out.println('\n'+"Arriba con builder------------------------------Abajo con buffer"+'\n');
        
        StringBuffer alabiAlixarBuffer = new StringBuffer("Alabí Alixar");
        System.out.println("El StringBuffer es: " + alabiAlixarBuffer);
        System.out.println("Capacidad inicial = " + alabiAlixarBuffer.capacity());
        System.out.println("Longitud inicial = " + alabiAlixarBuffer.length());

        System.out.println(alabiAlixarBuffer.replace(0, alabiAlixarBuffer.length(), "Chicharrones de Chiclana"));

        System.out.println(alabiAlixarBuffer.replace(0, alabiAlixarBuffer.length(), "Hay " + num + " Chicharrones"));

        System.out.println(alabiAlixarBuffer.append(" en Chiclana"));

        System.out.println(alabiAlixarBuffer.substring(alabiAlixarBuffer.length() - 4));

        System.out.println("Capacidad final = " + alabiAlixarBuffer.capacity());
        System.out.println("Longitud final = " + alabiAlixarBuffer.length());
    }
}
