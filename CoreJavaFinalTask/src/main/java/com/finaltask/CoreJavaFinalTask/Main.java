package com.finaltask.CoreJavaFinalTask;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Main {
	private final static String url = "jdbc:postgresql://localhost/db_App";
	private final static String user = "postgres";
	private final static String password = "admin123";

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		System.out.println("Enter the case you want to perform: ");
		
		System.out.println("1. Download File from URL");
		System.out.println("2. Read Download File and store in Database");
		System.out.println("3. Display data stored in the database table");
		System.out.println("4. Article details from user and Insert in database");
		System.out.println("5. Search and export Article from database using article title");
		System.out.println("6. Search and export Article from database using author email");
		System.out.println("7. Delete Article form the database using article title");
		System.out.println("8. Delete Article from the database written by an author");
		System.out.println("9. Export All data from database into a file");
		int switchCase = scn.nextInt();
		try {
			//Connect to database
			Connection con = DriverManager.getConnection(url, user, password);
//			System.out.println("data base connected successfully");
			IArticleDao articleDao = new ArticleDaoImpl();
			switch(switchCase) {
			case 1:
				// Download file from URL
				DownloadFile downloadFile = new DownloadFile();
				downloadFile.downloadFile();
				break;
			case 2:
				//File from the downloaded URL
				File file = new File("Article.json");
				
				//Reading JSON file
				IArticleOperations articleOperations = new ArticleOperationsImpl();
				List<Article> articleList = articleOperations.readFile(file);
				
				//Create article table
//				IArticleDao articleDAO = new ArticleDaoImpl();
//				articleDAO.createArticleTableSql(con);
				
				//Create author tables
//				IAuthorDAO authorDAO = new AuthorDAOImpl();
//				authorDAO.createAuthorTableSql(con);
				
				//Insert into table from file
				articleDao.insertIntoTable(con,articleList);
				
				break;
				
			case 3:
				//Retrieve all article from database
				articleDao.retrieveArticleTable(con);
				break;
				
			case 4:
				//Insert into table from user input
				articleDao.insertIntoTable(con);
				break;
				
			case 5:
				//Retrieve article using title
				articleDao.retrieveArticleByTitle(con);
				break;
				
			case 6:
				//Retrieve article using author Detail
				articleDao.retrieveArticleByAuthorEmail(con);
				break;
				
			case 7:
				//Delete article by title
				articleDao.deleteArticleByTitle(con);
				break;
				
			case 8:
				//Delete article by author detail
				articleDao.deleteArticleByAuthorEmail(con);
				break;
				
			case 9:	
				List<Article> articleLists = articleDao.generateArticle(con);
				articleDao.writeJsonFIle(articleLists);
				break;
				
			default:
				System.out.println("Enter valid case....");
				
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
