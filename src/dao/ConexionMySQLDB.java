package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConexionMySQLDB {

	default Connection getConexion() {
		
		String DRIVER = "com.mysql.cj.jdbc.Driver";

		String URL = "jdbc:mysql://localhost:3306/peliculas";

		Connection conexion = null;

		try {
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(URL, "root", "030818");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conexion;

	}

}
