package com.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	private static final String createTableSQL = "CREATE TABLE authors " +
	        "(id INT  NOT NULL PRIMARY KEY ," +
	        " first_name TEXT NOT NULL, " +
	        " last_name TEXT NOT NULL, " +
	        " address TEXT NOT NULL, " +
	        " institution TEXT NOT NULL, " +
	        " email TEXT NOT NULL )";

	public static void createTableSql(Connection conn) throws SQLException{
		//System.out.println(createTableSQL);
        // Step 1: Establishing a Connection
        try {
        //Connection connection = DriverManager.getConnection(url, user, password);

            // Step 2:Create a statement using connection object
            Statement statement = conn.createStatement(); 
        

            // Step 3: Execute the query or update query
            statement.execute(createTableSQL);
            
            System.out.println("table created sucessfully");
        } catch (SQLException e) {
        	e.printStackTrace();
            // print SQL exception information
            //printSQLException(e);
        }
	}
	
}
