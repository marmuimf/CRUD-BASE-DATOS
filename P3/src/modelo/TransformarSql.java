package modelo;

/**
 * @author Marta Muelas
 * @version 1
 * @since 06/05/2023
 */
public class TransformarSql {

	/**
	 * Metodo que recibe un perro y devuelve una sentencia SQL para añadir
	 * 
	 * @param miPerro es un objeto de la clase perro
	 */
	public static String perroASql(Perro miPerro) {

		// INSERT INTO Perro (raza, color, peso) VALUES ('" + + "', '"++"', "++");

		return "INSERT INTO Perro (raza, color, peso) VALUES ('" + miPerro.getRaza() + "', '" + miPerro.getColor()
				+ "', " + miPerro.getPeso() + ")";
	}

	/**
	 * Metodo que recibe un perro y un id y devuelve una sentencia SQL para
	 * modificar
	 * 
	 * @param miPerro es un objeto de la clase perro
	 * @param id      es el atributo id del objeto perro
	 */
	public static String updatePerro(Perro miPerro, int id) {

		// "UPDATE perro SET raza='" + miPerro.getRaza() + "', color='" +
		// miPerro.getColor() + "', peso=" + miPerro.getPeso() + " WHERE id=" + id;

		return "UPDATE perro SET raza='" + miPerro.getRaza() + "', color='" + miPerro.getColor() + "', peso="
				+ miPerro.getPeso() + " WHERE idPerro=" + id;
	}

	/**
	 * Metodo que recibe un perro y un id y devuelve una sentencia SQL para borrar
	 * 
	 * @param id es el atributo id del objeto perro
	 */
	public static String deletePerro(int id) {

		// DELETE FROM perros WHERE id = 5;

		return "DELETE FROM perro WHERE idPerro=" + id;
	}

	/**
	 * Metodo que recibe una cadena y devuelve una sentencia SQL para mostrar datos
	 * segun la raza indicada
	 * 
	 * @param raza es el atributo raza del objeto perro
	 */
	public static String selectRazaSql(String raza) {

		return "SELECT * FROM perro WHERE raza='" + raza + "'";
	}

	/**
	 * Metodo que recibe una cadena y devuelve una sentencia SQL para mostrar datos
	 * segun el color indicado
	 * 
	 * @param color es el atributo color del objeto perro
	 */
	public static String selectColorSql(String color) {

		return "SELECT * FROM perro WHERE color='" + color + "'";
	}

	/**
	 * Metodo que recibe una cadena y devuelve una sentencia SQL para mostrar datos
	 * segun el peso indicado
	 * 
	 * @param peso es el atributo peso del objeto perro
	 */
	public static String selectPesoSql(float peso) {

		return "SELECT * FROM perro WHERE peso=" + peso;
	}
}
