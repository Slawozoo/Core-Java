package com.daojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class IAuthorDAOImpl implements IAuthorDao{

	/*Create table*/
	@Override
	public void createTableSql(Connection conn) {
		//System.out.println(createTableSQL);
        // Step 1: Establishing a Connection
        try {
        //Connection connection = DriverManager.getConnection(url, user, password);

            // Step 2:Create a statement using connection object
            Statement statement = conn.createStatement(); 
        

            // Step 3: Execute the query or update query
            statement.execute(SqlCommands.getCreatetablesql());
            
            System.out.println("table created sucessfully");
        } catch (SQLException e) {
        	e.printStackTrace();
            // print SQL exception information
            //printSQLException(e);
        }
	}
	
	/* Insert into table command */
	@Override
	public void insertIntoTable(Connection con) {
		Author author = new Author();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter first name of author: ");
		author.setfName(scn.next());
		System.out.print("Enter last name of author: ");
		author.setlName(scn.next());
		System.out.print("Enter email of author: ");
		author.setEmail(scn.next());
		System.out.print("Enter address of author: ");
		author.setAddress(scn.next());
		System.out.print("Enter institution of author: ");
		author.setInstitution(scn.next());

		long id;
		try {
			PreparedStatement prepStmt = con.prepareStatement(SqlCommands.getInsertIntoTableSQL());

			prepStmt.setString(1, author.getfName());
			prepStmt.setString(2, author.getlName());
			prepStmt.setString(3, author.getAddress());
			prepStmt.setString(4, author.getInstitution());
			prepStmt.setString(5, author.getEmail());

			int rows = prepStmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Inserted data sucessfully");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* Retrieve all record from table command */
	@Override
	public  void selectAllQuery(Connection con) {

		try {

			Statement statement = con.createStatement();
			// PreparedStatement statement = con.prepareStatement(retrieveAllSQL);
			ResultSet result = statement.executeQuery(SqlCommands.getRetrieveallsql());

			System.out.println("ID\t\tFName\t\tLName\t\tEmail\t\tAddress\t\tInstitution");
			while (result.next()) {
				int id = result.getInt("id");
				String fName = result.getString("first_name");
				String lName = result.getString("last_name");
				String address = result.getString("address");
				String email = result.getString("email");
				String institution = result.getString("institution");

				System.out.printf("%d\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", id, fName, lName, email, address, institution);
				// System.out.println(id+"\t"+fName+"\t"+lName+"\t"+email+"\t"+address+"\t"+institution);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* Retrieve record from table using condition */
	@Override
	public void selectQuery(Connection con) {

		try {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter the id to search author: ");
			int idSearch = scn.nextInt();
			// Statement statement = con.createStatement();
			PreparedStatement statement = con.prepareStatement(SqlCommands.getRetrievesql());
			statement.setInt(1, idSearch);

			ResultSet result = statement.executeQuery();

			System.out.println("ID\tFName\tLName\t\tEmail\t\tAddress\t\tInstitution");
			while (result.next()) {
				int id = result.getInt("id");
				String fName = result.getString("first_name");
				String lName = result.getString("last_name");
				String address = result.getString("address");
				String email = result.getString("email");
				String institution = result.getString("institution");

				System.out.printf("%d\t%s\t%s\t\t%s\t\t%s\t\t%s\n", id, fName, lName, email, address, institution);
				// System.out.println(id+"\t"+fName+"\t"+lName+"\t"+email+"\t"+address+"\t"+institution);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* Update record from table using condition */
	@Override
	public void updateTable(Connection con) {

		int result = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the id to search author: ");
		int idSearch = scn.nextInt();
		System.out.println("Name of institution to be changed: ");
		String updateInstitution = scn.next();

		PreparedStatement statement;
		try {
			statement = con.prepareStatement(SqlCommands.getUpdaterecordsql());
			statement.setString(1, updateInstitution);
			statement.setInt(2, idSearch);
			statement.executeUpdate();
			System.out.println("update sucessfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	/* Delete record from table using condition */
	@Override
	public void deleteData(Connection con) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the id to be deleted: ");
		int idSearch = scn.nextInt();
		try {
			PreparedStatement prepStatement = con.prepareStatement(SqlCommands.getDeleterecordsql());
			prepStatement.setInt(1, idSearch);
			
			prepStatement.executeUpdate();
			System.out.println("Deleted data sucessfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
