package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author Marta Muelas
 * @version 1
 * @since 06/05/2023
 */
public class BaseDatos {

	/**
	 * Metodo para ejecutar una sentencia SQL
	 * 
	 * @param sql es la senencia SQL que recibira la base de datos
	 *
	 */
	public static void ejecutarSql(String sql) {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		int resultado = 0;

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver"); //direcc BD, usuario admin, contraseña
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/perros", "root", "");

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			//metodo executeUpdate permite sentencias insert, update, detele
			resultado = sentenciaSQL.executeUpdate(sql); // ya no es executeQuery(select)

			// en sql al insertar, me dice el numero de filas que han sido modificadas.
			if (resultado >= 1) {
				System.out.println("Operacion realizada");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Conectado/desconectado");

	}

	/**
	 * Metodo para hacer una consulta SQL
	 * 
	 * @param sql es la senencia SQL que recibira la base de datos
	 *
	 */
	public static void query(String sql) {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/perros", "root", "");

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.
				System.out.println("raza: " + rs.getString("raza") + " - color: " +rs.getString("color")+" - peso: " +rs.getInt("peso"));
			}

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Conectado/desconectado");

	}

}
