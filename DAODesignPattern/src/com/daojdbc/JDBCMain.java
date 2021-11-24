package com.daojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMain {
	private final static String url = "jdbc:postgresql://localhost/db_App";
	private final static String user = "postgres";
	private final static String password = "admin123";

	public static void main(String[] args) {
			
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			// System.out.println("data base connected successfully");
			IAuthorDao authorDBUtils = new IAuthorDAOImpl();
			System.out.print("Type the case you want to continue: ");
			System.out.println(
					"\nInsert(insert) : \nRetrieve(retrieve) : \nRetrieve all(retrieveall) : \nUpdate(update) : \nDelete(delete) :\n");
			Scanner scn = new Scanner(System.in);
			String cases = scn.next();
			// Create table in database db_App tablename authors password: admin123
			// CreateTable.createTableSql(con);
			//authorDBUtils.createTableSql(conn);

			switch (cases) {
			case "insert":
				// Insert in database db_App tablename authors
				//InsertTable.insertIntoTable(con);
				authorDBUtils.insertIntoTable(con);
				break;

			case "retrieve":
				// Select from database db_App tablename authors
				//RetrieveDataTable.selectQuery(con);
				authorDBUtils.selectQuery(con);
				break;

			case "retrieveall":
				// Select from database db_App tablename authors
				//RetrieveDataTable.selectAllQuery(con);
				authorDBUtils.selectAllQuery(con);
				//foreach()
				break;
				

			case "delete":
				// Delete from database db_App tablename authors
				//DeleteDataTable.deleteData(con);
				//System.out.println("Delete record from database");
				authorDBUtils.deleteData(con);
				break;

			case "update":
				// Update from database db_App tablename authors
				//UpdateDataTable.updateTable(con);
				authorDBUtils.updateTable(con);
				//System.out.println("Update sucessful");
				break;

			default:
				System.out.println("No match found!!!!!!!");
			}
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
