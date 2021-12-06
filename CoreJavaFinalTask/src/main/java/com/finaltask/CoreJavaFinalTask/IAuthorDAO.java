package com.finaltask.CoreJavaFinalTask;

import java.sql.Connection;
import java.util.List;

import org.json.simple.JSONArray;

public interface IAuthorDAO {

	/*Create Author table*/
	public void createAuthorTableSql(Connection con);
	public void insertAuthorTableSql(Connection con, List<Author> authorList, int id, List<Article> articleList);
	
	public void retrieveAuthorTable(Connection con);
	
	//Insert into Author table by user input
	public void insertAuthorTableSql(Connection con, List<Author> authorList,Article article);
	
	//Retrieve from author table using article_id
	public void retrieveAuthorTableByTitle(Connection con, int id);
	
	//Delete author from article_id
	public void deleteAuthorByTitle(Connection con, int id);
	
	//Write author in JSON file
	public List<Author> generateAuthorList(Connection con, int id);
	
	public JSONArray writeJsonAuthor(List<Author> authorList);
}