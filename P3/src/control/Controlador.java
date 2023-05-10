package control;

import datos.BaseDatos;
import modelo.Perro;
import modelo.TransformarSql;
import usuario.Menu;
import usuario.PedirDatos;

/**
 * @author Marta Muelas
 * @version 1
 * @since 06/05/2023
 */
public class Controlador {

	/**
	 * Programa para guardar razas, color y peso de perros en una base de datos.
	 * Aparece un menu que pide al usuario la accion a realizar. Se repite el menu
	 * hasta que se decida terminar.
	 * 
	 * @param args recibe datos
	 */
	public static void main(String[] args) {

		int opcion = 0;

		// listaMisPerros.addPerro(new Perro("BullDog", "Negro", 12));

		do {
			Menu.mostrar();
			// el metodo pedir datos me devuelve un num que almacenamos
			opcion = PedirDatos.pedirNumero(1, 8, "Introduce una opcion del menu");
			
			if (opcion >= 1 && opcion <= 7) {// es valido// compruebo
				procesarOpcion(opcion);

			}
		} while (opcion != 8);

		System.out.println("fin del programa");

	}

	/**
	 * Metodo para procesar la opcion que introduce el usuario
	 * 
	 * @param opcion es el numero que introduce el usuario por consola
	 *
	 */
	private static void procesarOpcion(int opcion) {

		int id = 0;
		String raza = "";
		String color = "";
		float peso = 0;

		Perro perroNew;

		switch (opcion) {
		case 1:// mostrar
			String sql = "SELECT * FROM perro";
			BaseDatos.query(sql);

			break;
		case 2:// añadir
			Perro miPerro = PedirDatos.pedirPerro();
			String insert = TransformarSql.perroASql(miPerro);
			BaseDatos.ejecutarSql(insert);

			break;
		case 3:// modificar
			id = PedirDatos.pedirNumero(1, 1000, "Introduce el id del perro a modificar");
			perroNew = PedirDatos.pedirPerro();
			String update = TransformarSql.updatePerro(perroNew, id);
			BaseDatos.ejecutarSql(update);

			break;
		case 4:// eliminar
			id = PedirDatos.pedirNumero(1, 1000, "Introduce el id del perro a borrar");
			String delete = TransformarSql.deletePerro(id);
			BaseDatos.ejecutarSql(delete);

			break;
		case 5:// buscar por raza SELECT
			raza = PedirDatos.pedirCadena("Introduce la raza a buscar:", 4);
			String razaBuscar = TransformarSql.selectRazaSql(raza);
			BaseDatos.query(razaBuscar);

			break;
		case 6:// buscar por color
			color = PedirDatos.pedirCadena("Introduce el color a buscar:", 4);
			String colorBuscar = TransformarSql.selectColorSql(color);
			BaseDatos.query(colorBuscar);
			break;

		case 7:// buscar por peso
			peso = PedirDatos.pedirDecimales(0f, 100f, "Introduce el peso a buscar:");
			String pesoBuscar = TransformarSql.selectPesoSql(peso);
			BaseDatos.query(pesoBuscar);
			break;
		}
	}
}
