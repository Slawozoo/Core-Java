package com.postgresql;

public class SqlCommands {

	//create table command
	private static final String createTableSQL = "CREATE TABLE authors " + "(id INT  NOT NULL PRIMARY KEY ,"
			+ " first_name TEXT NOT NULL, " + " last_name TEXT NOT NULL, " + " address TEXT NOT NULL, "
			+ " institution TEXT NOT NULL, " + " email TEXT NOT NULL )";
	
	//insert into table command
	private static String insertIntoTableSQL = "INSERT INTO authors(first_name, last_name, address,  institution, email )"
			+ "VALUES(?,?,?,?,?)";
	
	//retrieve record using condition
	private static final String retrieveSQL = "SELECT * FROM authors WHERE id=?";
	
	//retrieve record from db
	private static final String retrieveAllSQL = "SELECT * FROM authors";
	
	//update record
	private static final String updateRecordSQL = "UPDATE authors SET institution = ? WHERE id = ?";
	
	//delete record
	private static final String deleteRecordSQL = "DELETE from authors WHERE id = ?";

	public static String getCreatetablesql() {
		return createTableSQL;
	}

	public static String getInsertIntoTableSQL() {
		return insertIntoTableSQL;
	}

	public static String getRetrievesql() {
		return retrieveSQL;
	}

	public static String getRetrieveallsql() {
		return retrieveAllSQL;
	}

	public static String getUpdaterecordsql() {
		return updateRecordSQL;
	}

	public static String getDeleterecordsql() {
		return deleteRecordSQL;
	}
	
	
	
}
