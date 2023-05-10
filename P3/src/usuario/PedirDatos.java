package usuario;

import java.util.Scanner;

import modelo.Perro;
/**
 * @author Marta Muelas
 * @version 1
 * @since 06/05/2023
 */
public class PedirDatos {

	/**
	 * Metodo pide un objeto de la clase perro a introducir por el usuario
	 */
	public static Perro pedirPerro() {

		String raza = pedirCadena("Introduce la raza", 4);
		String color = pedirCadena("Introduce el color", 2);
		float peso = pedirDecimales(0.1f, 100f, "Introduce el peso");

		System.out.println("");
	

		return new Perro(raza, color, peso);
	}

	/**
	 * Metodo que devuelve un string a traves del usuario
	 * 
	 * @param mensaje es el mensaje informativo que le llega al usuario con indicaciones
	 * @param minimo es el numero minimo de caracteres que tiene que tener la palabra que introduce el usuario
	 */
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
	
	/**
	 * Metodo que devuelve un float a traves del usuario
	 * 
	 * @param mensaje es el mensaje informativo que le llega al usuario con indicaciones
	 * @param numInicial es el numero minimo que se debe introducir
	 * @param numFinal es el numero maximo que se debe introducir
	 */
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

	/**
	 * Metodo que devuelve un int a traves del usuario
	 * 
	 * @param mensaje es el mensaje informativo que le llega al usuario con indicaciones
	 * @param numInicial es el numero minimo que se debe introducir
	 * @param numFinal es el numero maximo que se debe introducir
	 */
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
