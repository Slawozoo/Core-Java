package com.daojdbc;

import java.sql.Connection;

public interface IAuthorDao {
	
	public  void createTableSql(Connection conn);
	public  void insertIntoTable(Connection con);
	public  void selectAllQuery(Connection con);
	public  void selectQuery(Connection con);
	public  void updateTable(Connection con);
	public  void deleteData(Connection con);
	

}
