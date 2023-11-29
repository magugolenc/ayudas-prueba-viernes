package UD3_Pr1_Funciones;

public class Actividad_11 {
	 public static double potenciaIterativa(double a, int n) {
	        double resultado = 1;

	        for (int i = 0; i < n; i++) {
	            resultado = a;
	        }

	        return resultado;
	    }
	    public static double potenciaRecursiva(double a, int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return a * potenciaRecursiva(a, n - 1);
	        }
	    }
	    public static void main(String[] args) {
	        double base = 4.3;
	        int exponente = 3;

	        double resultadoIterativo = potenciaIterativa(base, exponente);
	        System.out.println(base + " elevado a " + exponente + " (iterativo): " + resultadoIterativo);

	        double resultadoRecursivo = potenciaRecursiva(base, exponente);
	        System.out.println(base + " elevado a " + exponente + " (recursivo): " + resultadoRecursivo);
	    }
}
