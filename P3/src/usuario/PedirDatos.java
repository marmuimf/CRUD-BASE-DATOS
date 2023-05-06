package usuario;

import java.util.Scanner;

import modelo.Perro;

public class PedirDatos {

	public static Perro pedirPerro() {

		String raza = pedirCadena("Introduce la raza", 4);
		String color = pedirCadena("Introduce el color", 2);
		float peso = pedirDecimales(0.1f, 100f, "Introduce el peso");

		System.out.println("");

		return new Perro(raza, color, peso);
	}

	// pedir raza del perro:
	public static String pedirCadena(String mensaje, int minimo) {

		Scanner lector = new Scanner(System.in);
		String cadena = "";

		try {
			// pide de manera repetitiva:
			do {
				System.out.println(mensaje);
				cadena = lector.nextLine();

			} while (cadena.length() <= minimo);

		} catch (Exception e) {
			// si hay error, devuelvo salir
			cadena = "";
		}

		return cadena;

	}
	
	public static float pedirDecimales(float numInicial, float numFinal, String mensaje) {

		Scanner lector = new Scanner(System.in);
		float numero = 0;

		try {

			do {
				System.out.println(mensaje);
				numero = lector.nextInt();
				lector.nextLine();

			} while (numero < numInicial || numero > numFinal);

		} catch (Exception e) {
			// si hay error, devuelvo salir
			numero = 8;
		}

		return numero;
	}

	public static int pedirNumero(int numInicial, int numFinal, String mensaje) {

		Scanner lector = new Scanner(System.in);
		int numero = 0;

		try {

			do {
				System.out.println(mensaje);
				numero = lector.nextInt();
				lector.nextLine();

			} while (numero < numInicial || numero > numFinal);

		} catch (Exception e) {
			// si hay error, devuelvo salir
			numero = 8;
		}

		return numero;
	}

}
