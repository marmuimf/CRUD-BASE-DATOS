package modelo;

public class TransformarSql {

	// metodo q reciba el perro y devuelva el sql
	public static String perroASql(Perro miPerro) {

		// INSERT INTO Perro (raza, color, peso) VALUES ('" + + "', '"++"', "++");

		return "INSERT INTO Perro (raza, color, peso) VALUES ('" + miPerro.getRaza() + "', '" + miPerro.getColor()
				+ "', " + miPerro.getPeso() + ")";
	}

	public static String updatePerro(Perro miPerro, int id) {

		// "UPDATE perro SET raza='" + miPerro.getRaza() + "', color='" +
		// miPerro.getColor() + "', peso=" + miPerro.getPeso() + " WHERE id=" + id;

		return "UPDATE perro SET raza='" + miPerro.getRaza() + "', color='" + miPerro.getColor() + "', peso="
				+ miPerro.getPeso() + " WHERE idPerro=" + id;
	}

	public static String deletePerro(int id) {

		// DELETE FROM perros WHERE id = 5;

		return "DELETE FROM perro WHERE idPerro=" + id;
	}

	public static String selectRazaSql(String raza) {

		return "SELECT * FROM perro WHERE raza='" + raza + "'";
	}

	public static String selectColorSql(String color) {

		return "SELECT * FROM perro WHERE color='" + color + "'";
	}

	public static String selectPesoSql(float peso) {

		return "SELECT * FROM perro WHERE peso=" + peso;
	}
}
