package com.finaltask.CoreJavaFinalTask;

import java.sql.Connection;
import java.util.List;

public interface IArticleDao {

	//public void getUserInput();
	public void createArticleTableSql(Connection conn);
	public void insertIntoTable(Connection con, List<Article> articleList);
	public int selectIDConditionTitle(Connection con, int id,List<Article> articleList);
	public void retrieveArticleTable(Connection con);
	
	//User input and insert into table
	public void insertIntoTable(Connection con);
	
	//Search and extract using Article title
	public void retrieveArticleByTitle(Connection con);
	
	//Search and extract using Author detail
	public void retrieveArticleByAuthorEmail(Connection con);
	
	//Delete article
	public void deleteArticleByTitle(Connection con);
	
	//Delete article by author detail
	public void deleteArticleByAuthorEmail(Connection con);
	
	//Wrtie article into file
	public List<Article> generateArticle(Connection con);
	public void writeJsonFIle(List<Article> articleList);
}
