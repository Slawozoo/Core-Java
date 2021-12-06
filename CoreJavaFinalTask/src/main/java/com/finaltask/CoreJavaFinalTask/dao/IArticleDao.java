package com.finaltask.corejavafinaltask.dao;

import java.sql.Connection;
import java.util.List;

import com.finaltask.corejavafinaltask.domain.*;

public interface IArticleDao {

	/**
	 * Create Article table in DB
	 */
	public void createArticleTableSql(Connection conn);
	
	/**
	 * Insert into article table from file
	 */
	public void insertIntoTable(Connection con, List<Article> articleList);
	
	/**
	 * Returns article ID using article title
	 */
	public int selectIDConditionTitle(Connection con, int id,List<Article> articleList);
	
	/**
	 * Retrieve Article Table
	 */
	public void retrieveArticleTable(Connection con);
	
	/**
	 * Insert into Article table from user input
	 */
	public void insertIntoTable(Connection con);

	/**
	 * Search and extract using Article title
	 */
	public void retrieveArticleByTitle(Connection con);
	
	/**
	 * Search and extract using Author detail
	 */
	public void retrieveArticleByAuthorEmail(Connection con);

	/**
	 * Delete article using article title
	 */
	public void deleteArticleByTitle(Connection con);
	
	/**
	 * Delete article by author detail
	 */
	public void deleteArticleByAuthorEmail(Connection con);
	
	/**
	 * Converting DB table into List<Article>
	 */
	public List<Article> generateArticle(Connection con);
	
	/**
	 *Write articleList into JsonFile
	 */
	public void writeJsonFile(List<Article> articleList);
}
