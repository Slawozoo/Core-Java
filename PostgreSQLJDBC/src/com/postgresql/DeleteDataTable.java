package com.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataTable {

	private static final String updateSQL = "DELETE from authors WHERE id = ?";
	
	public static void deleteData(Connection con) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the id to be deleted: ");
		int idSearch = scn.nextInt();
		try {
			PreparedStatement prepStatement = con.prepareStatement(updateSQL);
			prepStatement.setInt(1, idSearch);
			
			prepStatement.executeUpdate();
			System.out.println("Deleted data sucessfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
