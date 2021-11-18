package com.postgresqltutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	private final String url = "jdbc:postgresql://localhost/db_App";
	private final String user = "postgres";
	private final String password = "admin123";

	public Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully.");
			conn.close();
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	public static void main(String[] args) {
		App app = new App();
		app.connect();

	}

}
