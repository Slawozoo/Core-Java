package com.finaltask.corejavafinaltask.dao;

import java.sql.Connection;
import java.util.List;

import org.json.simple.JSONArray;

import com.finaltask.corejavafinaltask.domain.*;
public interface IAuthorDAO {

	/**
	 * Create Author table
	 */
	public void createAuthorTable(Connection con);
	
	/**
	 * Read from file and insert into DB  author table
	 */
	public void insertAuthorTable(Connection con, List<Author> authorList, int id, List<Article> articleList);
	
	/**
	 * Retrieve from author table
	 */
	public void retrieveAuthorTable(Connection con);
	
	/**
	 * User input and insert into Author table
	 */
	public void insertAuthorTableSql(Connection con, List<Author> authorList,Article article);
	
	/**
	 * Retrieve author by Article title
	 */
	public void retrieveAuthorTableByTitle(Connection con, int id);
	
	/**
	 *Delete Author using article title
	 */
	public void deleteAuthorByTitle(Connection con, int id);
	
	/**
	 * Generate Author List from Author table
	 */
	public List<Author> generateAuthorList(Connection con, int id);
	
	/**
	 * Write Author list into Json Array
	 */
	public JSONArray writeJsonAuthor(List<Author> authorList);
}