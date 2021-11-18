package com.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTable {
	private static  String insertIntoTableSQL = "INSERT INTO authors(first_name, last_name, address,  institution, email )"+
			"VALUES(?,?,?,?,?)";
	
	public static void insertIntoTable(Connection con) {
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
		
		/*Static insertion in database	*/
		//		String insertIntoTableSQL = "INSERT INTO authors(first_name, last_name, address,  institution, email )"+
//				"VALUES('Ramesh','shrestha','Bhaktapur','Orgware','ramesh.shrestha@gmail.com')";
//		
//		try {
//			Statement statement = con.createStatement();
//			
//			int rows = statement.executeUpdate(insertIntoTableSQL);
//			if(rows>0) {
//				System.out.println("Inserted data sucessfully");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		long id;
		try {
			PreparedStatement prepStmt = con.prepareStatement(insertIntoTableSQL);
			
			prepStmt.setString(1, author.getfName());
			prepStmt.setString(2, author.getlName());
			prepStmt.setString(3, author.getAddress());
			prepStmt.setString(4, author.getInstitution());
			prepStmt.setString(5, author.getEmail());
			
			int rows = prepStmt.executeUpdate();
			if(rows>0) {
				System.out.println("Inserted data sucessfully");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
