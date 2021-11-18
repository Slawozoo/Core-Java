package com.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataTable {
	private static final String updateSQL = "UPDATE authors SET institution = ? WHERE id = ?";
	
	public static void updateTable(Connection con) {
		
		int result = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the id to search author: ");
		int idSearch = scn.nextInt();
		System.out.println("Name of institution to be changed: ");
		String updateInstitution = scn.next();
		
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(updateSQL);
			statement.setString(1, updateInstitution);
			statement.setInt(2, idSearch);
			statement.executeUpdate();
			System.out.println("update sucessfully");
			
			
			 // set input values and execute query
//	         if(statement != null) {
//	           // set input values to query parameters
//	           statement.setString(1, updateInstitution);
//	          statement.setInt(2, idSearch);
//	           // execute the query
//	           result = statement.executeUpdate();
//	         }
//
//	         // process the result
//	         if(result == 0)
//	           System.out.println("Records not updated");
//	         else
//	           System.out.println("Records updated"+
//	                                " successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
