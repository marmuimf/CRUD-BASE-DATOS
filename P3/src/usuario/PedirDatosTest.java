package usuario;

import modelo.Perro;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import modelo.Perro;

class PedirDatosTest {

	@Test
	void testPedirCadena() {
		String mensaje = "Introduce la raza cadena";
		int minimo = 1;

		String resultado = PedirDatos.pedirCadena(mensaje, minimo);

		assertEquals("si", resultado);
	}

	@Test
	void testPedirDecimales() {
		String mensaje = "Introduce un numero decimal";
		float min = 2;
		float max = 20;

		float resultado = PedirDatos.pedirDecimales(min, max, mensaje);

		assertEquals(4, resultado, 20);
	}

	@Test
	void testPedirNumero() {
		String mensaje = "Introduce un numero entero";
		int min = 1;
		int max = 20;

		int resultado = PedirDatos.pedirNumero(min, max, mensaje);

		assertEquals(1, resultado);
	}

}
