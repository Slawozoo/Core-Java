package com.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RetrieveDataTable {

	private static final String retrieveSQL = "SELECT * FROM authors WHERE id=?";
	private static  final String retrieveAllSQL = "SELECT * FROM authors";

	public static void selectQuery(Connection con) {
		
		try {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter the id to search author: ");
			int idSearch = scn.nextInt();
			//Statement statement = con.createStatement();
			PreparedStatement statement = con.prepareStatement(retrieveSQL);
			statement.setInt(1, idSearch);
			
			ResultSet result = statement.executeQuery();
			
			System.out.println("ID\tFName\tLName\t\tEmail\t\tAddress\t\tInstitution");
			while(result.next()) {
				int id = result.getInt("id");
				String fName = result.getString("first_name");
				String lName = result.getString("last_name");
				String address = result.getString("address");
				String email = result.getString("email");
				String institution = result.getString("institution");
				
				System.out.printf("%d\t%s\t%s\t\t%s\t\t%s\t\t%s\n" ,id,fName,lName,email,address,institution);
				//System.out.println(id+"\t"+fName+"\t"+lName+"\t"+email+"\t"+address+"\t"+institution);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		//For select all query
		public static void selectAllQuery(Connection con) {
			
			try {
				
				Statement statement = con.createStatement();
				//PreparedStatement statement = con.prepareStatement(retrieveAllSQL);
				ResultSet result = statement.executeQuery(retrieveAllSQL);
				
				System.out.println("ID\t\tFName\t\tLName\t\tEmail\t\tAddress\t\tInstitution");
				while(result.next()) {
					int id = result.getInt("id");
					String fName = result.getString("first_name");
					String lName = result.getString("last_name");
					String address = result.getString("address");
					String email = result.getString("email");
					String institution = result.getString("institution");
					
					System.out.printf("%d\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n" ,id,fName,lName,email,address,institution);
					//System.out.println(id+"\t"+fName+"\t"+lName+"\t"+email+"\t"+address+"\t"+institution);
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
