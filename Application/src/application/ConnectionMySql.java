package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySql {

	public Connection cn = null;

	public static Connection connexionDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
			System.out.println("Connection ok");
			return cn;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("connection failed");
			return null;
		}

	}
}
